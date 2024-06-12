package d33Exceptions_Enum;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ExceptionRunner {

    public static void main(String[] args) {

        grade(-90);



    }

    public static void grade(int grade){

        if(grade<0 || grade>100){
           try{

               throw new InvalidStudentGradeException("Grade can not be less than zero or higher than 100");

           }catch (InvalidStudentGradeException ieo){
               ieo.printStackTrace();
               System.out.println(ieo.getCause());
           }

        }else {
            System.out.println(grade);
        }

    }
}
