package d30JavaPractice;

public class C02_Arrays {

    public static void main(String[] args) {
        //        Find the smallest positive element and greatest negative element in an integer array
//        Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2

        //sorted {-12, -5,-2,18,23}

        int numbers[] = {-12, -5, -2, 18, 23};


        for (int i = 0; i < numbers.length; i++) {


            if (numbers[i] < 0 && numbers[i + 1] > 0) {


                int smallestPositive = numbers[i + 1];


                int highestNegative = numbers[i];

                System.out.println("smallestPositive = " + smallestPositive);
                System.out.println("highestNegative = " + highestNegative);

            }


        }
    }
}






