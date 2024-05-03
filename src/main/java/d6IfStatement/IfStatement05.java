package d6IfStatement;

import java.util.Scanner;

public class IfStatement05 {

    public static void main(String[] args) {

        //Example Check the given day name, and print Weekend or Weekday, accordingly...

        //Monday - Friday ==> Weekday
        //Saturday- Sunday == Weekend

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day name and i say weekday or weekend!");

        String day = input.next();

        // equals () compares two string and return true or false
        //equals() method is a case sensetive method for string data
        //If we wanna ignore being uppercase or lowercase of string
        // you can use equalsignorecase


        if(day.equalsIgnoreCase("Monday")){
            System.out.println("Weekday");
        } else if (day.equals("Tuesday")) {

            System.out.println("Weekday");
        } else if (day.equalsIgnoreCase("Wednesday")) {

            System.out.println("Weekday");
        } else if (day.equalsIgnoreCase("Thursday")) {

            System.out.println("Weekday");
        } else if (day.equalsIgnoreCase("Friday")) {

            System.out.println("Weekday");
        } else if (day.equalsIgnoreCase("Saturday")) {

            System.out.println("Weekend");
        } else if (day.equalsIgnoreCase("Sunday")) {

            System.out.println("Weekend");
        } else {
            System.out.println(" you gave invalid day");
        }

        boolean weekendContion = day.equals("Saturday") || day.equals("sunday");
        boolean weekdayCondition = day.equals("Monday") || day.equals("Tuesday")  || day.equals("Wednesday") || day.equals("Thursday")
                || day.equals("Friday");


        if(weekendContion){
            System.out.println("Weekend!");
        } else{
            System.out.println("Weekday");
        }


        //2. way

        boolean weekendCondition1 = day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday");
        boolean weekdayCondition1 = day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") ||
        day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday")
        || day.equalsIgnoreCase("Friday");

        if(weekendCondition1){
            System.out.println("Weekend");
        } else if (weekdayCondition1) {
            System.out.println("Weekday");

        } else {
            System.out.println("Invalid day name!");
        }


        char a = '?';
        System.out.println(a);

    }
}
