package batch2.inheritanceExample;

public class Animal {
    private String category;

    public Animal(){
    }

    public Animal(String category){
        this.category = category;
    }

    public void eat(){
        System.out.println("I can eat");
    }
}
