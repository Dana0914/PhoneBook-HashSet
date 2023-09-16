package phonebookpractice;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Contact person1 = new Contact("John", "+784512", "friends");
        phoneBook.addContact(person1);
        Contact person2 = new Contact("Sam", "+785621", "work");
        phoneBook.addContact(person2);
        Contact person3 = new Contact("Lilly", "+784512", "family");
        phoneBook.addContact(person3);
        Contact person4 = new Contact("John", "+784512", "friends");
        phoneBook.addContact(person4);
        for (Contact contact : phoneBook.getContactSet()) {
            System.out.println(contact);
        }
        phoneBook.searchByFragment("512");
    }
}
