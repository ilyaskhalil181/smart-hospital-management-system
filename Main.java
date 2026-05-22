package hospitalmanagement;

public class Main {

    // MAIN METHOD
    public static void main(String[] args) {

        // Doctor 1 Contacts
        Contact[] doctor1Contacts = {
            new Contact("03001234567", "Karachi"),
            new Contact("03111222333", "Lahore")
        };

        // Doctor 2 Contacts
        Contact[] doctor2Contacts = {
            new Contact("03219876543", "Islamabad")
        };

        // Patient 1 Contacts
        Contact[] patient1Contacts = {
            new Contact("03335557777", "Hyderabad")
        };

        // Patient 2 Contacts
        Contact[] patient2Contacts = {
            new Contact("03446668888", "Multan"),
            new Contact("03557779999", "Peshawar")
        };

        // Create Doctor objects
        Doctor d1 = new Doctor(
                "Dr. Ahmed",
                45,
                doctor1Contacts,
                "Cardiologist"
        );

        Doctor d2 = new Doctor(
                "Dr. Sarah",
                38,
                doctor2Contacts,
                "Neurologist"
        );

        // Create Patient objects
        Patient p1 = new Patient(
                "Ali",
                22,
                patient1Contacts,
                "Fever"
        );

        Patient p2 = new Patient(
                "Ayesha",
                30,
                patient2Contacts,
                "Diabetes"
        );

        // Polymorphism
        Person[] people = {d1, d2, p1, p2};

        // Loop through all objects
        for (int i = 0; i < people.length; i++) {

            people[i].displayInfo();

            System.out.println("-----------------------------");
        }
    }
}