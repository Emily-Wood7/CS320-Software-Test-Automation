/*
 * Emily Wood
 * CS 320
 * Module Five Milestone
 * Ramsey Kraya
 */

package org.example;

public class Contact {

    // declare variables
    private String contactId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    final int CONTACT_ID_LENGTH = 10;
    final int FIRST_NAME_LENGTH = 10;
    final int LAST_NAME_LENGTH = 10;
    final int PHONE_NUMBER_LENGTH = 10;
    final int ADDRESS_LENGTH = 30;
    final String INITIAL_STRING = "";

    // default constructor
    Contact() {
        this.contactId = INITIAL_STRING;
        this.firstName = INITIAL_STRING;
        this.lastName = INITIAL_STRING;
        this.phoneNumber = INITIAL_STRING;
        this.address = INITIAL_STRING;
    }

    // constructor
    public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // function to validate string lengths for all setters except phone number
    private boolean validateStringLength(String testString, int maxLength) {
        if (testString == null) {
            return false;
        }
        if (testString.length() > maxLength) {
            return false;
        }
        return true;
    }

    // function to validate string length of phone number
    private boolean validateExactStringLength(String testString, int exactLength) {
        if (testString == null) {
            return false;
        }
        if (testString.length() != exactLength) {
            return false;
        }
        return true;
    }

    // contact id getter
    public String getContactId() {
        return contactId;
    }

    // contact id setter
    public void setContactId(String contactId) throws IllegalArgumentException {
        if (!validateStringLength(contactId, CONTACT_ID_LENGTH)) {
            throw new IllegalArgumentException("Contact Id is invalid. Ensure value is not null and less than " + CONTACT_ID_LENGTH + " characters.");
        }
        this.contactId = contactId;
    }

    // first name getter
    public String getFirstName() {
        return firstName;
    }

    // first name setter
    public void setFirstName(String firstName) throws IllegalArgumentException {
        if (!validateStringLength(firstName, FIRST_NAME_LENGTH)) {
            throw new IllegalArgumentException("First Name is invalid. Ensure value is not null and less than " + FIRST_NAME_LENGTH + " characters.");
        }
        this.firstName = firstName;
    }

    // last name getter
    public String getLastName() {
        return lastName;
    }

    // last name setter
    public void setLastName(String lastName) throws IllegalArgumentException {
        if (!validateStringLength(lastName, LAST_NAME_LENGTH)) {
            throw new IllegalArgumentException("First Name is invalid. Ensure value is not null and less than " + LAST_NAME_LENGTH + " characters.");
        }
        this.lastName = lastName;
    }

    // phone number getter
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // phone number setter
    public void setPhoneNumber(String phoneNumber) throws IllegalArgumentException {
        if (!validateExactStringLength(phoneNumber, PHONE_NUMBER_LENGTH)) {
            throw new IllegalArgumentException("Phone Number is invalid. Ensure value is not null and exactly " + PHONE_NUMBER_LENGTH + " characters.");
        }
        this.phoneNumber = phoneNumber;
    }

    // address getter
    public String getAddress() {
        return address;
    }

    // address setter
    public void setAddress(String address) throws IllegalArgumentException {
        if (!validateStringLength(address, ADDRESS_LENGTH)) {
            throw new IllegalArgumentException("Address is invalid. Ensure value is not null and less than " + ADDRESS_LENGTH + " characters.");
        }
        this.address = address;
    }

}
