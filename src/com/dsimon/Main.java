package com.dsimon;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Doug", 54.96);
        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + ": " + customer.getBalance());

        // INSERTING INTO ARRAY CAN BE INTENSIVE BECAUSE EVERY ITEM NEEDS TO BE SHIFTED BY ONE
        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        System.out.println("intList: " + intList.toString());

        intList.add(1, 2);
        System.out.println("intList: " + intList.toString());
    }
}
