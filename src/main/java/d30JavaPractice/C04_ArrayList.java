package d30JavaPractice;

import java.util.ArrayList;

public class C04_ArrayList {

    public static void main(String[] args) {

       // Find the sum of all list elements before the first occurrence of 13 in an integer list
       //{12,31,7,13,10}  ==>50


        ArrayList<Integer> num = new ArrayList<>();

        num.add(12);
        num.add(31);
        num.add(7);
        num.add(13);
        num.add(10);
        int sum = 0;



        for(Integer w :    num){ // {12,31,7,13,10
            if(w == 13){
                break;
            }
            sum = sum + w;
        }
        System.out.println(sum); //50


        System.out.println("2.way");

        int [] a={12,31,7,13,10};
        int sum1 =0;
        for (int i=0;i<a.length;i++){

            if (a[i]!=13){
                sum1 = sum1 +a[i];

            }else break;
        }
        System.out.println(sum1); //50
    }
}


