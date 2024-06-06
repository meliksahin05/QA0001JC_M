package d27OOP_Collections;

public class StudentRunner {

    public static void main(String[] args) {

        Student std = new Student();

        System.out.println(std.name);
//        System.out.println(std.age);
//        System.out.println(std.isSuccessfull);

        System.out.println(std.getName());
        System.out.println(std.getAge());
        System.out.println(std.getIsSuccessfull());

        std.setName("Cristiano");
        System.out.println(std.getName());

        std.setAge(44);
        System.out.println(std.getAge());

        std.setIsSuccessfull(false);
        System.out.println(std.getIsSuccessfull());

        std.setEngine(5);
        System.out.println(std.getEngine());


    }
}
