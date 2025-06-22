package com.mycompany.onlineshoppingsystem;
import java.util.Date;
import java.util.List;

public class OnlineShoppingSystem {

   
    public static class User {
        private String userID;
        private String name;
        private String email;

        public User(String userID, String name, String email) {
            this.userID = userID;
            this.name = name;
            this.email = email;
        }

        public String getUserID() { return userID; }
        public void setUserID(String userID) { this.userID = userID; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
    }

   
    public static class Account {
        private String accountID;
        private User user;
        private String password;
        private String address;

        public Account(String accountID, User user, String password, String address) {
            this.accountID = accountID;
            this.user = user;
            this.password = password;
            this.address = address;
        }

        public String getAccountID() { return accountID; }
        public void setAccountID(String accountID) { this.accountID = accountID; }
        public User getUser() { return user; }
        public void setUser(User user) { this.user = user; }
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
        public String getAddress() { return address; }
        public void setAddress(String address) { this.address = address; }
    }


    public static class Product {
        private String productID;
        private String name;
        private double price;

        public Product(String productID, String name, double price) {
            this.productID = productID;
            this.name = name;
            this.price = price;
        }

        public String getProductID() { return productID; }
        public void setProductID(String productID) { this.productID = productID; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }
    }

   
    public static class Order {
        private String orderID;
        private Account account;
        private List<Product> products;
        private Date orderDate;

        public Order(String orderID, Account account, List<Product> products, Date orderDate) {
            this.orderID = orderID;
            this.account = account;
            this.products = products;
            this.orderDate = orderDate;
        }

        public String getOrderID() { return orderID; }
        public void setOrderID(String orderID) { this.orderID = orderID; }
        public Account getAccount() { return account; }
        public void setAccount(Account account) { this.account = account; }
        public List<Product> getProducts() { return products; }
        public void setProducts(List<Product> products) { this.products = products; }
        public Date getOrderDate() { return orderDate; }
        public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }
    }

   
    public static class Shipment {
        private String shipmentID;
        private Order order;
        private String status;
        private Date shipmentDate;

        public Shipment(String shipmentID, Order order, String status, Date shipmentDate) {
            this.shipmentID = shipmentID;
            this.order = order;
            this.status = status;
            this.shipmentDate = shipmentDate;
        }

        public String getShipmentID() { return shipmentID; }
        public void setShipmentID(String shipmentID) { this.shipmentID = shipmentID; }
        public Order getOrder() { return order; }
        public void setOrder(Order order) { this.order = order; }
        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
        public Date getShipmentDate() { return shipmentDate; }
        public void setShipmentDate(Date shipmentDate) { this.shipmentDate = shipmentDate; }
    }

    
    public static void main(String[] args) {
        
        User user = new User("U001", "Alice", "alice@example.com");

       
        Account account = new Account("A001", user, "securePassword", "123 Main St");

       
        Product product1 = new Product("P001", "Laptop", 1200.0);
        Product product2 = new Product("P002", "Mouse", 25.0);

        
        Order order = new Order("O001", account, List.of(product1, product2), new Date());

        
        Shipment shipment = new Shipment("S001", order, "Shipped", new Date());

       
        System.out.println("User: " + user.getName() + ", Email: " + user.getEmail());
        System.out.println("Order ID: " + order.getOrderID() + ", Number of Products: " + order.getProducts().size());
        System.out.println("Shipment Status: " + shipment.getStatus() + ", Date: " + shipment.getShipmentDate());
    }
}
