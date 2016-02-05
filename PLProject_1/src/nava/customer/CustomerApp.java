package nava.customer;

import java.util.ArrayList;

public class CustomerApp {

    public static void main(String[] args) {
        // import scanner package for user input
        java.util.Scanner sc = new java.util.Scanner(System.in);
        // print opening statements
        System.out.println("Welcome to the Customer Viewer\n");
        //System.out.println("Enter a customer number: ");
        // intake user input for the customer number as integer
        //Integer CusNum = Integer.valueOf(sc.nextLine());
        string choice = "y";
        while (choice.equalsIgnoreCase("y")){
            //Get the input from the user
            System.out.print("Enter a customer number: ");
            int CusNum = sc.nextLine();
            Customer Cus1 = new Customer();
            Cus1.setCustomer_id = CusNum

        }




    }

}

