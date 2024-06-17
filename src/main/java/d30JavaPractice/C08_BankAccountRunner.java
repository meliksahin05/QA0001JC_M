package d30JavaPractice;

public class C08_BankAccountRunner {

    public static void main(String[] args) {

        //create an instance from bankacount class
        C08_BankAccount bankAccount = new C08_BankAccount();

        //Call accountNumber and balance to set...
        bankAccount.setAccountNumber("123456789");

        bankAccount.setBalance(1000);


        //Call deposit method from bank acoount
        bankAccount.deposit(500);
        System.out.println("Balance after deposit " + bankAccount.getBalance());

        //call withdraw method from bank account

        bankAccount.withDraw(200);
        System.out.println("Balance after withdraw " + bankAccount.getBalance());


        //call withdraw from bank account to make insufficient funds

        bankAccount.withDraw(2000);
        System.out.println("Amount is invalid ");
    }


}
