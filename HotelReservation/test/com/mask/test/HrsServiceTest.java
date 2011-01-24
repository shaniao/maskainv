package com.mask.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import org.apache.axis2.AxisFault;

import com.hrs.soap.hrs.HRSSimpleServiceStub;
import com.hrs.soap.hrs.HRSSimpleServiceStub.HRSCredentials;
import com.hrs.soap.hrs.HRSSimpleServiceStub.HRSLanguage;
import com.hrs.soap.hrs.HRSSimpleServiceStub.HRSLocale;
import com.hrs.soap.hrs.HRSSimpleServiceStub.HRSLoginRequest;
import com.hrs.soap.hrs.HRSSimpleServiceStub.HRSLoginResponse;
import com.hrs.soap.hrs.HRSSimpleServiceStub.HRSVersionRequest;
import com.hrs.soap.hrs.HRSSimpleServiceStub.HRSVersionResponse;
import com.hrs.soap.hrs.HRSSimpleServiceStub.Login;
import com.hrs.soap.hrs.HRSSimpleServiceStub.LoginResponse;
import com.hrs.soap.hrs.HRSSimpleServiceStub.Version;

import junit.framework.TestCase;

public class HrsServiceTest extends TestCase {

	private static HRSSimpleServiceStub stub;

	private HRSSimpleServiceStub getServiceStub() throws Exception {
		if (this.stub == null) {
			this.stub = new HRSSimpleServiceStub(
					"http://iut-mobile-service.hrs.com:8080/service/hrs/simple/008/HRSSimpleService");
		}
		return this.stub;
	}

	public void getReturn() throws Exception {
//		XMLInputFactory factory = XMLInputFactory.newInstance();
//		try {
//			XMLStreamReader reader = factory
//					.createXMLStreamReader(new FileReader("D:/version.xml"));
//			stub = getServiceStub();
//			while(int line = reader.next()&&line>0){
//				System.out.println(reader);
//			}
//			Version version = Version.Factory.parse(reader);
//			HRSVersionResponse versionResponse = stub.version(version).getVersionResponse();
//			
//			System.out.println(versionResponse.getVersion());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	
	public void loginTest() throws Exception {
		XMLInputFactory factory = XMLInputFactory.newInstance();
		try {
			XMLStreamReader reader = factory
					.createXMLStreamReader(new FileReader("D:/version.xml"));
			stub = getServiceStub();

//			Login login = Login.Factory.parse(reader);
			Login login = new Login();
			HRSLoginRequest request = new HRSLoginRequest();
			HRSCredentials credentials = new HRSCredentials();
			credentials.setClientType("306");
			credentials.setClientKey("1003504001");
			credentials.setClientPassword("pkj97!fxi");
			request.setCredentials(credentials);
			HRSLocale local = new HRSLocale();
			HRSLanguage lang = new HRSLanguage();
			lang.setIso3Language("ENG");
			local.setLanguage(lang);
			local.setIso3Country("ENG");
			local.setIsoCurrency("EUR");
			login.setLoginRequest(request);
			request.setLocale(local);
			HRSLoginResponse loginResponse = stub.login(login).getLoginResponse();
			System.out.println(loginResponse.getSession().getSessionKey());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
