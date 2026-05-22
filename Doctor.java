package hospitalmanagement;

// Doctor class inherits Person
public class Doctor extends Person {

    String specialization;

    // Constructor
    public Doctor(String name, int age, Contact[] contacts, String specialization) {

        // Call parent constructor
        super(name, age, contacts);

        this.specialization = specialization;
    }

    // Overridden method
    @Override
    public void displayInfo() {

        System.out.println("===== Doctor Information =====");

        // Call parent method
        super.displayInfo();

        System.out.println("Specialization: " + specialization);

        System.out.println();
    }
}