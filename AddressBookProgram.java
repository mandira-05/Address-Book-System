package addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookProgram {

        Scanner scanner = new Scanner(System.in);

        //Considered arraylist -name contactList
        static ArrayList<ContactItems> contactList = new ArrayList<>();

        public void display(ArrayList < ContactItems > contactList) {
            for (ContactItems contactItems : contactList) {
                System.out.println(contactItems);
            }
        }

        //Method to add a contact
        public void addContact(ContactItems contactItems, ArrayList <ContactItems> contactList){

            contactItems = new ContactItems();

            System.out.println("Enter first name");
            contactItems.firstName = scanner.next();

            System.out.println("Enter last name");
            contactItems.lastName = scanner.next();

            System.out.println("Enter Address");
            contactItems.address = scanner.next();

            System.out.println("Enter city");
            contactItems.city = scanner.next();

            System.out.println("Enter state");
            contactItems.state = scanner.next();

            System.out.println("Enter zip code");
            contactItems.pinCode = scanner.nextInt();

            System.out.println("Enter phone number");
            contactItems.phoneNumber = scanner.nextLong();

            System.out.println("Enter Email");
            contactItems.email = scanner.next();

           contactList.add(contactItems);


        }

        //Method to edit existing contact in address book
        public void editContact() {
            System.out.println("Enter the first name to edit contact");
            String edit = scanner.next();
            System.out.println("Press 1 to edit first name");
            System.out.println("Press 2 to edit last name");
            System.out.println("Press 3 to edit address");
            System.out.println("Press 4 to edit city");
            System.out.println("Press 5 to edit state");
            System.out.println("Press 6 to edit pincode");
            System.out.println("Press 7 to edit Phone number");
            System.out.println("Press 8 to edit email");


            int choice = scanner.nextInt();
            if (choice == 1) {
                for (ContactItems contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new first name");
                        contactItems.firstName = scanner.next();
                    }
                }
            }

            if (choice == 2) {
                for (ContactItems contactItems : contactList) {
                    if (contactItems.firstName.equals(edit))  {
                        System.out.println("Enter new last name");
                        contactItems.lastName = scanner.next();
                    }
                }
            }
            if (choice == 3) {
                for (ContactItems contactItems : contactList) {
                    if (contactItems.firstName.equals(edit))  {
                        System.out.println("Enter new address");
                        contactItems.address = scanner.next();
                    }
                }
            }

            if (choice == 4) {
                for (ContactItems contactItems : contactList) {
                    if (contactItems.firstName.equals(edit))  {
                        System.out.println("Enter new city");
                        contactItems.city = scanner.next();
                    }
                }
            }

            if (choice == 5) {
                for (ContactItems contactItems : contactList) {
                    if (contactItems.firstName.equals(edit))  {
                        System.out.println("Enter new city");
                        contactItems.state = scanner.next();
                    }
                }
            }

            if (choice == 6) {
                for (ContactItems contactItems : contactList) {
                    if (contactItems.firstName.equals(edit))  {
                        System.out.println("Enter new Pin code");
                        contactItems.pinCode = scanner.nextInt();
                    }
                }
            }
            if (choice == 7) {
                for (ContactItems contactItems : contactList) {
                    if (contactItems.firstName.equals(edit))  {
                        System.out.println("Enter new Phone number");
                        contactItems.phoneNumber = scanner.nextLong();
                    }
                }
            }
            if (choice == 8) {
                for (ContactItems contactItems : contactList) {
                    if (contactItems.firstName.equals(edit))  {
                        System.out.println("Enter new email");
                        contactItems.email = scanner.next();
                    }
                }
            }
        }

        public void deleteContact(ArrayList<ContactItems> contactList) {
            System.out.println("Enter first name of contact you want to delete");
            String delete = scanner.next();
            contactList.removeIf(contactItems -> contactItems.firstName.equals(delete));
        }


        public void addContactList() {
            while (true) {   ///should run always
                System.out.println("Press 0 - Display all contacts");
                System.out.println("Press 1 - Add contact");
                System.out.println("Press 2 - Edit contact");
                System.out.println("Press 3 - Delete a contact");
                System.out.println("Press 4 - Exit");


                int option= scanner.nextInt();

                switch (option) {
                    case 0:
                        display(contactList);
                        break;
                    case 1:
                        addContact(null,contactList);
                        break;
                    case 2:
                        editContact();
                        break;
                    case 3:
                        deleteContact(contactList);
                        break;

                }
                if (option == 4) {
                    break;
                }
            }
        }

}
