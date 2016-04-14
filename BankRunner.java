package simple.bankproject;

import java.util.Scanner;
import java.time.Instant;

public class BankRunner {

  public static BankAccount currentAccount;
  public static Bank myBank = new Bank();

  public static void main (String[] args){
    clearScreen();
    welcome();
    try { userMenu(); } catch(Exception exception) { exception.getMessage(); }

  }

  public static void userMenu() throws Exception {
    print(" ");
    print("Please choose an action:");
    print(" ");
    sleep(250);
    print("1. Check Current Balance");
    print("2. Deposit");
    print("3. Withdraw");
    //print("4. Change Accounts");
    print("5. Exit Bank");
    Scanner lineScanner = new Scanner(System.in);
    String userRawInput = lineScanner.nextLine();
    if (Integer.parseInt(userRawInput) == 1){
      clearScreen();
      currentAccount.checkBalance();
      sleep(500);
      userMenu();
    } else if (Integer.parseInt(userRawInput) == 2){
      clearScreen();
      currentAccount.deposit();
      print("You have successfully deposited money.  Your updated balance is " + currentAccount.balance + " dollars.");
      userMenu();
    } else if (Integer.parseInt(userRawInput) == 3){
      clearScreen();
      currentAccount.withdraw();
      print("You have successfully withdrawn money.  Your updated balance is " + currentAccount.balance + " dollars.");
      userMenu();
    }/* else if (Integer.parseInt(userRawInput) == 4){
      clearScreen();
      print("This would allow you to change accounts if it worked, which it doesn't.");
      userMenu();
    } */else if (Integer.parseInt(userRawInput) == 5){
      print("Now exiting the bank.  Have a good day!");
      System.exit(0);
    } else {
      throw new Exception("That isn't a valid choice!");
    }
  }

  public static void welcome() {
    print("Welcome to Danico Banking Systems.  You are now connected!");
    sleep(2000);
    print("Congratulations on being accepted to the beta of our new banking software.");
    sleep(2000);
    print(" ");
    print(" ");
    print(" ");
    //prompt for login or create
    print("Would you like to (1)Login or (2)Create New User? Press any other key to exit.");
    Scanner lineScanner = new Scanner(System.in);
    String userInput = lineScanner.nextLine();
    //int userChoice = (Integer.parseInt(userInput));
      if ((Integer.parseInt(userInput)) == 1) {
        //login();
          print("This should take you to login.");
      } else if ((Integer.parseInt(userInput)) == 2) {
          currentAccount = createNewAccount();
          print("Hello, " + currentAccount.getFullName() + ". How can we help you today?");
      } else {
        print("You are now exiting the program.");
      }
  }
  /*
  public static void login() {

    

  }
  */

  public static BankAccount createNewAccount () {
    Scanner lineScanner = new Scanner(System.in);
    clearScreen();
    print("Creating a new account...");
    sleep(500);
    print("What is your first name?");
      String firstName = lineScanner.nextLine();
    clearScreen();
    print("First name = " + firstName);
    sleep(500);
    print(" ");
    print("What is your last name?");
      String lastName = lineScanner.nextLine();
    clearScreen();
    print("Fist name = " + firstName);
    print("Last name = " + lastName);
    sleep(500);
    print("");
      String createdDate = timeStamp();
      BankAccount newAccount = new BankAccount(firstName, lastName, createdDate);
      myBank.buildAccts(newAccount, 0); //ADD FOR LOOP TO GET INDEXES
              //Write to file methods for BANK and BANKACCOUNTS should go here.

          return newAccount;
    }


  private static void clearScreen() {
    System.out.print("\033[H\033[2J");
  }

  private static void sleep(int sleepTime){
    //sleepTime(1000) = 1 second
    try {
      Thread.sleep(sleepTime);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
    }
  }

  private static void print(String message){
    System.out.println(message);
  }

  private static String timeStamp() {
    Instant timeStampInstant = Instant.now();
    String timeStamp = timeStampInstant.toString();
    return timeStamp;
  }

}