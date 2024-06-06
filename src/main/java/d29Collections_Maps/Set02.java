package d29Collections_Maps;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {

    public static void main(String[] args) {

        //Store student email addressses in natural order......

        //Email address are unieque. Thats why we need to use set....
        //Which set structure we need to use?

        //treeSet (because treeSet focus on natural order/ascending order)....

        long t1 = System.nanoTime();

        TreeSet<String> emails = new TreeSet<>();

        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("x@gmail.com");
        emails.add("v@gmail.com");
        emails.add("g@gmail.com");
        emails.add("t@gmail.com");
        emails.add("u@gmail.com");
        emails.add("b@gmail.com");
        System.out.println("emails = " + emails); //emails = [a@gmail.com, b@gmail.com, g@gmail.com, k@gmail.com, t@gmail.com, u@gmail.com, v@gmail.com, x@gmail.com]


        //I dont wanna focus on the natural order. I just wanna reach the result fastly, speed up...
        long t2 = System.nanoTime();

        HashSet<String> emailsHs = new HashSet<>();

        emailsHs.add("k@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("x@gmail.com");
        emailsHs.add("v@gmail.com");
        emailsHs.add("g@gmail.com");
        emailsHs.add("t@gmail.com");
        emailsHs.add("u@gmail.com");
        emailsHs.add("b@gmail.com");

        System.out.println("emailsHs = " + emailsHs); //// [b@gmail.com, k@gmail.com, g@gmail.com, t@gmail.com, x@gmail.com, v@gmail.com, u@gmail.com, a@gmail.com]

        long t3 = System.nanoTime();

        System.out.println(t2-t1); //28890333 treeSet
        System.out.println(t3-t2); //2839375  HashSet


//
//        HashSet<String> emailsHs2 =new HashSet<String>();
//        emailsHs2.addAll(emails);
//        System.out.println("emailsHs = " + emailsHs2);
//        emailsHs2.addAll(emailsHs);
//        System.out.println("emailsHs2 = " + emailsHs2);// [g@gmail.com, x@gmail.com, n@gmail.com, p@gmail.com, v@gmail.com, m@gmail.com, q@gmail.com, a@gmail.com, r@gmail.com, l@gmail.com, b@gmail.com, k@gmail.com, t@gmail.com, z@gmail.com, u@gmail.com]

        TreeSet<String> treeEmails = new TreeSet<>(emailsHs);
        System.out.println("treeEmails = " + treeEmails); //treeEmails = [a@gmail.com, b@gmail.com, g@gmail.com, k@gmail.com, t@gmail.com, u@gmail.com, v@gmail.com, x@gmail.com]
    }
}
