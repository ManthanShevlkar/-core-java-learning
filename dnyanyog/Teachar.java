package org.dnyanyog;

public class Teachar {
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	
	private Adress adress = new Adress();

	
	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
    public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	
	
	
	}

	@Override
	public String toString() {
		return "Teachar [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobile=" + mobile
				+ "]";
	}
	
	

}
