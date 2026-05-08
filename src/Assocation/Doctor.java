package Assocation;


// Doctor and patient exist independently and neither of them owns each others
public class Doctor {

    void examinePatient(Patient patient) {   // association
        System.out.println("Examining patient name " + patient.patientName);
    }
}
