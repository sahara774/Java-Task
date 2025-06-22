package com.mycompany.hospitalmanagementsystem;
import java.util.Date;
import java.util.List;

public class HospitalManagementSystem {

    
    public static class Patient {
        private String patientID;
        private String name;
        private int age;
        private String address;

        public Patient(String patientID, String name, int age, String address) {
            this.patientID = patientID;
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getPatientID() { return patientID; }
        public void setPatientID(String patientID) { this.patientID = patientID; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
        public String getAddress() { return address; }
        public void setAddress(String address) { this.address = address; }
    }

   
    public static class Staff {
        private String staffID;
        private String name;
        private String role;

        public Staff(String staffID, String name, String role) {
            this.staffID = staffID;
            this.name = name;
            this.role = role;
        }

        public String getStaffID() { return staffID; }
        public void setStaffID(String staffID) { this.staffID = staffID; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getRole() { return role; }
        public void setRole(String role) { this.role = role; }
    }

    
    public static class Doctor extends Staff {
        private String specialty;

        public Doctor(String staffID, String name, String specialty) {
            super(staffID, name, "Doctor");
            this.specialty = specialty;
        }

        public String getSpecialty() { return specialty; }
        public void setSpecialty(String specialty) { this.specialty = specialty; }
    }

   
    public static class Nurse extends Staff {
        private String department;

        public Nurse(String staffID, String name, String department) {
            super(staffID, name, "Nurse");
            this.department = department;
        }

        public String getDepartment() { return department; }
        public void setDepartment(String department) { this.department = department; }
    }

   
    public static class Treatment {
        private String treatmentID;
        private Patient patient;
        private Doctor doctor;
        private String description;
        private Date treatmentDate;

        public Treatment(String treatmentID, Patient patient, Doctor doctor, String description, Date treatmentDate) {
            this.treatmentID = treatmentID;
            this.patient = patient;
            this.doctor = doctor;
            this.description = description;
            this.treatmentDate = treatmentDate;
        }

        public String getTreatmentID() { return treatmentID; }
        public void setTreatmentID(String treatmentID) { this.treatmentID = treatmentID; }
        public Patient getPatient() { return patient; }
        public void setPatient(Patient patient) { this.patient = patient; }
        public Doctor getDoctor() { return doctor; }
        public void setDoctor(Doctor doctor) { this.doctor = doctor; }
        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
        public Date getTreatmentDate() { return treatmentDate; }
        public void setTreatmentDate(Date treatmentDate) { this.treatmentDate = treatmentDate; }
    }

    
    public static void main(String[] args) {
        
        Patient patient = new Patient("P001", "Alice", 30, "123 Main St");

       
        Doctor doctor = new Doctor("D001", "Dr. Bob", "Cardiology");

        
        Nurse nurse = new Nurse("N001", "Nurse Carol", "ICU");

        
        Treatment treatment = new Treatment("T001", patient, doctor, "Heart surgery", new Date());

       
        System.out.println("Patient: " + patient.getName() + ", Age: " + patient.getAge());
        System.out.println("Doctor: " + doctor.getName() + ", Specialty: " + doctor.getSpecialty());
        System.out.println("Nurse: " + nurse.getName() + ", Department: " + nurse.getDepartment());
        System.out.println("Treatment: " + treatment.getDescription() + ", Date: " + treatment.getTreatmentDate());
    }
}
