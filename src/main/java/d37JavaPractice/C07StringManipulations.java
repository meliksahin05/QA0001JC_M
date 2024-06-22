package d37JavaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class C07StringManipulations {

    public static void main(String[] args) {


        //        Write a code that prints the longest word in a sentence taken from the user.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();

      String [] words = sentence.split(" ");
        System.out.println("Arrays.toString(words) = " + Arrays.toString(words));

        String longestWord = "";

        for (String w:words) {

            if (w.length() > longestWord.length()){

                longestWord = w;
            }

        }
        System.out.println("The longest word is " + longestWord);





    }
}
