package Basics;

class Room {
    String name;

    Room(String name) {
        this.name = name;
    }
}

class House {
    // Composition: Rooms are part of House
    Room room1 = new Room("Bedroom");
    Room room2 = new Room("Kitchen");

    void showRooms() {
        System.out.println(room1.name);
        System.out.println(room2.name);
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        House house = new House();
        house.showRooms();
    }
}
//✅ Composition Example
//Composition represents a strong Has-A relationship where the child cannot exist independently of the parent.
//
//📌 Scenario:
//A House has Rooms. If the house is destroyed, all its rooms are also destroyed.
//❌ The Room objects are part of House—they don’t exist outside of it.


//🔑 Key Difference:
//Aspect	          Aggregation	                        Composition
//Life Cycle	Child can live independently	Child cannot live independently
//Type	           Weak relationship	              Strong relationship
//Example	        Student ↔ Library	                 Room ↔ House