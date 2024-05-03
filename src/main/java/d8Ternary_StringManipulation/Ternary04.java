package d8Ternary_StringManipulation;

public class Ternary04 {

    public static void main(String[] args) {


        //Nested ternary

        // (condition) ? (condition ? (true part) : (false part) : (Condition ? (true part) : (false part);

        //What is leap year?
        //One year is leap year ===> 365 days + 6 hours ==> those 6 hours become a day in 4 years....


        //divisible by 100 ==> must be divisible by 400
        // not divisible by 100 ==> must be divisible by 4    to learn the leap year


        int year = 300;

      String isLeap =  (year%100 == 0) ? (year%400 == 0 ? "Leap year " : "is not leap year"):
                        (year%4 == 0 ? "Leap Year" : "Not a leap year");

        System.out.println("isLeap = " + isLeap);
    }
}
