package phonebookpractice;

import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    private Set<Contact> contactSet;

    public PhoneBook() {
        contactSet = new HashSet<>();
    }

    public Set<Contact> getContactSet() {
        return contactSet;
    }

    public void addContact(Contact contact) {
        contactSet.add(contact);

    }

    public Set<Contact> searchByFragment(String phoneFragment) {
        Set<Contact> matchedContacts = new HashSet<>();
        for (Contact contact : contactSet) {
            if (contact.getNumber().contains(phoneFragment)) {
                matchedContacts.add(contact);
                System.out.println("Fragment found: " + contact.getName() + " "
                        + contact.getNumber() + " "
                        + contact.getGroup());
            }
        }
        if (matchedContacts.isEmpty()) {
            System.out.println("Phone number does not exist");
        }
        return matchedContacts;
    }
}
