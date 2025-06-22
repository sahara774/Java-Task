package com.mycompany.bankingsystem;
import java.util.Date;
import java.util.List;

public class BankingSystem {

   
    public static class Bank {
        private String bankID;
        private String name;
        private String address;
        private List<Account> accounts;

        public Bank(String bankID, String name, String address, List<Account> accounts) {
            this.bankID = bankID;
            this.name = name;
            this.address = address;
            this.accounts = accounts;
        }

        public String getBankID() { return bankID; }
        public void setBankID(String bankID) { this.bankID = bankID; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getAddress() { return address; }
        public void setAddress(String address) { this.address = address; }
        public List<Account> getAccounts() { return accounts; }
        public void setAccounts(List<Account> accounts) { this.accounts = accounts; }
    }

   
    public static class ATM {
        private String atmID;
        private String location;
        private Bank bank;

        public ATM(String atmID, String location, Bank bank) {
            this.atmID = atmID;
            this.location = location;
            this.bank = bank;
        }

        public String getAtmID() { return atmID; }
        public void setAtmID(String atmID) { this.atmID = atmID; }
        public String getLocation() { return location; }
        public void setLocation(String location) { this.location = location; }
        public Bank getBank() { return bank; }
        public void setBank(Bank bank) { this.bank = bank; }
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

   
    public static class Account {
        private String accountNumber;
        private Customer customer;
        private double balance;

        public Account(String accountNumber, Customer customer, double balance) {
            this.accountNumber = accountNumber;
            this.customer = customer;
            this.balance = balance;
        }

        public String getAccountNumber() { return accountNumber; }
        public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
        public Customer getCustomer() { return customer; }
        public void setCustomer(Customer customer) { this.customer = customer; }
        public double getBalance() { return balance; }
        public void setBalance(double balance) { this.balance = balance; }

        public void deposit(double amount) {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                this.balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        }
    }

    
    public static class Transaction {
        private String transactionID;
        private Account account;
        private double amount;
        private Date date;
        private String type; // e.g., "deposit", "withdrawal"

        public Transaction(String transactionID, Account account, double amount, Date date, String type) {
            this.transactionID = transactionID;
            this.account = account;
            this.amount = amount;
            this.date = date;
            this.type = type;
        }

        public String getTransactionID() { return transactionID; }
        public void setTransactionID(String transactionID) { this.transactionID = transactionID; }
        public Account getAccount() { return account; }
        public void setAccount(Account account) { this.account = account; }
        public double getAmount() { return amount; }
        public void setAmount(double amount) { this.amount = amount; }
        public Date getDate() { return date; }
        public void setDate(Date date) { this.date = date; }
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }
    }

    
    public static void main(String[] args) {
       
        Customer customer = new Customer("C001", "Alice", "123 Main St");

       
        Account account = new Account("A001", customer, 1000.0);

       
        Bank bank = new Bank("B001", "MyBank", "456 Bank St", List.of(account));

        
        ATM atm = new ATM("ATM001", "Downtown", bank);

       
        account.deposit(500.0);

        
        account.withdraw(200.0);

        
        Transaction transaction = new Transaction("T001", account, 500.0, new Date(), "deposit");

        
        System.out.println("Customer: " + customer.getName() + ", Account Balance: " + account.getBalance());
        System.out.println("Transaction: " + transaction.getType() + " of " + transaction.getAmount() + " on " + transaction.getDate());
    }
}
