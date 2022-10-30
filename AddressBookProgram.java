package addressbooksystem;

import java.util.Scanner;

public class AddressBookProgram {
    public static void address() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = scanner.next();

        System.out.println("Enter last name");
        String lastName = scanner.next();

        System.out.println("Enter Address");
        String address = scanner.next();

        System.out.println("Enter city");
        String city = scanner.next();

        System.out.println("Enter state");
        String state = scanner.next();

        System.out.println("Enter zip code");
        String zipCode = scanner.next();

        System.out.println("Enter phone number");
        long phoneNumber = scanner.nextLong();

        System.out.println("Enter Email");
        String emailId = scanner.next();

        System.out.println("First Name: " +firstName);
        System.out.println("Last Name: " +lastName);
        System.out.println("Address: " +address);
        System.out.println("City: " +city);
        System.out.println("State: " +state);
        System.out.println("Zip Code: " +zipCode);
        System.out.println("Phone number: " +phoneNumber);
        System.out.println("Email: " +emailId);
    }

    public static void main(String[] args) {
        //System.out.println("Welcome to Address Book");
        address();
    }


}
