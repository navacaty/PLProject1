package nava.customer;

import java.lang.*;
import java.util.*;

import static nava.customer.CustomerDB.getcustomer_info;


public class CustomerApp {

    public static void main(String[] args) {
        // import scanner package for user input
        java.util.Scanner sc = new java.util.Scanner(System.in);
        // print opening statements
        System.out.println("Welcome to the Customer Viewer");
        //System.out.println("Enter a customer number: ");
        // intake user input for the customer number as integer
        //Integer CusNum = Integer.valueOf(sc.nextLine());
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            //Get the input from the user
            System.out.print("\nEnter a customer number: ");
            int CusNum = Integer.parseInt(sc.nextLine());
            Customer Cus1 = new Customer();
            Cus1.setcustomer_id(CusNum);
            //Cus1.setCustomer_id() = CusNum;
            getcustomer_info(CusNum);



            System.out.print("Display another customer? (y/n): ");
            choice = sc.nextLine();

        }




    }

}
