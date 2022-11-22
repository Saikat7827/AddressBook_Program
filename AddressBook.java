package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Contacts> personDetails = new ArrayList<>();

	
	public void newContact() {
		Contacts contact = new Contacts();
		System.out.println("Enter your First Name");
		contact.setFirstName(sc.next());
		
		System.out.println("Enter your Last Name");
		contact.setLastName(sc.next());
		
		System.out.println("Enter your City");
		contact.setCity(sc.next());
		
		System.out.println("Enter your state");
		contact.setState(sc.next());
		
		System.out.println("Enter your Zip");
		contact.setZip(sc.nextInt());
		
		System.out.println("Enter your Phone Number");
		contact.setPhNo(sc.next());
		
		System.out.println("Enter your email ID");
		contact.setEmail(sc.next());
		
		System.out.println("Added Successfully");

		
		personDetails.add(contact);

		System.out.println(contact);
	}

	
	public void editPerson() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name to Edit");
		String name = sc.next();

		for (int i = 0; i < personDetails.size(); i++) {
			Contacts p = (Contacts) personDetails.get(i);

			if (name.equals(p.getFirstName())) {
				System.out.println(p);

				System.out.print(
						"Enter what to update(1.first name/ 2.last name/ 3.city/ 4.state/ 5.phone/ 6.zip/ 7.email): ");
				sc.nextLine();
				Integer choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter your first name to update:");
					p.setFirstName(sc.next());
					break;
				case 2:
					System.out.println("Enter your last name to update:");
					p.setLastName( sc.next());
					break;
				case 3:
					System.out.println("Enter your city name to update:");
					p.setCity(sc.next());
					break;
				case 4:
					System.out.println("Enter your state name to update:");
					p.setState(sc.next());
					break;
				case 5:
					System.out.println("Enter Your phone no to update:");
					p.setPhNo(sc.next());
					break;
				case 6:
					System.out.println("Enter Your zip to update:");
					p.setZip(sc.nextInt());
					break;
				case 7:
					System.out.println("Enter Your email to update:");
					p.setEmail(sc.next());
					break;
				}
				personDetails.set(i, p);
				System.out.println(p);
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program ");
		Scanner sc = new Scanner(System.in);

		AddressBook addPerson = new AddressBook();
		// to add a new Contact
		System.out.println("Enter Number of persons you want to add : ");
		int person_count = sc.nextInt();
		for (int i = 0; i < person_count; i++) {
			addPerson.newContact();
		}
		
		addPerson.editPerson();

		sc.close();
	}
}
