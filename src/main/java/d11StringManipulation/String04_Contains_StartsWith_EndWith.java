package d11StringManipulation;

public class String04_Contains_StartsWith_EndWith {

    public static void main(String[] args) {

        String s = "Java is funny";

        //Example check the given string data if it has "funny" in it..

        //provides it on the console.....

        boolean isFunny = s.contains("is funny");

        System.out.println("isFunny = " + isFunny);

        //Notes contains ==> provides check for the existence of specified substring


        // Example ; check the given string if it starts with "Java"

        //startsWith

        boolean startsWithJava = s.startsWith("Java");
        System.out.println("startsWithJava = " + startsWithJava);

        //Check the given string if "is" substring starts from index 5....

         boolean startsWith5index = s.startsWith("is", 5);

        System.out.println("startsWith5index = " + startsWith5index);


        //Example check the given string if ends with "funny"

        //use endsWith

       boolean endsWithFunny = s.endsWith("funny");
        System.out.println("endsWithFunny = " + endsWithFunny);


    }
}
