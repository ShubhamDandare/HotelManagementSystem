package com.Hotelmanagement.dto;

public class SearchHotelDto {

	private String hotelName;
	private String city;
	private String pin;
	
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public SearchHotelDto(String hotelName, String city, String pin) {
		super();
		this.hotelName = hotelName;
		this.city = city;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "SearchHotelDto [hotelName=" + hotelName + ", city=" + city + ", pin=" + pin + "]";
	}
	public SearchHotelDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
