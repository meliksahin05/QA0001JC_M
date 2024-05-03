package d11StringManipulation;

public class StringManipulation_Trim_Split {

    public static void main(String[] args) {


        //Example: Print initials of firstname and lastname of names given you

        String name = "     Mike Tyson   ";

        //trim() ==> removes spaces from begining and ending of string....

       char initialOfFirstName = name.trim().charAt(0);
        System.out.println("initialOfFirstName = " + initialOfFirstName);



        //Initials of lastname

        //split ==> split is cutting. Cut somewhere which is you want.....


           char initialsOfLastname = name.trim().split(" ")[1].charAt(0);
        System.out.println("initialsOfLastname = " + initialsOfLastname);

        System.out.println("" + initialOfFirstName+initialsOfLastname);






    }
}
