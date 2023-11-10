package controlleur;

import model.Patient;

public class Controller {
    public void addPatient(String name, double glucoseLevel) {
        Patient patient = new Patient(name, glucoseLevel);
        System.out.println("Patient " + patient.getName() + " has been added with blood glucose level: " + patient.getGlucoseLevel());
    }

    public void calculateBloodGlucoseLevel(String name) {
        // Get the patient object by name and call the calculateBloodGlucoseLevel method
    }

    public void removePatient(String name) {
        // Remove the patient object by name
    }
}