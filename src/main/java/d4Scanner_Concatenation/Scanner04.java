package d4Scanner_Concatenation;

import java.util.Scanner;

public class Scanner04 {
    //First thing first main method

    public static void main(String[] args) {

     //newLine character ('ln') issue ; when we collect the data with more than one single.
        //skipping some entries is about entry stream in scanner

        //Especially with the methods like nextLn(),
        //nextShort, nextDouble, nextInt; we can encounter/face newLine issue

        //So we dont use newLine() after those numeric data methids or we need to eliminate the issue in another way
        //After NUMERIC data input, using nextLine() will be problematic for us


        Scanner  scanner = new Scanner(System.in);

        System.out.println("enter your age");

        int age = scanner.nextInt();

        String eliminateLn = scanner.nextLine();

        System.out.println("Enter your name");
        String name = scanner.nextLine();




    }
}
