package d36Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda04 {

    public static void main(String[] args) {

        //To use aggregate function, we are using reduce method...
        //Reduce methods => reduces the elements to min, max, avg or total value.....
        //also : if we want to find min value of the elements or total value of the elements, we can use reduce method.....


        //Create a list and calculate total value of the elements

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 3, 5, 11, 10));
        System.out.println(nums); //[2, 3, 3, 5, 11, 10]

        sumOfElements(nums); //34
        sumOfElements2(nums); //34
        sumOfUniqueElements(nums); //uniqueElements = 31
        sumOfUniqueEvenSquareElements(nums); //uniqueEvenElements = 104
    }

    //how to calculate total value of the elements
    public static void sumOfElements(List<Integer> nums) {


        int sum = 0;
        for (Integer w : nums) {

            sum = sum + w;


        }
        System.out.println(sum);
    }

    public static void sumOfElements2(List<Integer> nums){ //[2, 3, 3, 5, 11, 10]


      Integer sum = nums.stream().reduce(0, (t,u) ->  t+u);
      System.out.println("sum = " + sum); //34

        //reduce(0 , (t, u) -> t+u);
        //in reduce t is representing default value....
        //in reduce u is representing elements from the list.....
        //After doing additional, t is uptaded with the value of addtion result....

    }

    //remove the duplication value and calculate total value....

   public static void sumOfUniqueElements(List<Integer> nums){

       int uniqueElements = nums.stream().distinct().reduce(0, (t,u) ->  t+u);
       System.out.println("uniqueElements = " + uniqueElements); //uniqueElements = 31


   }

   //use square of even and unique data to have total value....

      public static void sumOfUniqueEvenSquareElements(List<Integer> nums){



      int uniqueEvenElements = nums.stream().distinct().filter(t -> t%2 ==0).map(t -> t*t).reduce(0, (t,u) -> t+u);
          System.out.println("uniqueEvenElements = " + uniqueEvenElements); //uniqueEvenElements = 104


      }
}
