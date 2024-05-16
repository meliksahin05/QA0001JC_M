package d19MultiDimensionArrays_ArrayList;

public class MultiDimensionArrays03 {

    public static void main(String[] args) {


       //Example; create a md array in int data type,
        //calculate total value of min and max of the elements....

        int [][] numbers = {{11,4}, {13,43,21}};  // 4+43=47

        // Math.max() ===> this method will compare two values then return maximum value....
        // Math.min() ===> this method will compare two values then return minumum value....

        int min = numbers[0][0]; //11
        int max = numbers[0][0]; //11

        for (int [] w: numbers) {  // {{11,4}, {13,43,21}};

            for (int x:w) { //{11,4}    {13,43,21}

                                     min = Math.min(min, x);

                                      max = Math.max(max,x);
            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("Total value of min and max = " + (min+max));


    }
}
