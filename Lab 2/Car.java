class Car {
    String brand;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Toyota";
        c.model = "Corolla";
        c.year = 2020;

        c.displayDetails();
    }
}
