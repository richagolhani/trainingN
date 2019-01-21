package com.learn2drive.model;

import java.util.Date;

public class License {

	private String number;
	private String issuingRTO;
	private Date expirydate;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getIssuingRTO() {
		return issuingRTO;
	}
	public void setIssuingRTO(String issuingRTO) {
		this.issuingRTO = issuingRTO;
	}
	public Date getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}
	
	
}
