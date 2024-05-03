package d9StringManipulation;

public class StringManipulation01 {

    public static void main(String[] args) {



        //String data type: is used to store words, sentences, symbols etc....

        // Example; Check the given string and calculate total number of characters in string.....

        String s = "Java is so easy!";

        //length() ==> this method calculates number of characters including spaces in string.......

        int numberOfChars = s.length();


        System.out.println("numberOfChars = " + numberOfChars);


//        String s = "Java is so easy!";
        //Example: in the string above, catch first and last character then print on the console....

        //if you wanna see the single character in the string value, we can use "charAt()" method
        // charAt() method is working by using index number of string value....

        char firstChar = s.charAt(0); // returns character from index 0 in string

        System.out.println("firstChar = " + firstChar); //first chat = "J"


        char lastChar = s.charAt(15); // returns character from index 15 in string

        System.out.println("lastChar = " + lastChar); //LAST CHAR = ! // BUT THIS IS HARDCODING


        //dynamic way ==> recommended
        char lastChar1 = s.charAt(s.length()-1);

        String message = "Good Morning Dear Friends, today is amazing so lets learn java and earn money";

        //calculate number of characters and find first and the last characters....

        int legthOfMessage=message.length();

        System.out.println("legthOfMessage = " + legthOfMessage);
        char firstChar2 =message.charAt(0); // G
        System.out.println("firstChar = " + firstChar2);
        char lastChar2 =message.charAt(message.length()-1);
        System.out.println("lastChar = " + lastChar2);

        //String variables, all the characters locating in an index number..... start from 0(zero).....
        //Index is zero-based characteristic
        //First character is in index 0 everytime
        //And the index number increase from left to right one by one......


    }

}
