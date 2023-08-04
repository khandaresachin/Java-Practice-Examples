package batch2.asbtractionExample;

public class MainClass {
    public static void main(String[] args) {
        AbstractClassExample obj = new SubClass();
        // We are creating object of SubClass and using reference of AbstractClassExample
        obj.show();
    }
}
