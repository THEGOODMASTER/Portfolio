import java.util.Scanner;
import java.util.Vector;

public class Contact {
        // No longer than 10 chars
        final String ID;

        // No longer than 10 chars
        String firstName;

        // No longer than 10 chars
        String lastName;

        // No longer than 10 chars
        String phone;

        // No longer than 30 chars
        String address;


        Contact(String ID, String firstName, String lastName, String phone, String address) {
                this.ID = ID;
                this.firstName = firstName;
                this.lastName = lastName;
                this.phone = phone;
                this.address = address;
        }
}