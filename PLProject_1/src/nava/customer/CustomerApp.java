package nava.customer;

public class CustomerApp {

    public static void main(String[] args) {
        // import scanner package for user input
        java.util.Scanner sc = new java.util.Scanner(System.in);
        // print openning statements
        System.out.print("Welcome to the Customer Viewer\n");
        System.out.print("\nEnter a customer number: ");
        // intake user input for the customer number as integer
        Integer CusNum = Integer.valueOf(sc.nextLine());
        System.out.print(CusNum);

    }

}
