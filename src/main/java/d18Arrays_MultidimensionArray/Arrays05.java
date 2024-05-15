package d18Arrays_MultidimensionArray;

import java.util.Arrays;

public class Arrays05 {

    public static void main(String[] args) {

        //How to check if two arrays equal to each other.....

        int [] a = new int[3];
        a[0] = 5;
        a[1] = 6;
        a[2] = 4;

        System.out.println(Arrays.toString(a)); //[5, 6, 4]

        int[] b = new int[3];

        b[0] = 5;
        b[1] = 6;
        b[2] = 4;

        System.out.println(Arrays.toString(b));  //[6, 5, 4]


        //in order two arrays to equal to each other; same elements must be in same index.....
        //check if they equal....
        boolean check = Arrays.equals(a,b);
        System.out.println("check = " + check);


    }
}
