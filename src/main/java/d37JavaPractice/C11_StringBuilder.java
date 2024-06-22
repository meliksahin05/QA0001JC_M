package d37JavaPractice;

public class C11_StringBuilder {

    public static void main(String[] args) {


        //        Write a code that takes a sentence and reverses the order of the words in the sentence by using StringBuilder.
//       your code should maintain the spaces between words. If the input sentence is empty, print "The sentence is empty".


        String sentence = "Java is a versatile programming language";

         //Check if the sentence is empty

        if (sentence.isEmpty()){

            System.out.println("There is no sentence");

        } else {

            //i NEED TO GET OUR WORDS AS ELEMENTS
            String [] words = sentence.split(" ");

            //Use StringBuilder to reverse the order of words....

            StringBuilder reversedSentence = new StringBuilder(sentence);


            for (int i = words.length-1; i >=0 ; i--) {

                reversedSentence.append(words[i]);

                if (i != 0){

                    reversedSentence.append(" ");
                }


            }
            System.out.println("reversedSentence = " + reversedSentence); //language programming versatile a is Java
        }


    }
}
