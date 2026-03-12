package Lab4;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    static void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}