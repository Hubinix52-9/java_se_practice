import java.util.ArrayList;

public class Ex46Banking {
    static class Bank{
        private String name;
        private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

        public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

        public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

        public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

        public Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

        public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            ArrayList<Customer> customers = branch.getCustomers();
            System.out.println("Customer details for branch " + branch.getName());
            for (int i = 0; i < customers.size(); i++) {
                Customer customer = customers.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i+1) + "]");
                if (showTransactions) {
                    ArrayList<Double> transactions = customer.getTransactions();
                    System.out.println("Transactions");
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]  Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
    }

    static class Branch {
        private String name;
        private ArrayList<Customer> customers;

        public Branch(String name) {
            this.name = name;
            this.customers = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public ArrayList<Customer> getCustomers() {
            return customers;
        }

        public boolean newCustomer(String customerName, double initialTransaction) {
            if (findCustomer(customerName) == null) {
                customers.add(new Customer(customerName, initialTransaction));
                return true;
            }
            return false;
        }

        public boolean addCustomerTransaction(String customerName, double transaction) {
            Customer customer = findCustomer(customerName);
            if (customer != null) {
                customer.addTransaction(transaction);
                return true;
            }
            return false;
        }

        public Customer findCustomer(String customerName) {
            for (Customer customer : customers) {
                if (customer.getName().equals(customerName)) {
                    return customer;
                }
            }
            return null;
        }
    }

    static class Customer {
        private String name;
        private ArrayList<Double> transactions;

        public Customer(String name, double initialTransaction) {
            this.name = name;
            this.transactions = new ArrayList<>();
            addTransaction(initialTransaction);
        }

        public String getName() {
            return name;
        }

        public ArrayList<Double> getTransactions() {
            return transactions;
        }

        public void addTransaction(double transaction) {
            transactions.add(transaction);
        }
    }
}
