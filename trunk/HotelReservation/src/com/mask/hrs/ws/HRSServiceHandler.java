package com.mask.hrs.ws;

import java.util.Date;

import org.apache.axis2.AxisFault;

import com.hrs.ws.HRSServiceStub;
import com.hrs.ws.HRSServiceStub.HRSCredentials;
import com.hrs.ws.HRSServiceStub.HRSHotelAvailCriterion;
import com.hrs.ws.HRSServiceStub.HRSHotelAvailRequest;
import com.hrs.ws.HRSServiceStub.HRSHotelAvailResponse;
import com.hrs.ws.HRSServiceStub.HRSHotelAvailRoomCriterion;
import com.hrs.ws.HRSServiceStub.HRSHotelRoomType;
import com.hrs.ws.HRSServiceStub.HRSHotelSearchCriterion;
import com.hrs.ws.HRSServiceStub.HRSLanguage;
import com.hrs.ws.HRSServiceStub.HRSLocale;
import com.hrs.ws.HRSServiceStub.HRSLocation;
import com.hrs.ws.HRSServiceStub.HRSLocationCriterion;
import com.hrs.ws.HRSServiceStub.HRSLocationSearchRequest;
import com.hrs.ws.HRSServiceStub.HRSPrice;
import com.hrs.ws.HRSServiceStub.HotelAvail;
import com.hrs.ws.HRSServiceStub.LocationSearch;

public class HRSServiceHandler {
	private static HRSServiceStub STUB;
	public static HRSCredentials CREDENTIAL;
	public static HRSLocale LOCAL;
	static {

		CREDENTIAL = new HRSCredentials();
		CREDENTIAL.setClientType("306");
		CREDENTIAL.setClientKey("1003504001");
		CREDENTIAL.setClientPassword("pkj97!fxi");

		LOCAL = new HRSLocale();
		HRSLanguage lang = new HRSLanguage();
		lang.setIso3Language("ZHO");// 默认中文
		LOCAL.setLanguage(lang);
		LOCAL.setIso3Country("CHN");// 默认中国
		LOCAL.setIsoCurrency("CNY");// 货币单位

		if (STUB == null) {
			try {
				STUB = new HRSServiceStub(
						"http://iut-service.hrs.com:8080/service/hrs/008/HRSService?wsdl");
			} catch (AxisFault e) {
				e.printStackTrace();
			}
		}
	}

	public static HRSLocation[] getLoaclSearch(String destiny) {
		System.out.println("HRSServiceHandler getLoaclSearch start!");
		HRSLocation[] locations = null;
		try {
			LocationSearch locationSearch = new LocationSearch();
			HRSLocationSearchRequest request = new HRSLocationSearchRequest();
			request.setCredentials(CREDENTIAL);
			request.setLocale(LOCAL);
			request.setLocationName(destiny);
			request.setLocationLanguage(LOCAL.getLanguage());
			locationSearch.setLocationSearchRequest(request);
			locations = STUB.locationSearch(locationSearch)
					.getLocationSearchResponse().getLocations();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return locations;
	}
	
	public static HRSHotelAvailResponse getHotelAvail(HRSLocation loaction, String comeTime,
			String leftTime, String singleRooms, String doubleRooms,
			String adult, String child, String hotelName) {
		System.out.println("getHotelAvail start!");
		HRSHotelAvailResponse hotelAvailResponse = null;
		try {
			HotelAvail hotelAvail = new HotelAvail();
			HRSHotelAvailRequest request = new HRSHotelAvailRequest();
			request.setCredentials(CREDENTIAL);
			request.setLocale(LOCAL);
			request.setTimeoutMillis(6000);
			HRSHotelSearchCriterion searchCriterion = new HRSHotelSearchCriterion();
			HRSLocationCriterion locationCriterion = new HRSLocationCriterion();
			locationCriterion.setLocationId(loaction.getLocationId());
			locationCriterion.setPerimeter(1000);
			searchCriterion.setMinCategory(0);
			searchCriterion.setMaxResults(0);
			searchCriterion.setLocationCriterion(locationCriterion);
			HRSHotelAvailCriterion availCriterion = new HRSHotelAvailCriterion();
			Date now = new Date();
			Date to = new Date(now.getTime() + 86400000 * 5);
			HRSPrice max = new HRSPrice();
			max.setAmount(2000000);
			max.setIsoCurrency(LOCAL.getIsoCurrency());
			availCriterion.setMaxPrice(max);
			availCriterion.setFrom(now);
			availCriterion.setTo(to);
			availCriterion
					.setIncludeBreakfastPriceToDetermineCheapestOffer(false);
			HRSHotelAvailRoomCriterion availRoomCriterion = new HRSHotelAvailRoomCriterion();
			availRoomCriterion.setId(1);
			availRoomCriterion.setAdultCount(1);
			HRSHotelRoomType roomType = new HRSHotelRoomType();
			roomType.setHRSHotelRoomType("single");
			availRoomCriterion.setRoomType(roomType);
			HRSHotelAvailRoomCriterion[] availRooms = { availRoomCriterion };
			availCriterion.setRoomCriteria(availRooms);
			request.setAvailCriterion(availCriterion);
			request.setSearchCriterion(searchCriterion);
			hotelAvail.setHotelAvailRequest(request);
			hotelAvailResponse = STUB.hotelAvail(hotelAvail).getHotelAvailResponse();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hotelAvailResponse;
	}
	
}
