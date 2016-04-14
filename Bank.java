package simple.bankproject;

/*
This should contain a collection of bank accounts associated with a bank
Ideally, this class will print to a file to store account information
Bank.createNewAccount --> Should create a new account under that bank
Use the code already written to build this class!
*/

public class Bank {

  public String bankName;
  private int totalAccounts = 0;
    public BankAccount[] allAccts = new BankAccount[3];

  public Bank() {
    bankName = "Danico Bank";
    totalAccounts = (totalAccounts + 1);
  }

  public void buildAccts(BankAccount newAcct, int indexNumber){

    allAccts[indexNumber] = newAcct;
      System.out.println("Account successfully created!");

  }

}