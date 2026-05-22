package hospitalmanagement;

// Parent class
public class Person {

    String name;
    int age;
    Contact[] contacts;

    // Constructor
    public Person(String name, int age, Contact[] contacts) {
        this.name = name;
        this.age = age;
        this.contacts = contacts;
    }

    // Method to display information
    public void displayInfo() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        System.out.println("Contacts:");

        // Loop to display all contacts
        for (int i = 0; i < contacts.length; i++) {
            System.out.println("Contact " + (i + 1) + ":");
            contacts[i].displayContact();
        }
    }
}