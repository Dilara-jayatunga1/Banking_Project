/**
 * represent a customer of a bank
 */
public class Customer {
    //instance vars
    /**
     * Name of the customer
     */
    String name;

    /**
     * address of the customer
     */
    String address;

    //constructor

    /**
     * creates a customer with the given name
     * @param name of customer
     */

    public Customer(String name){
        //set instance var name to given name
        this.name = name;
    }

    //methods

    /**
     * sets the address of customer to given address
     * @param address for customer
     */
    public void setAddress(String address){
        this.address = address;
    }
    //if setAddress is called value of instance variable "address" will be modified globally.
    //later if any other method call this variable ,they will get the updated value

    /**
     * return customer's name
     * @return name of the customer
     */
    public String getName(){
        return this.name;
    }

    /**
     * return customer's address
     * @return address of the customer
     */
    public String getAddress(){
        return this.address = address;
    }

}
