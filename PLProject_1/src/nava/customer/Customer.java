package nava.customer;

/**
 * Created by tristanmiranda-sohrabji on 2/2/16.
 */
public class Customer {
    private int customer_id;
    public void setcustomer_id(int n){this.customer_id = n;}
    public int getcustomer_id() {return customer_id;}

    private String customer_name;
    public void setcustomer_name(String o){this.customer_name = o;}
    public String getcustomer_name() {return customer_name;}

    private String customer_address;
    public void setcustomer_address(String p){this.customer_address = p;}
    public String getcustomer_address() {return customer_address;}

    private String customer_city;
    public void setcustomer_city(String q){this.customer_city = q;}
    public String getcustomer_city() {return customer_city;}

    private String customer_state;
    public void setcustomer_state(String r){this.customer_state = r;}
    public String getcustomer_state() {return customer_state;}

    private String customer_postal;
    public void setcustomer_postal(String s){this.customer_postal = s;}
    public String getcustomer_postal() {return customer_postal;}

    private String NameandAddress = customer_name + customer_address + customer_city + customer_state + customer_postal;
    public String getNameandAddress() {return NameandAddress;}


}
