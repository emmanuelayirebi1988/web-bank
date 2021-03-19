package org.bank.classes;

import java.util.ArrayList;

import org.bank.interfaces.ICustomer;

public class Customer implements ICustomer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction){
        // set initial transaction to 0 if the valve provided is negative
//        initialTransaction = initialTransaction < 0 ? 0 : initialTransaction;
        // empty strings should not be allowed to be used as customer names
        if (!name.equals("")){
            this.name = name;
            // instantiate the transactions arrayList
            this.transactions = new ArrayList<Double>();
            // add the initialTransaction to the arrayList
//            this.transactions.add(initialTransaction);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void addTransaction(Double transaction) {
        this.transactions.add(transaction);
    }
    @Override
    public ArrayList<Double> getTransactions() {
        // Don't allow negative transactions.
        return transactions;
    }
}
