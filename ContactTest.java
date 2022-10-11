/*
 * Emily Wood
 * SNHU CS-320
 * Project One
 * October 11, 2022
 */

package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    //set up
    final String nullTest = null;
    final String longTest = "01234567890";
    final String goodTest = "0123456789";
    final String shortPhoneNumberTest = "0";
    final String longPhoneNumberTest = "012345678901";
    final String longAddressTest = "0123456789012345678901234567890";
    Contact contact;

    @BeforeEach
    // create a new instance before each test
    void setUp() {
        contact = new Contact();
    }

    @Test
    // testing setter and getter good test
    void testGetContactId() {
        contact.setContactId(goodTest);
        assertTrue(contact.getContactId() == goodTest);
    }

    @Test
    // testing setter invalid entries
    void testSetContactId() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> contact.setContactId(nullTest)),
                () -> assertThrows(IllegalArgumentException.class, () -> contact.setContactId(longTest))
        );
    }

    @Test
        // testing setter and getter good test
    void testGetFirstName() {
        contact.setFirstName(goodTest);
        assertTrue(contact.getFirstName() == goodTest);
    }

    @Test
        // testing setter invalid entries
    void testSetFirstName() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(nullTest)),
                () -> assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(longTest))
        );
    }

    @Test
        // testing setter and getter good test
    void testGetLastName() {
        contact.setLastName(goodTest);
        assertTrue(contact.getLastName() == goodTest);
    }

    @Test
        // testing setter invalid entries
    void testSetLastName() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> contact.setLastName(nullTest)),
                () -> assertThrows(IllegalArgumentException.class, () -> contact.setLastName(longTest))
        );
    }

    @Test
        // testing setter and getter good test
    void testGetPhoneNumber() {
        contact.setPhoneNumber(goodTest);
        assertTrue(contact.getPhoneNumber() == goodTest);
    }

    @Test
        // testing setter invalid entries
    void testSetPhoneNumber() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> contact.setPhoneNumber(nullTest)),
                () -> assertThrows(IllegalArgumentException.class, () -> contact.setPhoneNumber(shortPhoneNumberTest)),
                () -> assertThrows(IllegalArgumentException.class, () -> contact.setPhoneNumber(longPhoneNumberTest))
        );
    }

    @Test
        // testing setter and getter good test
    void testGetAddress() {
        contact.setAddress(goodTest);
        assertTrue(contact.getAddress() == goodTest);
    }

    @Test
        // testing setter invalid entries
    void testSetAddress() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> contact.setAddress(nullTest)),
                () -> assertThrows(IllegalArgumentException.class, () -> contact.setAddress(longAddressTest))
        );
    }
}
