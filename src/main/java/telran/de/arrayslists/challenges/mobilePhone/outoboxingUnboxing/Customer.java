package telran.de.arrayslists.challenges.mobilePhone.outoboxingUnboxing;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions;
    private String name;

    public Customer(String name, Double initTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addMoney(initTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addMoney(Double addMoney) {
        transactions.add(addMoney);
    }
}
