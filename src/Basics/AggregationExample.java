package Basics;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

class Library {
    // Aggregation: Library has a list of Students
    Student[] students;

    Library(Student[] students) {
        this.students = students;
    }

    void showStudents() {
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Student[] studs = {
            new Student("John"),
            new Student("Emma")
        };
        Library lib = new Library(studs);
        lib.showStudents();
    }
}
//✅ Aggregation Example
//Aggregation represents a weak Has-A relationship where the child can exist independently of the parent.
//
//📌 Scenario:
//A Library has Students. Even if the library is destroyed, students still exist.
//✅ Even if Library is destroyed, Student objects still exist.

//Aggregation: Aggregation is one of the core concepts of object-oriented programming. 
//It focuses on establishing a Has-A relationship between two classes.
//In other words, two aggregated objects have their own life cycle but one of the objects has an owner of Has-A relationship 
//and child object cannot belong to another parent object.
//For example, a library has students. If the library is destroyed, students will exist without library.

