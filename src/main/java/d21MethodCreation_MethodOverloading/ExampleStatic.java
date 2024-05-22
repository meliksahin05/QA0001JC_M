package d21MethodCreation_MethodOverloading;

public class ExampleStatic {

    public static void main(String[] args) {



      printText("Hello Java");

      //When the method is non-static; we need to create an instance/object to call method.....
        //Because non static members belong to objects wheareas static members belong to class directly....


    } //end of the main method

    //Access Modifier + static(optinal) +returnType+ methodName + () + {method body}

    public static void printText(String str){


        System.out.println(str);
        //if a method does not create a new data, return type will be "void"
        //which means dont use return keyword in body...
        //and dont declare any data type in method creation as return type....
        //the argument(data comes through parameter) is taken and just printed....



    }
}
