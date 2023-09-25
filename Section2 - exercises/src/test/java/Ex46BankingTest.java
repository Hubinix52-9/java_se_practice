import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Ex46BankingTest {
    @Test
    public void testBankClass() {
        Ex46Banking.Bank bank = new Ex46Banking.Bank("National Australia Bank");
        Assert.assertTrue(bank.addBranch("Adelaide"));
        Assert.assertFalse(bank.addBranch("Adelaide")); // Adding duplicate branch
        Assert.assertTrue(bank.addCustomer("Adelaide", "Tim", 50.05));
        Assert.assertTrue(bank.addCustomer("Adelaide", "Mike", 175.34));
        Assert.assertFalse(bank.addCustomer("Adelaide", "Tim", 30.0)); // Adding duplicate customer
        Assert.assertTrue(bank.addCustomerTransaction("Adelaide", "Tim", 44.22));
        Assert.assertTrue(bank.addCustomerTransaction("Adelaide", "Mike", 1.65));

        Assert.assertNull(bank.findBranch("Nonexistent Branch"));
        Assert.assertNull(bank.findBranch("Adelaide").findCustomer("Nonexistent Customer"));
    }

    @Test
    public void testBranchClass() {
        Ex46Banking.Branch branch = new Ex46Banking.Branch("Adelaide");
        Assert.assertEquals("Adelaide", branch.getName());

        Assert.assertTrue(branch.newCustomer("Tim", 50.05));
        Assert.assertTrue(branch.newCustomer("Mike", 175.34));
        Assert.assertFalse(branch.newCustomer("Tim", 30.0)); // Adding duplicate customer

        Assert.assertTrue(branch.addCustomerTransaction("Tim", 44.22));
        Assert.assertTrue(branch.addCustomerTransaction("Mike", 1.65));
        Assert.assertFalse(branch.addCustomerTransaction("Nonexistent Customer", 1.0));

        Ex46Banking.Customer customer = branch.findCustomer("Tim");
        Assert.assertNotNull(customer);
        Assert.assertEquals("Tim", customer.getName());
    }

    @Test
    public void testCustomerClass() {
        Ex46Banking.Customer customer = new Ex46Banking.Customer("Tim", 50.05);
        Assert.assertEquals("Tim", customer.getName());

        customer.addTransaction(44.22);
        customer.addTransaction(12.44);
        ArrayList<Double> transactions = customer.getTransactions();
        Assert.assertEquals(3, transactions.size());
        Assert.assertEquals(50.05, transactions.get(0), 0.001);
        Assert.assertEquals(44.22, transactions.get(1), 0.001);
    }
}
