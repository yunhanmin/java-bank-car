/*
 * Project: BankAccount.java
 * Description: This is a bank account class.
 * Name: Hanmin Yun
 * Date: Oct 1, 2015
 */

public class BankAccount {
  
  private double balance; // amount of money in the account
  String name; // the person who owns the account
  int accPass;
  
  public BankAccount() {
    balance = 0;
    name = "John Doe";
    accPass = "123456";
  } // end empty constructor
  
  public BankAccount( double dollars, String person ) {
    this.balance = dollars;
    this.name = person;
    this.accPass = "123456";
  } // end constructor
  
  public void setPassword( String newPass ) {
    this.accPass = newPass;
  } // end setPassword
  
  public void deposit( double amt ) {
    this.balance += amt;
  } // end deposit()
  
  public void withdraw( double amt ) {
    this.balance -= amt;
  } // end withdraw()
  
  public double getBalance() {
   return balance; 
  } // end getBalance()
  
  public void getBalance( String password ) {
    if( accPass == password ) {
     System.out.println( "Account balance: $" + balance );
    } else {
      System.out.println( "Incorrect Password. Try again. ");
      return 0;
    }
  }
  
} // end class