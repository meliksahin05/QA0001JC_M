package d12StringManipulation;

public class StringManipulation_IndexOf {

    public static void main(String[] args) {


        //Example Catch the domain name from the given email....
        //domain ==> gmail

        String email = "abcd@gmail.com";

        //1st way

        String domainByUsingSplit = email.split("@")[1].split("\\.")[0];

        System.out.println("domainByUsingSplit = " + domainByUsingSplit);


        //2nd dynamic way

        String email1 = "abcd@gmail.com";

        //indexOf ==> it will give me first occurunce of the specified character.....

        int startingIndex = email1.indexOf("@")+1;

        int endingIndex = email1.indexOf(".");

        String domain1 = email1.substring(startingIndex,endingIndex);

        System.out.println("domain1 = " + domain1);


        //Most dynamic way

        //lastIndexOf() ==. it willl give me last occurence of the specified character....
        String email2 = "abcd@gmail.com.tr";

        int startingIndex2 = email2.indexOf("@")+1; //5
        System.out.println("startingIndex2 = " + startingIndex2);

        int endingIndex2 = email2.lastIndexOf("."); //10

        System.out.println("endingIndex2 = " + endingIndex2);

        String domain2 = email2.substring(startingIndex2,endingIndex2);

        System.out.println("domain2 = " + domain2);


        String domain3 = email2.substring(5,10);
        System.out.println("domain3 = " + domain3);


    }
}
