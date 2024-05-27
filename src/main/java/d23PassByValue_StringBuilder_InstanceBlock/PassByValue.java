package d23PassByValue_StringBuilder_InstanceBlock;

import java.util.Arrays;

public class PassByValue {

    public static void main(String[] args) {

        //PassbyValue ===> PassByValue focus on primitive data types and String..
        //PassByReferences  ===> PassByReferences focus on non-primitive data types...except String

        String str = "Java";
        String a = "Wolskwagen";

        String c;

        int number = 5;

        int [] arr = {1,2,3};

        method1(str); //JAVA
        method2(arr);
        method3(number);
        System.out.println("str = " + str); //Java
        System.out.println("number = " + number); //5
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr)); //[1, 9, 5]
    }

    private static void method1(String str ){

        str = str.toUpperCase();
        System.out.println("str = " + str); //JAVA




    }

    public static void method2(int[] arr){

        arr[1] = 9;
        arr[2] = 5;

    }

    public static void method3(int number){
         number = 10;
    }

    //When you send a data to a method as a parameter, actually you send the copy the data to parameter....
    //In the method, if the data is manipaluted/changed, it does not affect the original one
    //Java works on copy of the addresses from variables and objects...
    //This named "passbyValue"


    //PassByReferences
    //IF it was used, addresses would be ssent to methods as parameters without copy....
    //With the addresses, original data wolud be accessible and changeable....


    //1)Security;
    /*

    PassbyValue prevent changing data without control...
    increases security by keeping original data....


    2) Performance
    by preventing address change, operation will by performed faster....
     */

}
