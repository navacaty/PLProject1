package nava.customer;

public class CustomerApp {

    public static void main(String[] args) {
        // import scanner package for user input
        java.util.Scanner sc = new java.util.Scanner(System.in);
        // print openning statements
        System.out.println("Welcome to the Customer Viewer\n");
        System.out.println("Enter a customer number: ");
        // intake user input for the customer number as integer
        Integer CusNum = Integer.valueOf(sc.nextLine());
        System.out.println(CusNum);

        // creates first customer object NOTE:::: need to change Cus1001 --> 1001:::
        Customer Cus1001 = new Customer();
        Cus1001.customer_id = 1001;
        Cus1001.customer_name = "Barbara White";
        Cus1001.customer_address = "3400 Richmond Parkway #3423";
        Cus1001.customer_city = "Bristol";
        Cus1001.customer_state = "CT";
        Cus1001.customer_postal = "06010";

        // creates second customer object
        Customer Cus1002 = new Customer();
        Cus1002.customer_id = 1002;
        Cus1002.customer_name = "Karl Vang";
        Cus1002.customer_address = "327 Franklin Street";
        Cus1002.customer_city = "Edina";
        Cus1002.customer_state = "MN";
        Cus1002.customer_postal = "55435";

        // creates thrid customer object
        Customer Cus1003 = new Customer();
        Cus1003.customer_id = 1003;
        Cus1003.customer_name = "Ronda Chavan";
        Cus1003.customer_address = "518 Commanche Dr.";
        Cus1003.customer_city = "Greensboro";
        Cus1003.customer_state = "NC";
        Cus1003.customer_postal = "27410";

    }

}

class Customer{
    int customer_id;
    String customer_name;
    String customer_address;
    String customer_city;
    String customer_state;
    String customer_postal;
}