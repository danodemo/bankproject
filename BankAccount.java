package simple.bankproject;

import java.util.Scanner;

/*
This should store all the information about individual accounts
*/

public class BankAccount {

  public String firstName;
  public String lastName;
  public String accountCreatedOn;
  public double balance = 0.00;
  Scanner lineScanner = new Scanner(System.in);

  public BankAccount(){

    firstName = "Default";
    lastName = "User";
    accountCreatedOn = "Today";
    balance = 100.00;

  }

  public String getFullName() { 
    return firstName + " " + lastName; 
  }

  public BankAccount(String firstNameIn, String lastNameIn, String createdDate) {
    firstName = firstNameIn;
    lastName = lastNameIn;
    accountCreatedOn = createdDate;
    balance = 100.00;

  }

  public void checkBalance() {
    System.out.println("Your current balance is " + balance + " dollars.");
  }

  public void deposit() {
    System.out.println("How much would you like to deposit today?");
    String depositAmount = lineScanner.nextLine();
    balance = (balance + Double.parseDouble(depositAmount));
  }

  public void withdraw() {
    System.out.println("How much would you like to withdraw from this account?");
  }


}