package org.bank.interfaces;

import java.util.ArrayList;

public interface IBranch<Customer> {
    String getName();
    ArrayList<Customer> getCustomers();
    boolean newCustomer(String customerName, double initialTransaction);
    boolean addCustomerTransaction(String customerName, double Transaction);
}
