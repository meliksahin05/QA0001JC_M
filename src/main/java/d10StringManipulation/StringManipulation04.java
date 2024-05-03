package d10StringManipulation;

public class StringManipulation04 {

    public static void main(String[] args) {

        //Example Catch first 4 characters in the given String

        //Substring(starting index) ===. returns part of the string by starting from specied index and to the end of string

        //substring (starting index , ending index) ==> returns part of string that begins with the character
        //specified in first parameter and extends to the character at ending index

        //NOTE: (starting index) first parameter is inclusuive
//        (ending index) second parameter is exclusive

        
        String s = "Java is funny";
        System.out.println("s.substring(0,3) = " + s.substring(0, 3));

        // this is hard way
        int numOfCharacterS = s.length();
        System.out.println("s.length() = " + numOfCharacterS);
        System.out.println(s.substring(0,numOfCharacterS));

        //2second way
        System.out.println("This is easiest way = s.substring(5) = " + s.substring(5));

        // i wanna see "funny" on the console

         //Zakir's answer
        System.out.println(s.substring(8)); // funny
        //Smitha's answer
        System.out.println("Printing just funny word "  + s.substring(8));
        //Isa's answer
        System.out.println("s.substring(8) = " + s.substring(8));














    }
}
