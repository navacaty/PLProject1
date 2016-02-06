package nava.customer;

/**
 * Created by tristanmiranda-sohrabji on 2/2/16.
 */
public class CustomerDB {
    //Caty: I'm using a templete from pg20 of the book
    public static void getcustomer_info(int customer_id) {
        //Creating the Customer Object
        Customer customer = new Customer();
        //Fill the Customer object with data
        customer.setcustomer_id(customer_id);
        //Don't remember if that is the proper why to finalize the if statement

        if (customer_id == 1001) {
            //Should it be more generalized [customer]or cus1001 as the object.
            customer.setcustomer_name("Barbara White");
            customer.setcustomer_address("3400 Richmond Parkway #3423");
            customer.setcustomer_city("Bristol");
            customer.setcustomer_state("CT");
            customer.setcustomer_postal("06010");
            System.out.println("\n" + customer.getcustomer_name() + "\n" + customer.getcustomer_address() + "\n" + customer.getcustomer_city() + ", " + customer.getcustomer_state() + " " + customer.getcustomer_postal() +"\n");

        }
        else if (customer_id == 1002) {

            customer.setcustomer_name("Karl Vang");
            customer.setcustomer_address("327 Franklin Street");
            customer.setcustomer_city("Edina");
            customer.setcustomer_state("MN");
            customer.setcustomer_postal("55435");
            System.out.println("\n" + customer.getcustomer_name() + "\n" + customer.getcustomer_address() + "\n" + customer.getcustomer_city() + ", " + customer.getcustomer_state() + " " + customer.getcustomer_postal() +"\n");

        }
        else if (customer_id == 1003) {
            customer.setcustomer_name("Ronda Chavan");
            customer.setcustomer_address("518 Commanche Dr.");
            customer.setcustomer_city("Greensboro");
            customer.setcustomer_state("NC");
            customer.setcustomer_postal("27410");
            System.out.println("\n" + customer.getcustomer_name() + "\n" + customer.getcustomer_address() + "\n" + customer.getcustomer_city() + ", " + customer.getcustomer_state() + " " + customer.getcustomer_postal() +"\n");


        }
        else {
                System.out.println("\nThere is no customer number " + customer_id + " in our records\n");
        }

    }

}