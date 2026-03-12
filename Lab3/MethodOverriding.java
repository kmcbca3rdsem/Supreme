package Lab3;

class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();
    }
}
