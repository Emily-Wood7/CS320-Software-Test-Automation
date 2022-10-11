/*
 * Emily Wood
 * CS 320
 * Module Five Milestone
 * Ramsey Kraya
 */

package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

    // set up test variables
    final String testId = "0";
    final String failTestId = "1";
    final String testFirstName = "First Name";
    final String testLastName = "Last Name";
    final String testNewName = "New Name";
    final String testPhoneNumber = "0123456789";
    final String testNewPhoneNumber = "9876543210";
    final String testAddress = "Address";
    final String testNewAddress = "New Address";
    ContactService contact;

    @BeforeEach
    // create a new instance for each test
    public void setUp() {
        contact = new ContactService();
    }

    @AfterEach
    // empty the arraylist after each test
    public void tearDown() {
        ContactService.contactList.clear();
    }

    @Test
    void testSearchContactId() {
        contact.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
        assertAll(
                () -> assertEquals(testId, contact.searchContactId(testId).getContactId()),
                () -> assertThrows(IllegalArgumentException.class, () -> contact.searchContactId(failTestId).getContactId())
        );

    }

    @Test
    void testAddContact() {
        contact.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
        assertAll(
                () -> assertEquals(testId, ContactService.contactList.get(0).getContactId()),
                () -> assertEquals(testFirstName, ContactService.contactList.get(0).getFirstName()),
                () -> assertEquals(testLastName, ContactService.contactList.get(0).getLastName()),
                () -> assertEquals(testPhoneNumber, ContactService.contactList.get(0).getPhoneNumber()),
                () -> assertEquals(testAddress, ContactService.contactList.get(0).getAddress())
        );
    }

    @Test
    void testDeleteContact() throws Exception {
        contact.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);

        // verify that the contact was added
        assertEquals(1, ContactService.contactList.size());

        contact.deleteContact(testId);
        // verify that the contact was deleted
        assertTrue(ContactService.contactList.isEmpty());
    }

    @Test
    void testUpdateFirstName() throws Exception {
        contact.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);

        contact.updateFirstName(testId, testNewName);
        assertEquals(testNewName, ContactService.contactList.get(0).getFirstName());
    }

    @Test
    void testUpdateLastName() throws Exception {
        contact.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);

        contact.updateLastName(testId, testNewName);
        assertEquals(testNewName, ContactService.contactList.get(0).getLastName());
    }

    @Test
    void testUpdatePhoneNumber() throws Exception {
        contact.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);

        contact.updatePhoneNumber(testId, testNewPhoneNumber);
        assertEquals(testNewPhoneNumber, ContactService.contactList.get(0).getPhoneNumber());
    }

    @Test
    void testUpdateAddress() throws Exception {
        contact.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);

        contact.updateAddress(testId, testNewAddress);
        assertEquals(testNewAddress, ContactService.contactList.get(0).getAddress());
    }
}
