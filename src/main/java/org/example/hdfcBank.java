package org.example;

import java.util.Objects;
import java.util.UUID;

public class hdfcBank implements bankInterface{


    private int balance;
    private String customerName;
    private String accountNumber;
    private double rateOfInterest;
    private String password;

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public String getPassword() {
        return password;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public hdfcBank(int bal, String name, String pass){
    this.balance = bal;
    this.customerName = name;
    this.password = pass;

    this.rateOfInterest = 6.5;
    this.accountNumber = String.valueOf(UUID.randomUUID());


  }
    @Override
    public void checkBalance(String pass) {
        if(Objects.equals(pass,password)){
            System.out.println("my balance is "+ balance);
        }
        else{
            System.out.println("wrong password try again");
        }
    }

    @Override
    public String addMoney(int amount) {
        balance += amount;
        return "Amount added successfully to your Account";
    }

    @Override
    public String withdrawMoney(int amount, String pass) {
        if(Objects.equals(pass,password)){
            if(amount>balance)
            {
                return "Not Possible because of the inSufficient Fund";
            }
            else {
                balance -= amount;
                return ("New updated balance is " + balance );
            }
        }
        else{
            return "wrong password try again";
        }
    }

    @Override
    public double interestRate(int year) {
        return (balance*rateOfInterest*year)/100;
    }
}
