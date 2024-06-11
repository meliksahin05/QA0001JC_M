package d32Exceptions;

public class Exceptions7 {

    public static void main(String[] args) {


        //Illegalargument exception; when an invalid data is entered, this thrown in method.....


      try{
          ages(13);
          ages(-3);

      }catch (IllegalArgumentException e){
          System.out.println("This is illegalArgumentException");
          System.err.println("Exception ;" + e.getMessage());

      }
    }

    public static void ages(int age){


        if(age <0){

            throw new IllegalArgumentException("Ages can not be negative number or not be less than zero ");
            //Note: by using "throw new" we can throw an exception based on condition in our method....

        }else {
            System.out.println(age);
        }



    }
}
