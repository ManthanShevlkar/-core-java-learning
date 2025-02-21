package org.dnyanyog;

public class Adress {
	private String Street1;
	private String Street2;
	private String City;
	private String State;
	private String Country;

	public String getStreet1() {
		return Street1;
	}
	public void setStreet1(String street1) {
		Street1 = street1;
	}
	public String getStreet2() {
		return Street2;
	}
	public void setStreet2(String street2) {
		Street2 = street2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "Adress [Street1=" + Street1 + ", Street2=" + Street2 + ", City=" + City + ", State=" + State
				+ ", Country=" + Country + "]";
	}
	
}
