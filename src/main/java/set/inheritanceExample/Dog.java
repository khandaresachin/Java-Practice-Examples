package batch2.inheritanceExample;

public final class Dog extends Animal{

    private String name;

    public Dog(){
        super(); // works and calls the super class constructor
        this.name = "ABCD";

    }

    @Override
    public void eat() {
        super.eat(); //
    }

    public void bark(){
        System.out.println("I can bark");
    }
}
