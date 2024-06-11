package d32Exceptions;

public class Exceptions04 {

    public static void main(String[] args) {


    //ArrayIndexOutOfBoundException; When you try to reach out an element out of boundry in array; this exception will be thrown
    //thrown to indicate that an array has been accessed with an illegal index.....
    // the index is either negative or greater than or equal to size of the array....

    String [] arr = {"j","a","v", "a"};


    getElementFromArray(arr,3);
    getElementFromArray(arr,5);

    }


    public static void getElementFromArray(String [] arr, int idx){


        String elm = null;
        try {
            elm = arr[idx];
            System.out.println(elm);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Index number can not be greater than " + (arr.length-1) + ".");
            System.out.println("You exceeded maximum number of elements in the storage");
            System.err.println("Index number can not be greater than  " + e.getMessage());// serr ==>shortcut
            e.printStackTrace();


        }

    }
}
