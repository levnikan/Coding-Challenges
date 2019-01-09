package telran.de.arrayslists.challenges;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;

    public MobilePhone() {
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }

        myContacts.add(contact);
        return true;

    }

    public boolean updateContact(String oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact + ", was not found.");
            return false;
        } else if(findContact(newContact.getName()) == -1){
            System.out.println("Such name already exists");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(String name) {
        int foundPosition = findContact(name);
        if (foundPosition < 0) {
            System.out.println(name + ", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(name + ", was deleted.");
        return true;
    }

    private int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact getContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + "." +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }

    }


}
