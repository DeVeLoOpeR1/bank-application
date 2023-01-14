package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //create object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Inital balance");
        int bal = sc.nextInt();
        System.out.println("Enter your Name");
        String name = sc.next();
        System.out.println("please Enter your password");
        String pass = sc.next();
        hdfcBank bank = new hdfcBank(bal,name,pass);

        // Add money to your account
        System.out.println("Enter the amount that you want to add ");
        int add = sc.nextInt();
        String msg = bank.addMoney(add);
        System.out.println(msg);

        // check your balance
        bank.checkBalance(pass);

        // withdraw money from your bank account
        System.out.println("please Enter the withdraw amount");
        int withdrawAmount = sc.nextInt();
        msg = bank.withdrawMoney(withdrawAmount,pass);
        System.out.println(msg);

        //rate of interest
        System.out.println("Enter the number of the year");
        int year = sc.nextInt();
       double hint = bank.interestRate(year);
        System.out.println("interest rate on fd "+ hint);


    }
}