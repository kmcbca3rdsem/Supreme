class Circle {
    double radius;

    void area() {
        System.out.println("Area = " + (Math.PI * radius * radius));
    }

    void circumference() {
        System.out.println("Circumference = " + (2 * Math.PI * radius));
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 7;

        c.area();
        c.circumference();
    }
}
