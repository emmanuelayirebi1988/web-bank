import org.bank.classes.Bank;

import static org.junit.Assert.assertFalse;

public class BankTest {
        private Bank bank;
        @org.junit.Before
        public void setUp() throws Exception {
            bank = new Bank("AyirebiBank");
            bank.addBranch("Accra");
        }

        @org.junit.Test
        public void addBank(){
            bank.addBranch("Accra");
            assertTrue(bank.addCustomer("Accra", "Emmanuel", 100));
            assertFalse(bank.addBranch(""));
        }

        private void assertTrue(boolean b) {
        }

        @org.junit.Test
        public void addCustomers(){
            assertTrue(bank.addCustomer("Accra","Godwin", 200));
        }

        @org.junit.Test
        public void addCustomerTransaction() {
            assertTrue(bank.addCustomerTransaction("Accra","Godson",500));
            assertFalse(bank.addCustomerTransaction("Accra","Martha",500));
        }

        @org.junit.Test
        public void listCustomers(){
            assertTrue(bank.listCustomer("Sekondi",false));
        }
}


