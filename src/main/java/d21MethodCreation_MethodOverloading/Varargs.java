package d21MethodCreation_MethodOverloading;

public class Varargs {

    public static void main(String[] args) {

        //Your manager told you create a method calculating total value of exam results
        //there will be 6 exams per student..

        System.out.println(total(3, 3, 3, 7, 9));
        int totalValueOfExam = total(3,6,7);
        System.out.println("totalValueOfExam = " + totalValueOfExam);

    }

//    public static int total (int a, int b, int c){
//
//        return a+b+c;
//    }

    //Varargs; allows a method to get different number of parameters with a simple sytanx
    //Varargs; means "variable arguments" => allows different number of parameters in method....
    //You can creating parameters like a list...



    public static int total(int... a){

        int sum = 0;
        for (int w:a) {

           sum =sum + w;

        }
        return sum;
    }

    // you can not create varargs as the first parameter...
    //Varargs can be on the last parameter...

    //Varargs is following the rules:
   /*
   More than one varargs can not be used...
   Varags must be the last parameter in the method parenthesis.
   Varargs work in array structure in the background...
   Varargs parameter accept many arguments in the same data...
   Varargs parameter can be primitive data and non primitive data....
   total(int...a, int b)===> this is not accept   ||  total(int a, int... b)===> this is accept
    */



}
