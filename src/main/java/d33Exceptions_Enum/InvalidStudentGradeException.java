package d33Exceptions_Enum;

public class InvalidStudentGradeException extends Exception{
    //by interiting, i can make this class exception class

    public InvalidStudentGradeException(String message){

        super(message);
    }
}
