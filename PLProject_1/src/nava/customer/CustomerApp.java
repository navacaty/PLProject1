package nava.customer;

import java.util.ArrayList;

public class CustomerApp {

    public static void main(String[] args) {
        // import scanner package for user input
        java.util.Scanner sc = new java.util.Scanner(System.in);
        // print opening statements
        System.out.println("Welcome to the Customer Viewer\n");
        System.out.println("Enter a customer number: ");
        // intake user input for the customer number as integer
        Integer CusNum = Integer.valueOf(sc.nextLine());

        // create list with the valid customer ids
        ArrayList Cus_list = new ArrayList(3);
        Cus_list.add(1001);
        Cus_list.add(1002);
        Cus_list.add(1003);
        for (int i = 0; i < Cus_list.size(); i++){
            System.out.println(Cus_list.get(i));
        }

        // creates first customer object NOTE:::: need to change Cus1001 --> 1001:::
        Customer Cus1001 = new Customer();
        Cus1001.setcustomer_id(1001);
        Cus1001.setcustomer_name("Barbara White");
        Cus1001.setcustomer_address("3400 Richmond Parkway #3423");
        Cus1001.setcustomer_city("Bristol");
        Cus1001.setcustomer_state("CT");
        Cus1001.setcustomer_postal("06010");

        // creates second customer object
        Customer Cus1002 = new Customer();
        Cus1002.setcustomer_id(1002);
        Cus1002.setcustomer_name("Karl Vang");
        Cus1002.setcustomer_address("327 Franklin Street");
        Cus1002.setcustomer_city("Edina");
        Cus1002.setcustomer_state("MN");
        Cus1002.setcustomer_postal("55435");

        // creates thrid customer object
        Customer Cus1003 = new Customer();
        Cus1003.setcustomer_id(1003);
        Cus1003.setcustomer_name("Ronda Chavan");
        Cus1003.setcustomer_address("518 Commanche Dr.");
        Cus1003.setcustomer_city("Greensboro");
        Cus1003.setcustomer_state("NC");
        Cus1003.setcustomer_postal("27410");

    }

}

