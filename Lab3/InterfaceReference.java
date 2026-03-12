package Lab3;

interface Printable {
    void print();
}

class Book implements Printable {
    public void print() {
        System.out.println("Printing Book");
    }
}

public class InterfaceReference {
    public static void main(String[] args) {
        Printable p;
        p = new Book();
        p.print();
    }
}