package org.bank.classes;


import org.bank.interfaces.IBranch;

import java.util.ArrayList;

public class Branch implements IBranch {
    private String name;
    private ArrayList<Customer> customers;
    
    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public ArrayList<Customer> getCustomers(){
        return this.customers;
    }

    @Override
    public boolean newCustomer(String customerName, double initialTransaction){
        // Check if customer does not exist already.
        // Do not allow empty strings to be passed as name
        if(findCustomer(customerName)==null){
            // Create new customer object with customer name and the initial transaction
             Customer customer = new Customer(customerName, initialTransaction);
            // Add the customer to the customer field
            customers.add(customer);
            return true;
        }
        else return false;
    }
    
    @Override
    public boolean addCustomerTransaction(String customerName, double transaction){
       // Check if the customer exist and the transaction is greater than 0
       if((findCustomer(customerName) != null) && transaction > 0){
       //Add transaction to the customer returned by the findCustomer()method
          findCustomer(customerName). addTransaction(transaction);
          return true;
       }
       else return false;
    }

    private Customer findCustomer(String customerName) {
        // loop through the customers array list
        for(Customer customer: this.customers) {
            // Check if the current name is equal to the provided customerName
            if (customer.getName().equalsIgnoreCase(customerName)) {
                // return the customer object if the name matches
                return customer;
            }
        }
        // Otherwise return null
        return null;
    }
}
