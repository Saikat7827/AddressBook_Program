package com.bridgelabz;

public class Contacts {
	
		String firstName;
		String lastName;
		String city;
		String state;
		int zip;
		String phNo;
		String email;

		
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

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public int getZip() {
			return zip;
		}

		public void setZip(int zip) {
			this.zip = zip;
		}

		public String getPhNo() {
			return phNo;
		}

		public void setPhNo(String phNo) {
			this.phNo = phNo;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state=" + state
					+ ", zip=" + zip + ", phNo=" + phNo + ", email=" + email + "]";
		}
}
