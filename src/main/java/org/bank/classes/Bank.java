package org.bank.classes;

import org.bank.classes.Branch;
import org.bank.interfaces.IBank;

import java.util.ArrayList;

public class Bank<ArrayListList> implements IBank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public void Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    @Override
    public boolean addBranch(String branchName){
        // Check if customer does not already.
        // Don't allow branch without names to be added
        if(findBranch(branchName)==null && !branchName.equals("")){
            // Create new branch object with branch name
          Branch branch = new Branch(branchName);
        // Add the customer to the customers field and return true
        this.branches.add(branch);
        return true;
        }
        return false;
    }


    @Override
    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        // check if the branch exists
        if(findBranch(branchName) != null){
            //Add the customer to the branch and return true
            // if the customer already exists newCustomer() would return false
         return findBranch(branchName).newCustomer(customerName,initialTransaction);
        }
         // otherwise branch does not exist return false
        else return false;
    }


    @Override
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        // Check if the branch exist
        if(findBranch(branchName) != null){
          // add the transaction to the customer in the branch and return true
          // if customer does not exist or transaction is negative addCustomerTransaction() would return false
          return findBranch(branchName).addCustomerTransaction(customerName, transaction);
        }
        // otherwise branch does not exist return false
        else return false;
    }

    public Branch findBranch(String branchName){
        for (Branch branch : branches){
            if(branch.getName() .equalsIgnoreCase(branchName)){
                return branch;
            }
        }
        return null;
    }

    @Override
    public boolean listCustomer(String branchName, boolean printTransaction){
        // check if branch exist
        if(findBranch(branchName) != null){
            // get the branch exists
            Branch branch = findBranch(branchName);
            System.out.println("Customer details for branch" + branchName);
            // check if printTransaction is true
            if(printTransaction){
                // list the customers in the branch and print transaction
                for(Customer customer: branch.getCustomers()){
                    System.out.printf("\nCustomer: %s[%d]", customer.getName(),branch.getCustomers().indexOf(customer)+1);
                    System.out.println("\nTransaction");
                 for(int i = 0; i < customer.getTransactions().size(); i++){
                     System.out.printf("\n[%d] Amount %f", i+1, customer.getTransactions().get(i));
                 }
                }
            }
            // otherwise print just the customers
            else for(Customer customer: branch.getCustomers()){
                System.out.printf("\nCustomer: %s[%d]", customer.getName(),branch.getCustomers().indexOf(customer)+1);
            }
            return true;
        }
          // otherwise branch name does not exist return false;
        return false;
    }


}
