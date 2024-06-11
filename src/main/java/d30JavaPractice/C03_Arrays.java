package d30JavaPractice;

public class C03_Arrays {

    public static void main(String[] args) {

//        Get the initials of the elements in a String array,
//        if the String ends with 'n' or 'k' Example: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Output is JJM

        //1st way.....
         String[] names = {"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};

         for (int i=0; i<names.length; i++){

             if(names[i].charAt(names[i].length()-1) == 'n' ||names[i].charAt(names[i].length()-1) =='k'){

                 System.out.print(names[i].charAt(0)); //JMJ
             }
         }

        System.out.println();


         //2. way

        String[] b = {"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};


        char  initials;


        for (String w:b) {


            if (w.endsWith("n") || w.endsWith("k")){

                System.out.print(w.charAt(0));//JMJ
//                System.out.println("w.substring(0,1) = " + w.substring(0, 1));
            }



        }




    }

}
