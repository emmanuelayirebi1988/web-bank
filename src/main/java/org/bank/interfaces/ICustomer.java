package org.bank.interfaces;

import java.util.ArrayList;

public interface ICustomer {
    String getName();
//    ArrayList<Double> getTransaction();
    ArrayList<Double> getTransactions();
    void addTransaction(Double transaction);
}
