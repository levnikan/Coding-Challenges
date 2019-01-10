package telran.de.arrayslists.challenges.mobilePhone.outoboxingUnboxing;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public String getName() {
        return name;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        } else {
            System.out.println("Branch already exists");
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, Double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomer(customerName, initialAmount);
        } else {
            return false;
        }
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getName().equals(branchName)) {
                return this.branches.get(i);
            }
        }
        return null;
    }

    public boolean addTransaction(String branchName, String customerName, Double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addNewTransaction(customerName, transaction);
        } else {
            return false;
        }
    }

    public void showBranches() {
        System.out.println(this.branches);
    }

    public boolean showCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (Customer customer : branchCustomers) {
                Customer branchCustomer = customer;
                System.out.println("Customer " + branchCustomer.getName());
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> customerTransactions = branchCustomer.getTransactions();
                    for (Double transaction : customerTransactions) {
                        System.out.println(transaction);
                    }
                }
            }
        }
        return false;
    }
}
