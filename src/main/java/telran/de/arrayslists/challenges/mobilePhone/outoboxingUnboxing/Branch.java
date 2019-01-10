package telran.de.arrayslists.challenges.mobilePhone.outoboxingUnboxing;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String name;

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

    public boolean addCustomer(String customerName, Double initTransaction) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initTransaction));
            return true;
        } else {
            System.out.println("Customer already exists");
            return false;
        }
    }

    public boolean addNewTransaction(String customerName, Double transaction) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addMoney(transaction);
            return true;
        } else {
            return false;
        }
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            if (this.customers.get(i).getName().equals(customerName)) {
                return this.customers.get(i);
            }
        }
        return null;
    }
}
