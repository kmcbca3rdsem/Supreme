class Book {
    String title;
    String author;
    double price;

    void applyDiscount(double discount) {
        price = price - (price * discount / 100);
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Java Programming";
        b.author = "James Gosling";
        b.price = 500;

        b.applyDiscount(10);
        b.display();
    }
}
