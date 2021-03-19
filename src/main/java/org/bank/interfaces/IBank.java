package org.bank.interfaces;

public interface IBank {
    boolean addBranch(String branchName);
    boolean addCustomer(String branchName, String customerName, double initialTransaction);
    boolean addCustomerTransaction(String branchName, String customerName, double Transaction);
    boolean listCustomer(String branchName, boolean printTransaction);
}
