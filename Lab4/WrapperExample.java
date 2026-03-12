package Lab4;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;

        Integer obj = Integer.valueOf(a);
        int b = obj.intValue();

        System.out.println("Integer object: " + obj);
        System.out.println("Primitive int: " + b);
    }
}