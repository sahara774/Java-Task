package com.mycompany.atmsystem;

import java.util.*;

class ATM {
    private String location;
    private Bank bank;
    private List<Transaction> transactions;

    public ATM(String location, Bank bank) {
        this.location = location;
        this.bank = bank;
        this.transactions = new ArrayList<>();
    }

    public void performTransaction(Card card, String pin, Transaction transaction) {
        if (card.validatePin(pin)) {
            transaction.execute();
            transactions.add(transaction);
        } else {
            System.out.println("Invalid PIN.");
        }
    }

    public String getLocation() {
        return location;
    }
}

class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}

class Account {
    private String accountNumber;
    private double balance;
    private String holderName;

    public Account(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class Card {
    private String cardNumber;
    private String pin;
    private Account account;

    public Card(String cardNumber, String pin, Account account) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.account = account;
    }

    public boolean validatePin(String inputPin) {
        return pin.equals(inputPin);
    }

    public Account getAccount() {
        return account;
    }
}

abstract class Transaction {
    protected Account account;
    protected double amount;

    public Transaction(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public abstract void execute();
}

class Withdrawal extends Transaction {
    public Withdrawal(Account account, double amount) {
        super(account, amount);
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }
}

class Deposit extends Transaction {
    public Deposit(Account account, double amount) {
        super(account, amount);
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }
}

class BalanceInquiry extends Transaction {
    public BalanceInquiry(Account account) {
        super(account, 0);
    }

    @Override
    public void execute() {
        account.displayBalance();
    }
}

// Optional: Example Main class to demonstrate usage
public class ATMsystem {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        Account acc1 = new Account("123456", "Alice", 1000.0);
        Card card = new Card("9876543210", "1234", acc1);
        bank.addAccount(acc1);

        ATM atm = new ATM("Main Street", bank);

        atm.performTransaction(card, "1234", new Withdrawal(acc1, 200));
        atm.performTransaction(card, "1234", new BalanceInquiry(acc1));
        atm.performTransaction(card, "1234", new Deposit(acc1, 500));
        atm.performTransaction(card, "1234", new BalanceInquiry(acc1));
    }
}
