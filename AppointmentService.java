/*
 * Emily Wood
 * CS 320
 * Module Five Milestone
 * Ramsey Kraya
 */

package org.example;
import java.util.ArrayList;

public class AppointmentService {

    // create an arrayList to support the appointments
    static ArrayList<Appointment> appointmentList = new ArrayList<>();

    // search for the appointmentID
    Appointment searchAppointmentId(String appointmentId) {
        int i = 0;
        while (i < appointmentList.size()) {
            if (appointmentId.equals(appointmentList.get(i).getAppointmentId())) {
                return appointmentList.get(i);
            }
            i++;
        }
        throw new IllegalArgumentException("Id does not exist");
    }

    // add a new appointment
    public void addAppointment(String appointmentDate, String appointmentDescription) {
        String appointmentId = Integer.toString(appointmentList.size());
        Appointment appointment = new Appointment(appointmentId, appointmentDate, appointmentDescription);
        appointmentList.add(appointment);
    }

    // delete an appointment
    public void deleteAppointment(String appointmentId) {
        appointmentList.remove(searchAppointmentId(appointmentId));
    }

}
