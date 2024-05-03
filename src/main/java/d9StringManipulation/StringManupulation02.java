package d9StringManipulation;

public class StringManupulation02 {

    public static void main(String[] args) {


        //Example: in the following string, replace "money" with "dollars

        //replace (x ,y) ===> first parameter is to remove and second parameter is to put something instead....
        //Logic is easy, remove something on the first parameter and put new something on the second parameter for the replace method....

        String str = "Learn java earn 3456 money";

        System.out.println(str);


        String newStr =str.replace("money","dollars");


        System.out.println("newStr = " + newStr);

        System.out.println(str);

//        String str = "Learn java earn 3456 money";
        //Example 2; Remove all the characters of "e" from the string above....
        // replace "e" with nothing

         String strWithoutE = str.replace("e","");
        System.out.println("strWithoutE = " + strWithoutE); // Larn java arn 3456 mony

        //We dont even put space in second parameter, just put nothing("").....

        String strWithSpace = str.replace("e"," ");
        System.out.println("strWithSpace = " + strWithSpace);

         /*

         To define a group of data, we use REGULAR EXPRESSION IN JAVA
         in shortly name is REGEX
         There are so many REGEX, but we will learn most common ones

         1) All DIGITS ===> [0-9]
         2) ALL LOWERCASE LETTERS ==> [a-z]
         3)ALL UPPERCASE LETTER [A-Z]
         4) ALL THE LETTERS ===> [a-zA-Z]
         5) ALL THE LETTERS AND DIGITS [a-zA-Z0-9]
         6) ALL PUNCTUATIONS ===> \\p{Punct}
         7) All vowels =========> [aeiouAEIOU]

         ALL  x, y , z ====> [xyz]
         From A-G and a-g =====> [A-Ga-g]

         //exclusive REGEX  ==> WE USE "^" TO EXCLUDE DEFINED GROUP OF DATA
         //It means "other than or except"

         8) All the characters other than digits ===> [^0-9]
         9) All the characters other than lowercase letters ===> [^a-z]
         9) All the characters other than Uppercase letters ===> [^A-Z]
         10) All the characters other than letters ===> [^a-zA-Z]
         11) All the characters other than space ===> [^ ]


         //in the following part, there is no square bracket

         12) only space character ===> \\s   //REMOVING SPACE
         13) EXCEPT SPACE CHARACTER ===> \\S  // STAYING SPACE
         14) Only Digits           ====> \\d  //Removing digits
         15) except digits         ====>  \\D // STAYING DIGIT

          */


//        1) All DIGITS ===> [0-9]
        //Example 3: in the given string above, convert all digits into ""....
//        String str = "Learn java earn 3456 money";
        //replaceAll(x,y) ==>>> first parameter for regex that we wanna remove, second parameter is to put something instead....
       String strWithStar = str.replaceAll("[0-9]", "*");
        System.out.println("strWithStar = " + strWithStar);

//        ALL LOWERCASE LETTERS ==> [a-z]
       String strWithoutLowerCase = str.replaceAll("[a-z]","1");
        System.out.println("strWithoutLowerCase = " + strWithoutLowerCase);

        //Example 4; Convert all digits into "*"
        String creditCard = "3424 3423 4123 9499";

        String privacyInformation =creditCard.replaceAll("[0-9]","*");
        System.out.println("privacyInformation = " + privacyInformation);


//        11) All the characters other than space ===> [^ ]
         String newSpace = creditCard.replaceAll("[^ ]", "");

         System.out.println("newSpace = " + newSpace);
         int newSpaceLength = newSpace.length();
         System.out.println("newSpaceLength = " + newSpaceLength);


        //        String str = "Learn java earn 3456 money";
        //Example 5; convert digits into "?" in the given string above
//        14) USE   "\\d"  //Removing digits

         String strWithQuestionMark = str.replaceAll("\\d","?");
        System.out.println("strWithQuestionMark = " + strWithQuestionMark);

        //Example: check the given string and calculate number of digits in it.....
        //        String str = "Learn java earn 3456 money";

        //removed all the characters other than digits...

        //our expected result is 4....

       int numberOfDigits = str.replaceAll("[^0-9]","").length();
        System.out.println("numberOfDigits = " + numberOfDigits);  //4

        //i removed all characters except digits,

        //and counted number of characters in remaining part (3456) with length();..........




    }
}
