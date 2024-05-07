package d13StringManipulation_ForLoops;

public class ForLoops02 {

    public static void main(String[] args) {


        //Example; in the given string, print all the characters before "m" on the console

        String s = "Miami";

        //Mia
        //use "break" keyword....

          //break keyword.. IS USED TO EXIT LOOP WHEN THE CONDITION IS MET.....

        //Second way by using break keyword....

        for (int i=0;         i<s.length();           i++){




                             char ch = s.charAt(i);


                             if (ch == 'm'){
                                 break;
                             }





                         System.out.print(ch);




        }

    }
}
