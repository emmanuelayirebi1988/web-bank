package org.bank.classes;

import junit.framework.TestCase;

import static org.junit.Assert.assertNotEquals;

public class CustomerTest extends TestCase {
    Customer customer;
    public void setUp() throws Exception {
        super.setUp();
        customer = new Customer("Emmanuel", 100);
    }

    public void TestGetName() {
        assertEquals("johnson",customer.getName());
        assertNotEquals("Doris", customer.getName());
    }

    public void testAddTransaction() {
        customer.addTransaction(200.00);
        assertEquals(2,customer.getTransactions().size());
    }

    public void testGetTransactions() {
        assertNotEquals(2500.00,customer.getTransactions().get(0),0.0);

    }
}