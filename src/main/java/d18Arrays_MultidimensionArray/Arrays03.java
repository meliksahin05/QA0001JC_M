package d18Arrays_MultidimensionArray;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example; Create an array with 6 elements and print the number less than 5 on the console.....

        // 1, -3 ,-5 ,6, 7,5 ===> 1,-3,-5
//
//        //1st way to create an array......
//         int [] num = new int[6];
//         num[0] = 1;
//         num[1] = -3;
//         num[2] = -5;
//         num[3] = 6;
//         num[4] = 7;
//         num[5] = 5;

        //2nd way to create an array

        int [] numbers = {1,-3,-5,6,7,5};

        for(int i : numbers){

            if (i<5){

                System.out.println(i);
            }
        }

        //Example 2 ; Check the string array if a specific data exist in the array or not.....

        String letters [] = {"W", "O", "R", "L", "D"};

        //Binarysearch()==> returns index of specified element if exist....
        //binarysearch()===> sort() method should be used as prerequisite for binarysearch() method.....
       // If the specific data does not exist, binarysearch method returns negative value....

        // if you "-" ==> means there is no such element in the array......
        Arrays.sort(letters); //i sorted in alphabetical order....

        System.out.println("letters = " + Arrays.toString(letters)); //[D, L, O, R, W]

       int indexOfD = Arrays.binarySearch(letters, "D");

        System.out.println("indexOfD = " + indexOfD); //indexOfD = 0

        int indexOfR = Arrays.binarySearch(letters,"R");

        System.out.println("indexOfR = " + indexOfR);

        int indexOfP = Arrays.binarySearch(letters, "P");  //[D, L, O, P, R, W]

        System.out.println("indexOfP = " + indexOfP); //-4

        int indexOfE = Arrays.binarySearch(letters, "E");  //[D,E, L, O, R, W]

        System.out.println("indexOfE = " + indexOfE); //-2



        //==================================================

        int [] arr = {2,1,5,6}; //give me the index number of 5 and 3......

        //1) I NEED TO USE SORT METHOD()....

        Arrays.sort(arr); //sorted in asceding.....

        System.out.println("Sorted arr =" + (Arrays.toString(arr))); // [1, 2, 3, 5, 6]

        int indexOf5 = Arrays.binarySearch(arr, 0);
        System.out.println("indexOf5 = " + indexOf5);

        System.out.println("Arrays.binarySearch(arr ,5) = " + Arrays.binarySearch(arr, 5));

        int indexOf3 = Arrays.binarySearch(arr, 3); //-3
        System.out.println("indexOf5 = " + indexOf3);


        //example; Print the number of words in the given sentece....

        String s = "Java is easy Learn java earn money";

        String [] words = s.split(" ");

        System.out.println("Words = " + (Arrays.toString(words))); //Words = [Java, is, easy, Learn, java, earn, money]

        System.out.println("Total numbers of words = " + words.length);

        int totalNumberOfWords = words.length;

        System.out.println("totalNumberOfWords = " + totalNumberOfWords);


    }
}
