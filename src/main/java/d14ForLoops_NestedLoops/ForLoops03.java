package d14ForLoops_NestedLoops;

import java.util.Scanner;

public class ForLoops03 {

    public static void main(String[] args) {


        //Example; Calculate total value of the digits in the given integer....
        // 745 => 7+4+5 = 16
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number...");
        int num = scan.nextInt();




        int theValue = 23456;
        int sum = 0;

        for (int i=num;  i>0;  i /= 10){


                     sum = sum + i %10;
        }

        System.out.println("sum = " + sum);


        //Example; Print non-repeated characters of the given string on the console

        //loops ==> lps

        String s3 = "loops";
        String uniqueChars = "";


        //1) create a FOR Loop structure...

        for (int i=0; i<s3.length(); i++){


        //2) create char container to get characters one by one

            char ch = s3.charAt(i);

        //3) there is condition so to reach this condition, i need to use if structure....

            if (s3.indexOf(ch) == s3.lastIndexOf(ch)){

                uniqueChars = uniqueChars + ch;
            }

        }
        System.out.println("uniqueChars = " + uniqueChars);


    }

}
