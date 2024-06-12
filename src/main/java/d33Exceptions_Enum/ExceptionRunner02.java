package d33Exceptions_Enum;

public class ExceptionRunner02 {

    public static void main(String[] args) {


        //numberOfStudents
        totalNumberOfStudents(-3);

    }

    public static void totalNumberOfStudents(int num){


        if (num<0) {

            try {
                throw new InvalidNumberException("Number of students can not be less than 0");


            } catch (InvalidNumberException e){
                System.out.println("mmmmm " + e.getCause());
                System.out.println("message " + e.getMessage());
                e.printStackTrace();

            }


        }else {
            System.out.println(num);
        }



    }
}
