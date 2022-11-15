package com.bridgelabz;

public class AddressBook {
	 public static void main(String[] args) {
		  System.out.println("--Welcome to Address Book Program--");

		  Contacts c = new Contacts();
		  c.getInputs();

		  System.out.println("Here's what was entered: " + c.fName + " " + c.lName + " " + c.address + " " + c.city + " "
		    + c.state + " " + c.email + " " + c.zip + " " + c.phNum);

		  }
}
