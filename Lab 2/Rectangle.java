class Rectangle {
    double length;
    double width;

    void area() {
        System.out.println("Area = " + (length * width));
    }

    void perimeter() {
        System.out.println("Perimeter = " + (2 * (length + width)));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.width = 5;

        r.area();
        r.perimeter();
    }
}
