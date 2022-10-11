/*
 * Emily Wood
 * SNHU CS-320
 * Project One
 * October 11, 2022
 */

package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {

    // declare test variables
    final String nullTest = null;
    final String longIdTest = "01234567890";
    final String longDescriptionTest = "012345678901234567890123456789012345678901234567890";
    final String goodTest = "Good Test";
    Date date = new Date();
    String goodDate = new SimpleDateFormat("MMddyyyy").format(date);
    final String oldDate = "01012022";
    Appointment appointment;

    @BeforeEach
    // create a new instance before each test
    void setUp() {
        appointment = new Appointment();
    }

    @Test
    // testing setter and getter of appointmentId
    void testGetAppointmentId() {
        appointment.setAppointmentId(goodTest);
        assertTrue(appointment.getAppointmentId() == goodTest);
    }

    @Test
    // testing invalid id entries
    void testSetAppointmentId() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> appointment.setAppointmentId(nullTest)),
                () -> assertThrows(IllegalArgumentException.class, () -> appointment.setAppointmentId(longIdTest))
        );
    }

    @Test
    // testing setter and getter good test
    void testGetAppointmentDate() {
        appointment.setAppointmentDate(goodDate);
        assertTrue(appointment.getAppointmentDate() == goodDate);
    }

    @Test
    // testing invalid date entries
    void testSetAppointmentDate() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> appointment.setAppointmentDate(nullTest)),
                () -> assertThrows(IllegalArgumentException.class, () -> appointment.setAppointmentDate(oldDate))
        );
    }

    @Test
    // testing setter and getter good test
    void testGetAppointmentDescription() {
        appointment.setAppointmentDescription(goodTest);
        assertTrue(appointment.getAppointmentDescription() == goodTest);
    }

    @Test
    // testing invalid description entries
    void testSetAppointmentDescription() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> appointment.setAppointmentDescription(nullTest)),
                () -> assertThrows(IllegalArgumentException.class, () -> appointment.setAppointmentDescription(longDescriptionTest))
        );
    }
}
