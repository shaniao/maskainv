package com.mask.hrs.ws;

import com.hrs.ws.HRSServiceCallbackHandler;
import com.hrs.ws.HRSServiceStub.CiCompanyCostCentersResponse;
import com.hrs.ws.HRSServiceStub.CiCompanyLocationsResponse;
import com.hrs.ws.HRSServiceStub.CiLastProfileUpdateResponse;
import com.hrs.ws.HRSServiceStub.CiLayoutResponse;
import com.hrs.ws.HRSServiceStub.CiPriceLimitResponse;
import com.hrs.ws.HRSServiceStub.CiPropertiesResponse;
import com.hrs.ws.HRSServiceStub.ConstantTypeValuesResponse;
import com.hrs.ws.HRSServiceStub.ConstantTypesResponse;
import com.hrs.ws.HRSServiceStub.HotelAvailResponse;
import com.hrs.ws.HRSServiceStub.HotelDetailAvailResponse;
import com.hrs.ws.HRSServiceStub.HotelDetailSearchResponse;
import com.hrs.ws.HRSServiceStub.HotelReservationCancellationResponse;
import com.hrs.ws.HRSServiceStub.HotelReservationInformationResponse;
import com.hrs.ws.HRSServiceStub.HotelReservationModificationResponse;
import com.hrs.ws.HRSServiceStub.HotelReservationResponse;
import com.hrs.ws.HRSServiceStub.HotelSearchResponse;
import com.hrs.ws.HRSServiceStub.HotelTeaserAvailResponse;
import com.hrs.ws.HRSServiceStub.HotelTeaserPricesResponse;
import com.hrs.ws.HRSServiceStub.LocationSearchResponse;
import com.hrs.ws.HRSServiceStub.MiceHotelDetailSearchResponse;
import com.hrs.ws.HRSServiceStub.MiceHotelRFPInformationResponse;
import com.hrs.ws.HRSServiceStub.MiceHotelRFPResponse;
import com.hrs.ws.HRSServiceStub.MiceHotelReservationResponse;
import com.hrs.ws.HRSServiceStub.MiceHotelSearchResponse;
import com.hrs.ws.HRSServiceStub.MyHRSHotelFavoritesResponse;
import com.hrs.ws.HRSServiceStub.MyHRSHotelReservationHistoryResponse;
import com.hrs.ws.HRSServiceStub.MyHRSHotelReservationProfilesResponse;
import com.hrs.ws.HRSServiceStub.MyHRSUserAccountResponse;
import com.hrs.ws.HRSServiceStub.PingResponse;
import com.hrs.ws.HRSServiceStub.VersionResponse;

public class HRSCallbackHandler extends HRSServiceCallbackHandler {
	public HRSCallbackHandler() {
		super();
	}

	public HRSCallbackHandler(Object clientData) {
		super(clientData);
	}

	@Override
	public Object getClientData() {
		// TODO Auto-generated method stub
		return super.getClientData();
	}

	@Override
	public void receiveErrorciCompanyCostCenters(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorciCompanyCostCenters(e);
	}

	@Override
	public void receiveErrorciCompanyLocations(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorciCompanyLocations(e);
	}

	@Override
	public void receiveErrorciLastProfileUpdate(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorciLastProfileUpdate(e);
	}

	@Override
	public void receiveErrorciLayout(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorciLayout(e);
	}

	@Override
	public void receiveErrorciPriceLimit(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorciPriceLimit(e);
	}

	@Override
	public void receiveErrorciProperties(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorciProperties(e);
	}

	@Override
	public void receiveErrorconstantTypes(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorconstantTypes(e);
	}

	@Override
	public void receiveErrorconstantTypeValues(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorconstantTypeValues(e);
	}

	@Override
	public void receiveErrorhotelAvail(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorhotelAvail(e);
	}

	@Override
	public void receiveErrorhotelDetailAvail(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorhotelDetailAvail(e);
	}

	@Override
	public void receiveErrorhotelDetailSearch(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorhotelDetailSearch(e);
	}

	@Override
	public void receiveErrorhotelReservation(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorhotelReservation(e);
	}

	@Override
	public void receiveErrorhotelReservationCancellation(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorhotelReservationCancellation(e);
	}

	@Override
	public void receiveErrorhotelReservationInformation(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorhotelReservationInformation(e);
	}

	@Override
	public void receiveErrorhotelReservationModification(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorhotelReservationModification(e);
	}

	@Override
	public void receiveErrorhotelSearch(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorhotelSearch(e);
	}

	@Override
	public void receiveErrorhotelTeaserAvail(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorhotelTeaserAvail(e);
	}

	@Override
	public void receiveErrorhotelTeaserPrices(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorhotelTeaserPrices(e);
	}

	@Override
	public void receiveErrorlocationSearch(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorlocationSearch(e);
	}

	@Override
	public void receiveErrormiceHotelDetailSearch(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrormiceHotelDetailSearch(e);
	}

	@Override
	public void receiveErrormiceHotelReservation(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrormiceHotelReservation(e);
	}

	@Override
	public void receiveErrormiceHotelRFP(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrormiceHotelRFP(e);
	}

	@Override
	public void receiveErrormiceHotelRFPInformation(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrormiceHotelRFPInformation(e);
	}

	@Override
	public void receiveErrormiceHotelSearch(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrormiceHotelSearch(e);
	}

