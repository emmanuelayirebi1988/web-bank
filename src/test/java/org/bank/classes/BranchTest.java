package org.bank.classes;

import junit.framework.TestCase;

public class BranchTest extends TestCase {
    Branch branch;
    public void setUp() throws Exception {
        branch = new Branch("Adelaide");
        super.setUp();
    }

    public void testTestGetName() {
        assertEquals("Adelaide", branch.getName());
    }

    public void testGetCustomers() {
        assertEquals("David",branch.getCustomers().get(0).getName());
        assertEquals("solomon",branch.getCustomers().get(0));
    }

    public void testNewCustomer() {
        assertTrue(branch.newCustomer("Lydia",500.00));
    }

    public void testAddCustomerTransaction() {
        branch.newCustomer("Emmanuel", 100);
        branch.addCustomerTransaction("Emmanuel", 200);
        assertEquals(2, branch.getCustomers().get(0).getTransactions().size());
    }
}