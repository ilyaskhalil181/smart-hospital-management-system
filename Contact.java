package hospitalmanagement;

// Contact class
public class Contact {

    String phoneNumber;
    String city;

    // Constructor
    public Contact(String phoneNumber, String city) {
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    // Method to display contact information
    public void displayContact() {
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("City: " + city);
    }
}