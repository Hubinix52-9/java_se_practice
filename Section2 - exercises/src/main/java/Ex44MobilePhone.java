import java.util.ArrayList;

public class Ex44MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public Ex44MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) == -1) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position != -1) {
            myContacts.set(position, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position != -1) {
            myContacts.remove(position);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position != -1) {
            return myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.print("Contact List:\n");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.print((i + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber()+"\n");
        }
    }
    public static class Contact {
        private String name;
        private String phoneNumber;

        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public static Contact createContact(String name, String phoneNumber) {
            return new Contact(name, phoneNumber);
        }
    }
}
