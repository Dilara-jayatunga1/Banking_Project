

/*
  represent a checking/saving account for a customer
 */
public class BankAccount {
    //instance variables

    /**
     * type of account (checking/saving)
     */
    String accountType;

    /**
     * balance for the bank account
     */
    double balance;

    /**
     * Customer for this account
     */
    Customer customer;

    //constructor

    /**
     * creates a bank account of given type for given customer.
     * @param accountType for bank account
     * @param customer for bank account
     */
    public BankAccount(String accountType, Customer customer) {
        this.accountType = accountType;
        this.customer = customer;
        }


    //methods

    /**
     * deposit the given amount
     * @param amount to the balance
     */
    public void deposit(double amount){
        this.balance += amount;
    }

    /**
     * withdraw the given amount from the balance
     * @param amount to withdraw
     * @throws Exception if given amount is larger than available balance
     */
    public void withdraw(double amount)throws Exception{
        if (amount > this.balance){
            throw new Exception("Amount is greater than balance. ");
        }
        this.balance -= amount;
    }

    /**
     * return account type and balance for this bank account
     * @return string with all the info
     */
    public String getAccountInfo(){
        return this.accountType + ":" + this.balance;
     }

    /**
     * return the customer name and address for this bank account
     * @return string with all the info
     */
     public String getCustomerInfo(){
        return this.customer.getName() + "from" + this.customer.getAddress();
     }

}
