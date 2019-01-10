package telran.de.arrayslists.challenges.mobilePhone.outoboxingUnboxing;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Deutsche Bank");
        bank.addBranch("Berlin");
        bank.addCustomer("Berlin", "Boriska", 3434.34);
        bank.addCustomer("Berlin", "Dimka", 2300.00);

        bank.addBranch("Dresden");
        bank.addCustomer("Dresden", "Nikolay", 5000.20);
        bank.addCustomer("Dresden", "Vasya", 300.34);

        bank.addTransaction("Berlin", "Boriska", 300.00);
        bank.addTransaction("Berlin", "Dimka", 4000.00);

        bank.showCustomers("Berlin", false);
        bank.showCustomers("Berlin", true);
    }
}
