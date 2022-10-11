/*
 * Emily Wood
 * SNHU CS-320
 * Project One
 * October 11, 2022
 */

package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentServiceTest {

    // set up test variables
    final String passTestId = "0";
    final String failTestId = "1";
    final String passTestDate = "12122022";
    final String passTestDescription = "Appointment Description";
    AppointmentService appointment;


    @BeforeEach
    // create a new instance for each test
    void setUp() {
        appointment = new AppointmentService();
    }

    @AfterEach
    // empty the arrayList after each test
    void tearDown() {
        AppointmentService.appointmentList.clear();
    }

    @Test
    // test an id that exists and one that does not exist
    void testSearchAppointmentId() {
        appointment.addAppointment(passTestDate, passTestDescription);

        assertAll(
                () -> assertEquals(passTestId, appointment.searchAppointmentId(passTestId).getAppointmentId()),
                () -> assertThrows(IllegalArgumentException.class, () -> appointment.searchAppointmentId(failTestId).getAppointmentId())
        );
    }

    @Test
    // test that each item was added to the appointment
    void testAddAppointment() {
        appointment.addAppointment(passTestDate, passTestDescription);
        assertAll(
                () -> assertEquals(passTestId, AppointmentService.appointmentList.get(0).getAppointmentId()),
                () -> assertEquals(passTestDate, AppointmentService.appointmentList.get(0).getAppointmentDate()),
                () -> assertEquals(passTestDescription, AppointmentService.appointmentList.get(0).getAppointmentDescription())
        );
    }

    @Test
    void testDeleteAppointment() {
        appointment.addAppointment(passTestDate, passTestDescription);

        int appointmentListSize = AppointmentService.appointmentList.size();

        // delete appointment
        appointment.deleteAppointment(passTestId);

        // verify appointment was deleted
        assertEquals(appointmentListSize - 1, AppointmentService.appointmentList.size());
    }
}
