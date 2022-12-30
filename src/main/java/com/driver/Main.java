package com.driver;

public class Main {
    public static void main(String[] args) throws Exception {
        SavingsAccount sa=new SavingsAccount("Yaswanth",10000,1000,5);
        System.out.println(sa.getBalance());
        sa.withdraw(1000);
        System.out.println(sa.getBalance());
        System.out.println(sa.getCompoundInterest(4,5));
    }
}