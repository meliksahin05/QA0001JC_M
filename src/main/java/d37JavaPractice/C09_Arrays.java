package d37JavaPractice;

public class C09_Arrays {

    public static void main(String[] args) {




        // Finding the longest word(s) in a given string and printing their length, and print the longest word on the console....
        String s = "Java is a versatile and powerful programming language. Thats why we need to finish java homeworks";
        String [] words = s.replaceAll("[\\p{Punct}]","").trim().split(" ");

        String longestWord = "";

        for (String w:words) {

            if (w.length() > longestWord.length()){

                longestWord = w;
            }

        }
        System.out.println("The longest word is " + longestWord);
        System.out.println("Length of longest word is " + longestWord.length());


    }
}
