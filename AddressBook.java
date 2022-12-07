package com.bridgelabz;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddressBook {
	 public static void main(String[] args) {
		    System.out.println("--Welcome to Address Book Program--");

		    ArrayList<Contacts> contacts = new ArrayList<>();
		    String choice = "add";
		    Scanner sc = new Scanner(System.in);

		    while (!choice.equals("quit")) {
		      System.out.print("\n1. add \n2. edit \n3. delete \n4. show \n5. quit \nEnter your choice: ");
		      choice = sc.next().toLowerCase();

		      switch (choice) {
		        case "add":
		        case "1":
		          Contacts c = new Contacts();
		          try {
		            c.getInputs();
		            System.out.println("Here's whats been added: " + c.fName + " " + c.lName + " " + c.address + " " + c.city + " "
		              + c.state + " " + c.email + " " + c.zip + " " + c.phNum);
		            contacts = c.addContact(contacts, c);
		          } catch (InputMismatchException e) {
		            System.out.println("Enter a numeric value for zip code and phone number next time.");
		          }

		          break;

		        case "edit":
		        case "2":
		          c = new Contacts();
		          contacts = c.showEditDelete(contacts, "edit");
		          break;

		        case "delete":
		        case "3":
		          c = new Contacts();
		          contacts = c.showEditDelete(contacts, "delete");
		          break;

		        case "show":
		        case "4":
		          c = new Contacts();
		          contacts = c.showEditDelete(contacts, "show");
		          break;

		        case "quit":
		        case "5":
		          choice = "quit";
		          break;

		        default:
		          System.out.println("that didnt match any choice, try again");
		          break;
		      }
		    }

		    sc.close();
		  }
}
