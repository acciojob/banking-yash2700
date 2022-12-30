package com.driver;

public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount ba=new BankAccount("Yaswanth",1000,100);
        ba.deposit(10);
        System.out.println(ba.getBalance());
        ba.withdraw(1000);
        System.out.println(ba.getBalance());
    }
}