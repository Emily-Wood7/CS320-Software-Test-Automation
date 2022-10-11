/*
 * Emily Wood
 * CS 320
 * Module Five Milestone
 * Ramsey Kraya
 */

package org.example;
import java.util.ArrayList;

public class ContactService {

    // create an arraylist to store the contacts
    static ArrayList<Contact> contactList = new ArrayList<>();

    // search for contactId
    Contact searchContactId(String contactId) {
        int i = 0;
        while (i < contactList.size()) {
            if (contactId.equals(contactList.get(i).getContactId())) {
                return contactList.get(i);
            }
            i++;
        }
        throw new IllegalArgumentException("Id does not exist.");
    }

    // add a new contact
    public void addContact(String firstName, String lastName, String phoneNumber, String address) {
        String contactId = Integer.toString(contactList.size());
        Contact contact = new Contact(contactId, firstName, lastName, phoneNumber, address);
        contactList.add(contact);
    }

    // delete contact
    public void deleteContact(String contactId) throws Exception {
        contactList.remove(searchContactId(contactId));
    }

    // update first name
    public void updateFirstName(String contactId, String firstName) throws Exception {
        searchContactId(contactId).setFirstName(firstName);
    }

    // update last name
    public void updateLastName(String contactId, String lastName) throws Exception {
        searchContactId(contactId).setLastName(lastName);
    }

    // update phone number
    public void updatePhoneNumber(String contactId, String phoneNumber) throws Exception {
        searchContactId(contactId).setPhoneNumber(phoneNumber);
    }

    // update address
    public void updateAddress(String contactId, String address) throws Exception {
        searchContactId(contactId).setAddress(address);
    }
}
