package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
	 public static void main(String[] args) {
		    System.out.println("--Welcome to Address Book Program--");

		    Contacts[] contacts = new Contacts[25];
		    String choice = "add";
		    Scanner sc = new Scanner(System.in);

		    while (!choice.equals("quit")) {
		      System.out.print("\n1. add \n2. quit \nEnter your choice: ");
		      choice = sc.next();

		      switch (choice) {
		        case "add":
		        case "1":
		          Contacts c = new Contacts();
		          c.getInputs();
		          System.out.println("Here's whats been added: " + c.fName + " " + c.lName + " " + c.address + " " + c.city + " "
		            + c.state + " " + c.email + " " + c.zip + " " + c.phNum);
		          contacts = c.addContact(contacts, c);
		          break;

		        case "quit":
		        case "2":
		          choice = "quit";
		          break;

		        default:
		          System.out.println("that didnt match any choice, try again");
		          break;

		      }
		    }
		    
		  }
}
