/*
 * Emily Wood
 * SNHU CS-320
 * Project One
 * October 11, 2022
 */

package org.example;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Appointment {

    // declare variables
    private String appointmentId;
    private String appointmentDate;
    private String appointmentDescription;
    final String INITIAL_STRING = "";
    final int MAX_APPOINTMENT_ID_LENGTH = 10;
    final int MAX_APPOINTMENT_DESCRIPTION_LENGTH = 50;

    // default constructor
    Appointment() {
        this.appointmentId = INITIAL_STRING;
        this.appointmentDate = INITIAL_STRING;
        this.appointmentDescription = INITIAL_STRING;
    }

    // constructor
    public Appointment(String appointmentId, String appointmentDate, String appointmentDescription) {
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.appointmentDescription = appointmentDescription;
    }

    // validate appointmentId string length and not null
    private boolean validateIdString(String testString, int maxLength) {
        if (testString == null) {
            return false;
        }
        if (testString.length() > maxLength) {
            return false;
        }
        return true;
    }

    // validate date is not earlier than current date
    private boolean validateDate(String testString) {
        Date date = new Date();
        String todayDate = new SimpleDateFormat("MMddyyyy").format(date);
        if (testString == null) {
            return false;
        }
        if (testString.compareTo(todayDate) < 0) {
            return false;
        }
        return true;
    }

    // validate appointmentDescription String length and not null
    private boolean validateDescriptionString(String testString, int maxLength) {
        if (testString == null) {
            return false;
        }
        if (testString.length() > maxLength) {
            return false;
        }
        return true;
    }

    // appointmentID getter
    public String getAppointmentId() {
        return appointmentId;
    }

    // appointmentID setter
    public void setAppointmentId(String appointmentId) throws IllegalArgumentException {
        if (!validateIdString(appointmentId,MAX_APPOINTMENT_ID_LENGTH)) {
            throw new IllegalArgumentException("Id is invalid. Ensure value is not null and less than " + MAX_APPOINTMENT_ID_LENGTH + " characters.");
        }
        this.appointmentId = appointmentId;
    }

    // appointmentDate getter
    public String getAppointmentDate() {
        return appointmentDate;
    }

    // appointmentDate setter
    public void setAppointmentDate(String appointmentDate) {
        if (!validateDate(appointmentDate)) {
            throw new IllegalArgumentException("Date is invalid.  Ensure value is not null and later than current date.");
        }
        this.appointmentDate = appointmentDate;
    }

    // appointmentDescription getter
    public String getAppointmentDescription() {
        return appointmentDescription;
    }

    // appointmentDescription setter
    public void setAppointmentDescription(String appointmentDescription) {
        if (!validateDescriptionString(appointmentDescription, MAX_APPOINTMENT_DESCRIPTION_LENGTH)) {
            throw new IllegalArgumentException("Description is invalid. Ensure value is not null and less than " + MAX_APPOINTMENT_DESCRIPTION_LENGTH + " characters.");
        }
        this.appointmentDescription = appointmentDescription;
    }

}
