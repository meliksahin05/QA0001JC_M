package d14ForLoops_NestedLoops;

public class NestedLoops01 {

    public static void main(String[] args) {

        //Nested Loop

        /*
            for(){

                for(){

                }

           }


         */

        //type the code printing following output...

        /*
        Week 1:

            Day: 1
            Day: 2
            Day: 3

        Week 2:

            Day: 1
            Day: 2
            Day: 3

         */

      //Create an outer for loop
        for (int       i=1;                           i<=2;                           i++){


                                        System.out.println("Week " + i + ":");

             //Create an inner for loop
                                                      for (int k=1;            k<4;                    k++){




                                                                         System.out.println(" Day: " + k);
            }


        }
    }
}
