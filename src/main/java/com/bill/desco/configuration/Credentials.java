package com.bill.desco.configuration;

import org.springframework.stereotype.Component;

@Component
public class Credentials {
	//*********************Test**************************
	  private String APIBaseURL = "http://103.69.149.45:8080/billpayment/global/";
	  private String redirectURL ="redirect:http://192.168.0.127/SSO/";
	  private String apiUsername ="nbuser";
	  private String apiPassword ="123456";

		public String getAPIBaseURL() {
			return APIBaseURL;
		}
		public String getRedirectURL() {
			return redirectURL;
		}
		public String getApiUsername() {return apiUsername;}
		public String getApiPassword() {return apiPassword;}
}
