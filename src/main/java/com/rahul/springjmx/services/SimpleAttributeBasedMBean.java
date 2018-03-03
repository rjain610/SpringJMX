package com.rahul.springjmx.services;

import org.springframework.stereotype.Service;

@Service("databaseprop")
public class SimpleAttributeBasedMBean {
	
	
	private String URL = "jdbc:mysql://localhost:3306/demo_db";
	private String USER_NAME = "rahul";
	private String PASSWORD = "rootUser";
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	@Override
	public String toString() {
		return "DatabaseProperties [URL=" + URL + ", USER_NAME=" + USER_NAME + ", PASSWORD=" + PASSWORD + "]";
	}
	
	

}
