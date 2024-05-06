package d13StringManipulation_ForLoops;

public class StringManipulation_isBlank_isEmpty {

    public static void main(String[] args) {


        //Example: checkt the given password if it meets the following conditions

        //it should not be empty
        //it should not contain just space characters, there must be others as well
        //it should not contain leading and ending spaces...


        //What is the difference between isEmpty() and isblank()?
        // isEmpty counts space character in the string value...
        //BUT isBlank does not count space character in the string data...

        String pass = "  ";

        boolean isEmpty = pass.isEmpty(  );
        System.out.println("isEmpty = " + isEmpty); //false

        boolean isBlank = pass.isBlank();
        System.out.println("isBlank = " + isBlank);


        String pwd = "  abc ";

        //it should not be empty
        boolean first = pwd.isEmpty(); //true // this first condition has some characters....
        System.out.println("first = " + first);

        //it should not contain just space characters, there must be others as well
        boolean second = !pwd.isBlank();
        System.out.println("second = " + second); //false

        //it should not contain leading and ending spaces...
        boolean third = pwd.trim().equals(pwd);


        System.out.println("======================================");

        //it should not be empty
        if (first){

            System.out.println("Password can not be empty");
        }

        //it should not contain just space characters, there must be others as well
        if (!second){

            System.out.println("There must be some characters other than spaces...");
        }

        //it should not contain leading and ending spaces...
        if (third){

            System.out.println("There should not be leading and ending spaces");
        }








    }
}
