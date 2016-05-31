package com.mybatis.dto;


public class CustomerDTO {

	private long cusId;
	
	private String phone;
	
	private String password;
	
	private String cardName;

	public long getCusId() {
		return cusId;
	}

	public void setCusId(long cusId) {
		this.cusId = cusId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	@Override
	public String toString() {
		return "CustomerDTO [cusId=" + cusId + ", phone=" + phone
				+ ", password=" + password + ", cardName=" + cardName + "]";
	}
	
	
}
