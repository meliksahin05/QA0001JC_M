package d18Arrays_MultidimensionArray;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MultiDimensionArrays01 {
    public static void main(String[] args) {


        //Multidimensional Array.....

        //Multidimensional array means putting arrays into the array....

        // the most common array is two dimensional

        // A two dimensional array consist of rows and columns, just like an excel sheet...

        //how to create md array with 3 outer and 2 inner elements....

        int[][] arr = new int[3][2]; // 3 element for outer and two element for inner....

        System.out.println(Arrays.toString(arr));

        System.out.println("Multidimensional array = " + (Arrays.deepToString(arr))); //  [[0, 0], [0, 0], [0, 0]]

        //When to print complex(multidimensional array) toString () method does not work. We need to use deeptoString() methods.....


        //How to add elements into md array ==> [[0, 0], [0, 0], [0, 0]]

        arr[0][0] = 5;
        arr[0][1] = 2;

        arr[1][0] = 31;
        arr[1][1] = 41;

        arr[2][0] = 45;
        arr[2][1] = 12;

        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr)); //[[5, 2], [31, 41, 45,7], [45, 12, 21]]

        //print second outer element of md array.....
//        System.out.println("Arrays.deepToString(arr[1]) = " + Arrays.deepToString(arr[1][0])); ===> give us error
        System.out.println("Arrays.toString(arr[1]) = " + Arrays.toString(arr[1])); //[31, 41]

        //print third outer of md array....
        System.out.println("Arrays.toString(arr[2]) = " + Arrays.toString(arr[2])); //[45,12]

        //print first element of third outer element.....
//        System.out.println("Arrays.toString(arr[2][0]) = " + Arrays.toString(arr[2][0]));  give us error....
        System.out.println("First element of third outer " + arr[2][0]); //45

        int[][] newArr = new int[3][3];
        System.out.println("Arrays.deepToString(newArr) = " + Arrays.deepToString(newArr));


        //Create md String array with 4 elements outer and put the inner elements in different size.....

        String [][] names = { {"Ali", "Jim"} , {"Mary" , "Jane", "Esma"}, {"Mike","Ronaldo"}   };

        System.out.println("Arrays.deepToString(names) = " + Arrays.deepToString(names)); // [[Ali, Jim], [Mary, Jane, Esma], [Mike, Ronaldo]]

        //Notes, we can use different size for inner array structures by assining the data directly.....

        //Example2 ; Create a md String array with 4 elements, dont define any size for inner array structures.....

        String[][] langs = new String[4][];

        System.out.println(Arrays.deepToString(langs)); // [null, null, null, null]

        langs[0] = new String[]{"Apple", "banana"};
        langs[1] = new String[]{"cat" ,"dog", "bird"};
        langs[2] = new String[]{"java" ,"python", "C", "javascript", "swift"};
        langs[3] = new String[]{"red" ,"blue", "yellow","red"};






        System.out.println("Arrays.deepToString(langs) = " + Arrays.deepToString(langs)); //[[Apple, banana], [cat, dog, bird], [java, python, C, javascript, swift], [red, blue]]

        //how to print elements from langs md array one by one......

        System.out.println("==================================================");
            /*
            Arrays.toString(inner) = [Apple, banana]
            Arrays.toString(inner) = [cat, dog, bird]
            Arrays.toString(inner) = [java, python, C, javascript, swift]
            Arrays.toString(inner) = [red, blue]
             */

        for (String [] inner: langs) {//[[Apple, banana], [cat, dog, bird], [java, python, C, javascript, swift], [red, blue]]




            System.out.println("Arrays.toString(inner) = " + Arrays.toString(inner));

            //how to print each elements of simple array structures in complex array......

            for (String elementOfInner : inner) { //[Apple, banana] [cat, dog, bird] [java, python, C, javascript, swift] [red, blue]

                System.out.println(elementOfInner);

            }

            System.out.println("=============================================");

        }





    }
}
