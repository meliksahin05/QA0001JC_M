package JavaQuestionBank;

public class Car extends Vehicle {


    public Car() {
        super();
        System.out.println("H-pack");
    }

    public Car(String type){
        super("Acura", 2025,  "gas");
        System.out.println(type);
    }
}
