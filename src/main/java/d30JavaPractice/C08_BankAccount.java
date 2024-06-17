package d30JavaPractice;

public class C08_BankAccount {

// Create a class called "BankAccount" with the following private properties: "accountNumber" (String), "balance" (double).
// Provide public getter and setter methods for the "accountNumber" and "balance" properties to allow controlled access to these properties.
// Write a method called "deposit" that takes an amount (double) as a parameter and adds it to the balance.
// Write a method called "withdraw" that takes an amount (double) as a parameter and subtracts it from the balance if there are sufficient funds; otherwise, print an error message.
// In the main method, create an instance of the "BankAccount" class, set the account number and initial balance, and test the deposit and withdraw methods.
    //set accountNumber = "123456789"
    //set balance = 1000
    // deposit = 500
    // withdraw = 200
    // Test insufficient funds = 2000

    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Create a method deposit method....
    public void deposit(double amount){

        if (amount>0){

            balance += amount;


        }else{
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withDraw(double amount){

        if(amount<=balance && amount>0){

            balance -= amount;

            System.out.println("Withdraw " + amount);
            System.out.println("Balance " + balance);
        }else{

            System.out.println("Insufficient funds or invalid amount"); //error message....
        }



    }



























}
