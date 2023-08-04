package batch2.keywords;

public class MainClass {
    public static void main(String[] args) {
        Car carObj = new Car();
        carObj.speed = 100;
        carObj.fuel = 20;
        carObj.addFuel(100);
        carObj.applyBrakes(20);
        carObj.drive();

        Car carObj2 = new Car();
        carObj.speed = 50;
        carObj.fuel = 50;
        carObj.addFuel(20);
        carObj.applyBrakes(10);
        carObj.drive();

    }
}
