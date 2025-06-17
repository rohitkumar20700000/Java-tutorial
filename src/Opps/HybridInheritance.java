package Opps;

// Base class
class Mother {
    void care() {
        System.out.println("Mother cares for her children.");
    }
}

// Single inheritance: Daughter inherits from Mother
class Daughter extends Mother {
    void study() {
        System.out.println("Daughter is studying.");
    }
}

// Multilevel inheritance: GrandDaughter inherits from Daughter
class GrandDaughter extends Daughter {
    void play() {
        System.out.println("GrandDaughter is playing.");
    }
}

// Hierarchical inheritance part 1: Another child Son inherits from Mother
// Also uses Interface to demonstrate hybrid combination
interface SonInterface {
    void work();
}

class Son extends Mother implements SonInterface {
    public void work() {
        System.out.println("Son is working in a company.");
    }

    void playGame() {
        System.out.println("Son is playing video games.");
    }
}

// Another class inheriting directly from Mother (to further show hierarchy)
class Baby extends Mother {
    void sleep() {
        System.out.println("Baby is sleeping peacefully.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        System.out.println("---Daughter---");
        Daughter daughter = new Daughter();
        daughter.care();    // from Mother
        daughter.study();   // own method

        System.out.println("\n---GrandDaughter---");
        GrandDaughter gdaughter = new GrandDaughter();
        gdaughter.care();   // from Mother
        gdaughter.study();  // from Daughter
        gdaughter.play();   // own method

        System.out.println("\n---Son---");
        Son son = new Son();
        son.care();         // from Mother
        son.work();         // from interface
        son.playGame();     // own method

        System.out.println("\n---Baby---");
        Baby baby = new Baby();
        baby.care();        // from Mother
        baby.sleep();       // own method
    }
}

//hybrid inheritance refers to combination of two or more types of inheritance:single ,multilevel,hybrid combination of any
