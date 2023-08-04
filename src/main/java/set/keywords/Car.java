package batch2.keywords;

public class Car {

    public static int wheels = 4;

    double fuel;
    long speed;
    String name;

    public void addFuel(double additionalFuel){
        fuel += additionalFuel;
        System.out.println("Fuel is :"+ fuel);
    }

    public void applyBrakes(long applyBrake){
        speed = speed - applyBrake;
        System.out.println("Speed is "+ speed);
    }
    public void drive(){
        System.out.println("can drive");
        System.out.println(wheels);
    }

    public static void showCarDetails(){
        System.out.println(wheels);
    }

}
