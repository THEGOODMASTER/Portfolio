// All commented code will be used if/when a  UI is needed
import java.util.Scanner;
import java.util.Vector;

public class ContactService {
    Vector<Contact> v = new Vector<>();
    Scanner scnr;

    void NewContact(String usrID, String usrFName, String usrLName, String usrNum, String usrAddress){

        Contact c;
        String IDmanip;
        String ID;
        String fName;
        String lName;
        String num;
        String address;

        /*System.out.println("Please input an ID with a maximum of 10 characters.");
        IDmanip = scnr.nextLine();
        while (IDmanip.length() > 10 ){
            System.out.println("The ID needs to be 10 characters or less.");
            IDmanip = scnr.nextLine();
        }
        ID = IDmanip;

        System.out.println("Please input a first name with a maximum of 10 characters.");
        fName = scnr.nextLine();
        if(fName.length() > 10){
            System.out.println("The name needs to be 10 characters or less.");
            fName = scnr.nextLine();
        }

        System.out.println("Please input a last name with a maximum of 10 characters.");
        lName = scnr.nextLine();
        if(lName.length() > 10){
            System.out.println("The name needs to be 10 characters or less.");
            lName = scnr.nextLine();
        }

        System.out.println("Please input a phone number with exactly 10 characters.");
        num = scnr.nextLine();
        if(num.length() != 10){
            System.out.println("The number needs to be 10 characters in length.");
            num= scnr.nextLine();
        }

        System.out.println("Please input an address with a maximum of 30 characters.");
        address = scnr.nextLine();
        if(address.length() > 30){
            System.out.println("The address needs to be 30 characters or less.");
            address = scnr.nextLine();
        }*/
        c = new Contact(usrID, usrFName, usrLName, usrNum, usrAddress);
        v.add(c);
    }

    static void print(Contact con){
        System.out.println(con.ID + ", " + con.firstName + ", " + con.lastName + ", " + con.phone + ", " + con.address);
    }

    void delete(String usrID){
        for (int i = 0; i < v.size(); i++){
            if(v.elementAt(i).ID.equals(usrID)){
                v.remove(i);
            }
        }
    }

    void update(String usrID){
        for (int i = 0; i < v.size(); i++){
            Contact c = v.elementAt(i);
            if(c.ID.equals(usrID)){
                c.firstName = "SAMMY";
                c.lastName = "JOE";
                c.address = "1234 FOO Dr PITTSBURGH PA";
                c.phone = "1234567890";
                                /*System.out.println("Input a new first name with a maximum of 10 characters.");
                                c.firstName = scnr.nextLine();
                                if(c.firstName.length() > 10){
                                        System.out.println("The name needs to be 10 characters or less.");
                                        c.firstName = scnr.nextLine();
                                }

                                System.out.println("Input a new last name with a maximum of 10 characters.");
                                c.lastName = scnr.nextLine();
                                if(c.lastName.length() > 10){
                                        System.out.println("The name needs to be 10 characters or less.");
                                        c.lastName = scnr.nextLine();
                                }

                                System.out.println("Input a new phone number with exactly 10 characters.");
                                c.phone = scnr.nextLine();
                                if(c.phone.length() != 10){
                                        System.out.println("The number needs to be 10 characters in length.");
                                        c.phone = scnr.nextLine();
                                }

                                System.out.println("Input a new address with a maximum of 30 characters.");
                                c.address = scnr.nextLine();
                                if(c.address.length() > 30){
                                        System.out.println("The address needs to be 30 characters or less.");
                                        c.address = scnr.nextLine();
                                }*/
            }
        }
    }



    /*public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < v.size(); i++) {
            Contact.print(v.elementAt(i));
        }
        System.out.println("Input a number from 1 to 3 to select an action.");
        System.out.println("1: Add Contact");
        System.out.println("2: Delete Contact");
        System.out.println("3: Update Contact");
        int userNum = scanner.nextInt();
        switch (userNum) {
            case 1 -> v.add(NewContact());
            case 2 -> {
                System.out.println("Input the ID of the contact you want to delete.");
                String userID = scanner.nextLine();
                delete(v, userID);
            }
            case 3 -> {
                System.out.println("Give the ID of the contact you want to update.");
                String usrID = scanner.nextLine();
                update(v, usrID);
            }
        }

    }*/
}
