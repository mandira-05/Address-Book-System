package addressbooksystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        //address();
        //Main main = new Main ();
        //main.addContact();
        AddressBookProgram addressBookProgram = new AddressBookProgram();
        addressBookProgram.addContactList();
    }
}
