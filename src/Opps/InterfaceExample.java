package Opps;

interface ShapeofMany {
    public double getArea();
}

class Box implements ShapeofMany {
    private double length;
    private double width;

    public Box(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Pyramid implements ShapeofMany {
    private double base;
    private double height;

    public Pyramid(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

class Sphere implements ShapeofMany {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class InterfaceExample {

    public static void main(String[] args) {
        ShapeofMany box = new Box(5.4, 0.3);
        System.out.println("Area of Box: " + box.getArea());

        ShapeofMany pyramid = new Pyramid(10, 4);
        System.out.println("Area of Pyramid: " + pyramid.getArea());

        ShapeofMany sphere = new Sphere(3);
        System.out.println("Area of Sphere: " + sphere.getArea());
    }
}
