package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	static Scanner sc = new Scanner(System.in);
	ArrayList<Contacts> personDetails = new ArrayList<>();

	/*
	 * This is the method to add a new Contact to Address Book
	 */
	public void newContact() {
		Contacts contact = new Contacts();
		System.out.println("Enter your First Name");
		contact.setFirstName(sc.nextLine());
		System.out.println("Enter your Last Name");
		contact.setLastName(sc.nextLine());
		System.out.println("Enter your City");
		contact.setCity(sc.nextLine());
		System.out.println("Enter your state");
		contact.setState(sc.nextLine());
		System.out.println("Enter your Zip");
		contact.setZip(sc.nextInt());
		System.out.println("Enter your Phone Number");
		contact.setPhNo(sc.next());
		System.out.println("Enter your email ID");
		contact.setEmail(sc.next());
		System.out.println("Added Successfully");

		// Add the above list to personDetails array list
		personDetails.add(contact);
		System.out.println(contact);
	}

	/*
	 * This is the method to edit existing contact person using their name
	 */
	public void editPerson() {
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
					p.setLastName(sc.next());
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
	}

	/*
	 * This is the method to delete existing contact person using their name
	 */
	public void deletePerson() {

		System.out.println("Enter name to Delete");
		String name = sc.next();

		for (int i = 0; i < personDetails.size(); i++) {
			Contacts p = (Contacts) personDetails.get(i);
			if (name.equals(p.getFirstName())) {
				System.out.println(p);
				personDetails.remove(i);
				System.out.println(personDetails.isEmpty());
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program ");

		AddressBook addPerson = new AddressBook();
		
		addPerson.newContact();
		
		addPerson.editPerson();
		
		addPerson.deletePerson();
	}
}
