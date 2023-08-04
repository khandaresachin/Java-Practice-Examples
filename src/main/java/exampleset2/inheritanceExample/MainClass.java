package batch2.inheritanceExample;

public class MainClass {

    public static void main(String[] args) {
        Dog labObj = new Dog();
        labObj.eat();
        labObj.bark();

        final int THRESHOLD; // constant in java

        THRESHOLD =10; // first initialization

        System.out.println(THRESHOLD);

        //THRESHOLD =100 // After first initialization we can change the value of final variable
    }
}
