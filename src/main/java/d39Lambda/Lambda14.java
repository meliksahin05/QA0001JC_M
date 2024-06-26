package d39Lambda;

import java.util.stream.IntStream;

public class Lambda14 {

    public static void main(String[] args) {


        System.out.println("getSumFromSevenToSeventy() = " + getSumFromSevenToSeventy());
        System.out.println("getMultFromThreeToNine() = " + getMultFromThreeToNine()); //181440
        System.out.println("getMultFromThreeToNine1() = " + getMultFromThreeToNine1()); //20160

        int result = getFactorail(-5);
        System.out.println(result); //120

        System.out.println("sumEvenNumbers() = " + sumEvenNumbers(10,5));







    }

        /*
    a) IntStream - Allows for sequential operations on primitive int values. (There's also LongStream, DoubleStream)
    b) range - Creates a stream that represents consecutive numbers between specified start (inclusive) and end
    values (exclusive).
    c) rangeClosed - Creates a stream that represents consecutive numbers between specified start (inclusive) and end
     values (inclusive).
    d) addExact - Adds two int or long values exactly. This method is in the Math class.
    e) getAsInt - A method found in the OptionalInt class. If a value is present, this method returns it.
    (We use this when we use IntStream)
    If a value is not present, it throws a NoSuchElementException.
    */


    //1) Write the code that gives the sum of all integers from 7 to 70


    public static int getSumFromSevenToSeventy() {


        return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt();

    }

    //write the code that gives multiplication of the numbers from 3-9(both inclusive)

    public static int getMultFromThreeToNine() {

        return IntStream.rangeClosed(3, 9).reduce((t, u) -> t * u).getAsInt();

//        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();
    }

    //write the code that gives multiplication of the numbers from 3-9(end is exclusive)

    public static int getMultFromThreeToNine1() {

        return IntStream.range(3, 9).reduce((t, u) -> t * u).getAsInt();

//        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();
    }

    //Calculate factorial with the code.....

    public static int getFactorail(int x) {

        if (x == 0) {
            return 1;
        } else if (x < 0) {

            System.out.println("Wrong data");
            return -1;

        } else {

            return IntStream.rangeClosed(1, x).reduce((t, u) -> t * u).getAsInt();
        }

    }

    //Create a method that gives sum of all the even integers between two entered number

    public static int sumEvenNumbers(int x ,int y){

        if(x>y){

            int temp = x;
            x = y;
            y = temp;
        }
        return IntStream.range(x,y).filter(num -> Utills.isNumberEven(num)).reduce((t,u) -> t+u).getAsInt();
    }
}






