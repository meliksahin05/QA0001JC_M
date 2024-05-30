package d26JavaPractice;

import java.util.Scanner;

public class C01_Scanner {

    //Get the user's weight and height then print their body index.....
    //weight/(height*height)

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your weight");

        double weight = scan.nextDouble();
//        int weight = scan.nextInt();

        System.out.println("Please enter your height");

        double height = scan.nextDouble();
//        int height = scan.nextInt();

           double bodyIndex = weight/(height*height);
        System.out.println("bodyIndex = " + bodyIndex);

    }


}
