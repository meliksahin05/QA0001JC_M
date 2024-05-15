package d18Arrays_MultidimensionArray;

import java.util.Arrays;

public class Arrays04 {

    public static void main(String[] args) {


        //Example 4; put the zero elements to the end in the given array...

        // [0,2,3,0,12,0] ==> [2,3,12,0,0,0]

        int [] arr = {0,2,3,0,12,0};


        System.out.println(Arrays.toString(arr)); //[0, 2, 3, 0, 12, 0]

        int [] newArr = new int[arr.length];

        System.out.println("Arrays.toString(newArr) = " + Arrays.toString(newArr)); //[0, 0, 0, 0, 0, 0]


        int index = 0;

        for (int w:arr){ //[0, 2, 3, 0, 12, 0]



                             if (w !=0){


                          newArr[index] = w;

                               index++;
            }

        }

        System.out.println("New array with zeros at the end ;" + Arrays.toString(newArr)); //[2, 3, 12, 0, 0, 0]


    }
}
