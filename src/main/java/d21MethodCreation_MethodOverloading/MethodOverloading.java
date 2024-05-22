package d21MethodCreation_MethodOverloading;

public class MethodOverloading {

    public static void main(String[] args) {

        //Polymorphisim= This is one of the principals in OOP concept....

        //Method OverLoading(static polymorphism) + method Overloading(dynamic polymorphism)

        /*
        in method overloading; we just modify parameters....
        There are two signatures in a method 1) Mehod name 2) Parameters
        But in the method overloading; method name must be the same. By changing parameters we do method overloading

         */
//        String s = "Hello";
//        s.substring(//begin index);
//        s.substring(//begin index , ending index);

        add(20);
    } //end of the main method

    public static void add(int a){
        System.out.println(a);
    }


    public static void add(double a, double b){
        System.out.println(a+b);
    }

    public static void add(int a, double b){

        System.out.println(a+b);

    }


    public static void add(int a , int b ,int c){
        System.out.println(a+b+c);
    }
    public static void add(double a, int b){

        System.out.println(a+b);
    }

    //To overload Method
    /*
    1) We can change the data type of parameters.
    2) we can change the number of parameters..
    3)We can change the places of parameters if data types are different from each other.....
     */
}
