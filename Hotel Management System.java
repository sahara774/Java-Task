package com.mycompany.hotel_management_system;
import java.util.*;

public class Hotel_management_System {

    
    public static class Hotel {
        private String hotelName;
        private String location;

        public Hotel(String hotelName, String location) {
            this.hotelName = hotelName;
            this.location = location;
        }

        public String getHotelName() { return hotelName; }
        public void setHotelName(String hotelName) { this.hotelName = hotelName; }
        public String getLocation() { return location; }
        public void setLocation(String location) { this.location = location; }
    }

  
    public static class Room {
        private int roomNumber;
        private String roomType;
        private double price;

        public Room(int roomNumber, String roomType, double price) {
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.price = price;
        }

        public int getRoomNumber() { return roomNumber; }
        public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }
        public String getRoomType() { return roomType; }
        public void setRoomType(String roomType) { this.roomType = roomType; }
        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }
    }

   
    public static class Customer {
        private String customerID;
        private String name;
        private String address;

        public Customer(String customerID, String name, String address) {
            this.customerID = customerID;
            this.name = name;
            this.address = address;
        }

        public String getCustomerID() { return customerID; }
        public void setCustomerID(String customerID) { this.customerID = customerID; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getAddress() { return address; }
        public void setAddress(String address) { this.address = address; }
    }

   
    public static class Reservation {
        private String reservationID;
        private Date reservationDate;
        private Customer customer;
        private Room room;

        public Reservation(String reservationID, Date reservationDate, Customer customer, Room room) {
            this.reservationID = reservationID;
            this.reservationDate = reservationDate;
            this.customer = customer;
            this.room = room;
        }

        public String getReservationID() { return reservationID; }
        public void setReservationID(String reservationID) { this.reservationID = reservationID; }
        public Date getReservationDate() { return reservationDate; }
        public void setReservationDate(Date reservationDate) { this.reservationDate = reservationDate; }
        public Customer getCustomer() { return customer; }
        public void setCustomer(Customer customer) { this.customer = customer; }
        public Room getRoom() { return room; }
        public void setRoom(Room room) { this.room = room; }
    }

    
    public static class Employee {
        private String employeeID;
        private String name;
        private String role;

        public Employee(String employeeID, String name, String role) {
            this.employeeID = employeeID;
            this.name = name;
            this.role = role;
        }

        public String getEmployeeID() { return employeeID; }
        public void setEmployeeID(String employeeID) { this.employeeID = employeeID; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getRole() { return role; }
        public void setRole(String role) { this.role = role; }
    }

   
    public static void main(String[] args) {
        
        Hotel hotel = new Hotel("Grand Palace", "New York");

        
        Room room = new Room(101, "Deluxe", 200.0);

        
        Customer customer = new Customer("C001", "Alice", "123 Main St");

        
        Reservation reservation = new Reservation("R001", new Date(), customer, room);

       
        Employee employee = new Employee("E001", "Bob", "Manager");

        
        System.out.println("Hotel: " + hotel.getHotelName() + ", Location: " + hotel.getLocation());
        System.out.println("Customer: " + customer.getName() + ", Address: " + customer.getAddress());
        System.out.println("Room: " + room.getRoomNumber() + ", Type: " + room.getRoomType());
        System.out.println("Reservation Date: " + reservation.getReservationDate());
        System.out.println("Employee: " + employee.getName() + ", Role: " + employee.getRole());
    }
}
