package d8Ternary_StringManipulation;

public class Ternary02 {

    public static void main(String[] args) {

      //Example; if two numbers have the same sign, then return multiplication of them
        // if signs are different, print "I can not multiply the number with different sign!!!

        int a = 54;
        int b = 5;


//        (condition) ? (multiplication) : ("I can not multiply the number with different sign!!!");
        Object result = ((a<0 && b<0) || (a>0 && b>0)) ? (a*b) : ("I can not multiply the number with different sign!!!");


        System.out.println("result = " + result);


        //Object is like ADAM for mankind. It is above all of the data types and covers all of them...
        //It used memory more, but sometimes we can use it to consider possible results in different data types...

        //Object is parent of all the classes and data types like Integer, int, String etc.....


    }
}
