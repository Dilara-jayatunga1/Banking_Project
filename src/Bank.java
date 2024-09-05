  /*
   * represent a bank for managing customers and their bank accounts
   */

  import java.util.Scanner;

  public class Bank {
    public static void main(String[] args) {
        //create new instance of the bank class
      Bank bank = new Bank();

      //call the run method in the bank class
      bank.run();

    }
    /*
    run the program by initializing and managing ,bank accounts and customers
     */
    public void run(){
        System.out.println("Welcome to the bank. what is your name ?");
        //create an scanner to get user input
        Scanner in = new Scanner(System.in);

        //get the next token,which is the customers name
      String name = in.next();
      System.out.println("Hello" + name + "! we are creating checking and savings accounts for you");
      Customer customer = new Customer (name);

      //get address
      System.out.println("What is your address ?");

      //get the next token,which is customers address
      String address = in.next();

      customer.setAddress(address);

      //create a checking account
      BankAccount checkingAccount = new BankAccount("checking ", customer);

      //create a savings account for customer
      BankAccount savingsAccount  = new BankAccount("savings", customer) ;

    //get and print the customer info associating with the checking account
      System.out.println();
      System.out.println("customer info: ");
    System.out.println (checkingAccount.getCustomerInfo());

    //get and print account info checking account
      System.out.println("checking account: ");
    System.out.println(checkingAccount.getAccountInfo());

      System.out.println("savings account: ");
      System.out.println(savingsAccount.getAccountInfo());

    //deposits
      //into checking
      System.out.println();
      System.out.println("Amount to deposit into the checking account");
      double amount = in.nextDouble();
      checkingAccount.deposit(amount); //deposit into checking account

      //into savings
      System.out.println();
      System.out.println("Amount to deposit into the savings account");
       amount = in.nextDouble(); //get next token double
      savingsAccount.deposit(amount);

      //print new balances
      System.out.println(checkingAccount.getAccountInfo());
      System.out.println(savingsAccount.getAccountInfo());

      //withdrawals
      //from checking
      System.out.println();
      System.out.println("Amount you need to withdraw from your checking account: ");
      amount = in.nextDouble();

        try {
            checkingAccount.withdraw(amount);
        } catch (Exception e) {
          //print custom error message
            System.out.println(e.getMessage());
        }
//from savings
      System.out.println();
      System.out.println("Amount you need to withdraw from your savingd account: ");
      amount = in.nextDouble();

      try {
        savingsAccount.withdraw(amount);
      } catch (Exception e) {
        //print custom error message
        System.out.println(e.getMessage());
      }
      //print new balances
      System.out.println(checkingAccount.getAccountInfo());
      System.out.println(savingsAccount.getAccountInfo());

      in.close();

    }
}
