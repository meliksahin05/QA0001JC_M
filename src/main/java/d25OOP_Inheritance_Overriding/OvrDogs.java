package d25OOP_Inheritance_Overriding;

public class OvrDogs extends OvrMammal{

//    public void eat(){
//        System.out.println("Dog eat");
//    }
//
//    public void drink(){
//        System.out.println("Dog drink");
//    }

    public void bark(){

        System.out.println("Dog bark");
    }

    @Override //not mandatory
    public void eat() {
        System.out.println("Dogs eat");
    };

    public void price(){

        System.out.println("Phone price is 500");
    }

//    @Override
    public void feedWithMilk() {
        System.out.println("Dogs can not drink milk");
    }

    @Override
    public void drink() {
        System.out.println("Dogs drink water");
    }


}
