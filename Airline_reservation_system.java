package com.mycompany.airlinereservationsystem;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirlineReservationSystem {

  
    public static class Passenger {
        private String passengerID;
        private String name;
        private String passportNumber;

        public Passenger(String passengerID, String name, String passportNumber) {
            this.passengerID = passengerID;
            this.name = name;
            this.passportNumber = passportNumber;
        }

        public String getPassengerID() { return passengerID; }
        public void setPassengerID(String passengerID) { this.passengerID = passengerID; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getPassportNumber() { return passportNumber; }
        public void setPassportNumber(String passportNumber) { this.passportNumber = passportNumber; }
    }

   
    public static class Employee {
        private String employeeID;
        private String name;
        private String position;

        public Employee(String employeeID, String name, String position) {
            this.employeeID = employeeID;
            this.name = name;
            this.position = position;
        }

        public String getEmployeeID() { return employeeID; }
        public void setEmployeeID(String employeeID) { this.employeeID = employeeID; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getPosition() { return position; }
        public void setPosition(String position) { this.position = position; }
    }

   
    public static class TicketBooking {
        private String bookingID;
        private Passenger passenger;
        private String flightNumber;
        private Date bookingDate;

        public TicketBooking(String bookingID, Passenger passenger, String flightNumber, Date bookingDate) {
            this.bookingID = bookingID;
            this.passenger = passenger;
            this.flightNumber = flightNumber;
            this.bookingDate = bookingDate;
        }

        public String getBookingID() { return bookingID; }
        public void setBookingID(String bookingID) { this.bookingID = bookingID; }
        public Passenger getPassenger() { return passenger; }
        public void setPassenger(Passenger passenger) { this.passenger = passenger; }
        public String getFlightNumber() { return flightNumber; }
        public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }
        public Date getBookingDate() { return bookingDate; }
        public void setBookingDate(Date bookingDate) { this.bookingDate = bookingDate; }
    }

    
    public static class Reservation {
        private String reservationID;
        private List<Passenger> passengers;
        private String flightNumber;
        private Date reservationDate;
        private Employee bookedBy;

        public Reservation(String reservationID, String flightNumber, Date reservationDate, Employee bookedBy) {
            this.reservationID = reservationID;
            this.flightNumber = flightNumber;
            this.reservationDate = reservationDate;
            this.bookedBy = bookedBy;
            this.passengers = new ArrayList<>();
        }

        public String getReservationID() { return reservationID; }
        public void setReservationID(String reservationID) { this.reservationID = reservationID; }
        public List<Passenger> getPassengers() { return passengers; }
        public void addPassenger(Passenger passenger) { passengers.add(passenger); }
        public String getFlightNumber() { return flightNumber; }
        public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }
        public Date getReservationDate() { return reservationDate; }
        public void setReservationDate(Date reservationDate) { this.reservationDate = reservationDate; }
        public Employee getBookedBy() { return bookedBy; }
        public void setBookedBy(Employee bookedBy) { this.bookedBy = bookedBy; }
    }

    
    public static void main(String[] args) {
        
        Employee employee = new Employee("E001", "Bob", "Booking Agent");

        
        Passenger passenger1 = new Passenger("P001", "Alice", "AB123456");
        Passenger passenger2 = new Passenger("P002", "John", "XY987654");

       
        Reservation reservation = new Reservation("R001", "FL123", new Date(), employee);
        reservation.addPassenger(passenger1);
        reservation.addPassenger(passenger2);

       
        TicketBooking booking1 = new TicketBooking("B001", passenger1, "FL123", new Date());
        TicketBooking booking2 = new TicketBooking("B002", passenger2, "FL123", new Date());

       
        System.out.println("Reservation ID: " + reservation.getReservationID());
        System.out.println("Booked by: " + reservation.getBookedBy().getName());
        System.out.println("Passengers:");
        for (Passenger p : reservation.getPassengers()) {
            System.out.println("- " + p.getName() + " (" + p.getPassportNumber() + ")");
        }
    }
}
