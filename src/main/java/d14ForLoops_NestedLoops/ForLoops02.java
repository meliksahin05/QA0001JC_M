package d14ForLoops_NestedLoops;

public class ForLoops02 {

    public static void main(String[] args) {


        //Example; in the given string, print the string except lowercases in it.....
        // Pwd12?Ab => P12?A
        //continue keyword is used to skip a data when condition is met....


        String s1 = "Pwd12?Ab";

        //1)Create a for loop to get characters from the given string....
        for (int i=0; i<s1.length(); i++){

        //2) I need to take single characters from the given string so create a container by using char data type....

            char ch = s1.charAt(i);


        //3) i need to create a condition to ignore/skip the lowercases....
            if (ch >= 'a'&& ch <= 'z'){

                continue;
            }

            System.out.print(ch);

        }

        System.out.println("=======================================================");


        //Example7 Reverse the given string data
        // Java => avaJ    Hello => olleH Anna => annA (Pallindrome)
        String s2 = "Anna";


        //1) Create a place to store reversed version.....

        String reversed = "";


        //2) i need to create a for loop structure to take the characters one by one

        for (int         i=s2.length()-1;                    i>=0;                                i--){


        //3) I need to take character and do concatination then put your character into the reversed container....

            reversed =reversed + s2.charAt(i);


        }

        //4) Print the reversed data

        System.out.println("reversed = " + reversed);


        if (s2.equals(reversed)){

            System.out.println("This is pallindrome");
        }


    }
}
