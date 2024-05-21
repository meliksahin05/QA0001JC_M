package d20ArrayList_MethodCreation;

public class MethodCreation01 {

    public static void main(String[] args) {

        //Create a method in java; we can not create a method inside another method....
        //However, if inside a method (ex: main method) an inner class(nested class) can be defined....
        //And inside this  inner class, we can create methods....

        //But this local inner class, is accesible inside main method only. Can not be used outside main method....


//        System.out.println("addition(5,12,13) = " + addition(55,22));

        int value = addition(55,12);
        System.out.println("value = " + value);
        //how to create method in java

        //Access Modifier + static(optinal) +returnType+ methodName + () + {method body}
        //Created method are called in main method, we say "method call"

       int min = Math.min(15,16);


    } // end of main method


    //Example Create a method
     public static int addition (int a ,int b ){

        int totalValue = a*b;

//          return a+b; // return keyword gives the result back to where the method is called.....
           return totalValue;
     }

}
