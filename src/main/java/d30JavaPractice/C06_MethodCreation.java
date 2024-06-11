package d30JavaPractice;

public class C06_MethodCreation {

     // Write a method that takes three int parameters and calculates their sum, difference, multiply, and average.
    // Then, write a program that calls these methods and prints all the results.
    //// Define three numbers in Runner class
    //        int a = 10;
    //        int b = 5;
    //        int c = 2;

    //Method to calculate the sum of three numbers

    public int sum(int a ,int b, int c){

//        int total = a+b+c;

        return a+b+c;
//        return total;
    }




    //Method to calculate the difference of three numbers

    public int difference(int a, int b, int c){


        return a-b-c;
    }





    //Method to calculate the multiply of three numbers

    public  int multiply(int a, int b, int c){


        return a*b*c;
    }






   // Method to calculate the average of three numbers

    public double average(int a, int b, int c){



        return (a+b+c)/3.0;
    }


}
