package Lab3;

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Drawable {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

public class DrawableTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();

        c.draw();
        s.draw();
    }
}