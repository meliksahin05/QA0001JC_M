package d21MethodCreation_MethodOverloading;

public class MethodCreation02 {

    public static void main(String[] args) {


        //Access Modifier + static(optinal) +returnType+ methodName + () + {method body}
        System.out.println("multiplication(3,4,5) = " + multiplication(5, 4, 6));

      int total = multiply(5,10,12);

        System.out.println("total = " + total);

        printText("Hello Java");



    } //end the main method


    public static int multiplication (int x,int y, int z){

         int num = x +5;
         int num2 = y *2;


                 int totalValue = (num+num2);


        return (num+num2);

    }

    //Example2: Create a method with 3 parameter:
    //Multiply first two parameter and add 3rd parameter to the multiplication....

       public static int multiply(int a, int b, int c){

        int total = a*b+c;
        return total;
       }

       //Example3 Create a method to print entered text......
       public static void printText(String str){


           System.out.println(str);
           //if a method does not create a new data, return type will be "void"
           //which means dont use return keyword in body...
           //and dont declare any data type in method creation as return type....
           //the argument(data comes through parameter) is taken and just printed....



       }




    /*
    ACCESS MODIFIERS IN JAVA i)public ii)proctected iii)default iv)private

    1)Public access modifier: Everyone can access to everything. There is no restriction.
    Accessible from anywhere in the project

    2)Protected; Provides access to specific groups and subgroup of those groups
                 Accesible within its own package....
                 and accessible from outside the package but only through the intererance....

     3)Default; Allows the class members to be accessible within their own package...
                 Less restrictive than private, but more restrictive than protected and public....

     4)Private: Provide access to only the class members in which methods are created....

     */


}
