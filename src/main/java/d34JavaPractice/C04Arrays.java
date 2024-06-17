package d34JavaPractice;

public class C04Arrays {


    public static void main(String[] args) {


        //Type code to find all array elements that contain the substring "abc".

        String[] arr = new String[]{"abctest", "hello", "xyzabc", "testabcxyz", "noabc"};


     //Zakir Answer
//        for (String w:arr ) {
//            if (w.contains("abc")){
//                System.out.println(w);
//            }
//        }


   //Isa Answer

        for (String w:arr) {
            if(w.contains("abc")){
                System.out.println(w);
            }
        }


        //Melik

        for (int i = 0; i < args.length ; i++) {
            if (arr[i].contains("abc")){

                System.out.println(arr[i]);
            }

        }

    }
}
