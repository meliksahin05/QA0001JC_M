package d34JavaPractice;

public class C01_Arrays {

    public static void main(String[] args) {



//    Count how many words contains 'a' or 'A' in a given String
        String s = "Apex is an object oriented programming language";


        // first step, use split method to get elements one by one into the array....

        String [] words =s.split(" ");
        int count = 0;

        for (String  w:words) {

            if (w.startsWith("A") || w.startsWith("a")){

                count ++;
            }

        }
        System.out.println("Count "+ count); // 2



    }
}
