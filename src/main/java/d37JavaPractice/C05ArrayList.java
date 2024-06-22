package d37JavaPractice;

import java.util.ArrayList;

public class C05ArrayList {

    public static void main(String[] args) {


//        Decrease the value of every element that is greater than 20 by 5 in a list. If the element is 20 or less,
//        multiply it by 2.

//        [20, 30, 25, 20, 40]

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(25);
        numbers.add(20);
        numbers.add(40);

        System.out.println("numbers = " + numbers);

        for (int i = 0; i <numbers.size();  i++) {

            if (numbers.get(i) > 20){

                numbers.set(i, numbers.get(i)-5);
            }else {

                numbers.set(i, numbers.get(i)*2);

            }


        }
        System.out.println("numbers = " + numbers);


    }

}
