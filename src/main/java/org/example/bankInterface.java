package org.example;

interface bankInterface {

    void checkBalance(String pass);
    String addMoney(int amount);
    String withdrawMoney(int amount, String pass);
    double interestRate(int year);
}
