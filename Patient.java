package hospitalmanagement;

// Patient class inherits Person
public class Patient extends Person {

    String disease;

    // Constructor
    public Patient(String name, int age, Contact[] contacts, String disease) {

        // Call parent constructor
        super(name, age, contacts);

        this.disease = disease;
    }

    // Overridden method
    @Override
    public void displayInfo() {

        System.out.println("===== Patient Information =====");

        // Call parent method
        super.displayInfo();

        System.out.println("Disease: " + disease);

        System.out.println();
    }
}