package simple.bankproject;

/*
This should contain a collection of bank accounts associated with a bank
Ideally, this class will print to a file to store account information
Bank.createNewAccount --> Should create a new account under that bank
Use the code already written to build this class!
*/

public class Bank {

  public String bankName = "Danico Bank";
  private int totalAccounts = 0;

  public Bank(String nameOfBank) {
    bankName = nameOfBank;
    totalAccounts = (totalAccounts + 1);
  }

}