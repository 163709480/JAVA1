package DemoThreadlearning;

public class Demo {
    public static void main(String[] args) {
        food fdd=new food();
        new makefood(fdd).start();
        new customer(fdd).start();

    }
}
