package Opps;

// Define the interface with related methods
interface AnimalActions {
    void animalSound();
    void run();
}

// Implement the interface in a class
class Cow implements AnimalActions {
    public void animalSound() {
        System.out.println("Cow says moo moo");
    }

    public void run() {
        System.out.println("Cow walks slowly");
    }
}

public class Interface {

    public static void main(String[] args) {
        Cow obj = new Cow();
        obj.animalSound();
        obj.run();
    }
}
//interface is the completely abstack class,used to group related methods with empty body
//interface cannot contain constructor. change the class name and give