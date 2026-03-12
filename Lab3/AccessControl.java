package Lab3;

class TestAccess {
    public int a = 10;
    protected int b = 20;
    int c = 30;

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

public class AccessControl {
    public static void main(String[] args) {
        TestAccess t = new TestAccess();
        t.display();
    }
}