	@Override
	public void receiveErrormyHRSHotelFavorites(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrormyHRSHotelFavorites(e);
	}

	@Override
	public void receiveErrormyHRSHotelReservationHistory(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrormyHRSHotelReservationHistory(e);
	}

	@Override
	public void receiveErrormyHRSHotelReservationProfiles(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrormyHRSHotelReservationProfiles(e);
	}

	@Override
	public void receiveErrormyHRSUserAccount(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrormyHRSUserAccount(e);
	}

	@Override
	public void receiveErrorping(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorping(e);
	}

	@Override
	public void receiveErrorversion(Exception e) {
		// TODO Auto-generated method stub
		super.receiveErrorversion(e);
	}

	@Override
	public void receiveResultciCompanyCostCenters(
			CiCompanyCostCentersResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultciCompanyCostCenters(result);
	}

	@Override
	public void receiveResultciCompanyLocations(
			CiCompanyLocationsResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultciCompanyLocations(result);
	}

	@Override
	public void receiveResultciLastProfileUpdate(
			CiLastProfileUpdateResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultciLastProfileUpdate(result);
	}

	@Override
	public void receiveResultciLayout(CiLayoutResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultciLayout(result);
	}

	@Override
	public void receiveResultciPriceLimit(CiPriceLimitResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultciPriceLimit(result);
	}

	@Override
	public void receiveResultciProperties(CiPropertiesResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultciProperties(result);
	}

	@Override
	public void receiveResultconstantTypes(ConstantTypesResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultconstantTypes(result);
	}

	@Override
	public void receiveResultconstantTypeValues(
			ConstantTypeValuesResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultconstantTypeValues(result);
	}

	@Override
	public void receiveResulthotelAvail(HotelAvailResponse result) {
		// TODO Auto-generated method stub
		super.receiveResulthotelAvail(result);
	}

	@Override
	public void receiveResulthotelDetailAvail(HotelDetailAvailResponse result) {
		// TODO Auto-generated method stub
		super.receiveResulthotelDetailAvail(result);
	}

	@Override
	public void receiveResulthotelDetailSearch(HotelDetailSearchResponse result) {
		// TODO Auto-generated method stub
		super.receiveResulthotelDetailSearch(result);
	}

	@Override
	public void receiveResulthotelReservation(HotelReservationResponse result) {
		// TODO Auto-generated method stub
		super.receiveResulthotelReservation(result);
	}

	@Override
	public void receiveResulthotelReservationCancellation(
			HotelReservationCancellationResponse result) {
		// TODO Auto-generated method stub
		super.receiveResulthotelReservationCancellation(result);
	}

	@Override
	public void receiveResulthotelReservationInformation(
			HotelReservationInformationResponse result) {
		// TODO Auto-generated method stub
		super.receiveResulthotelReservationInformation(result);
	}

	@Override
	public void receiveResulthotelReservationModification(
			HotelReservationModificationResponse result) {
		// TODO Auto-generated method stub
		super.receiveResulthotelReservationModification(result);
	}

	@Override
	public void receiveResulthotelSearch(HotelSearchResponse result) {
		// TODO Auto-generated method stub
		super.receiveResulthotelSearch(result);
	}

	@Override
	public void receiveResulthotelTeaserAvail(HotelTeaserAvailResponse result) {
		// TODO Auto-generated method stub
		super.receiveResulthotelTeaserAvail(result);
	}

	@Override
	public void receiveResulthotelTeaserPrices(HotelTeaserPricesResponse result) {
		// TODO Auto-generated method stub
		super.receiveResulthotelTeaserPrices(result);
	}

	@Override
	public void receiveResultlocationSearch(LocationSearchResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultlocationSearch(result);
	}

	@Override
	public void receiveResultmiceHotelDetailSearch(
			MiceHotelDetailSearchResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultmiceHotelDetailSearch(result);
	}

	@Override
	public void receiveResultmiceHotelReservation(
			MiceHotelReservationResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultmiceHotelReservation(result);
	}

	@Override
	public void receiveResultmiceHotelRFP(MiceHotelRFPResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultmiceHotelRFP(result);
	}

	@Override
	public void receiveResultmiceHotelRFPInformation(
			MiceHotelRFPInformationResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultmiceHotelRFPInformation(result);
	}

	@Override
	public void receiveResultmiceHotelSearch(MiceHotelSearchResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultmiceHotelSearch(result);
	}

	@Override
	public void receiveResultmyHRSHotelFavorites(
			MyHRSHotelFavoritesResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultmyHRSHotelFavorites(result);
	}

	@Override
	public void receiveResultmyHRSHotelReservationHistory(
			MyHRSHotelReservationHistoryResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultmyHRSHotelReservationHistory(result);
	}

	@Override
	public void receiveResultmyHRSHotelReservationProfiles(
			MyHRSHotelReservationProfilesResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultmyHRSHotelReservationProfiles(result);
	}

	@Override
	public void receiveResultmyHRSUserAccount(MyHRSUserAccountResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultmyHRSUserAccount(result);
	}

	@Override
	public void receiveResultping(PingResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultping(result);
	}

	@Override
	public void receiveResultversion(VersionResponse result) {
		// TODO Auto-generated method stub
		super.receiveResultversion(result);
	}
	
}
