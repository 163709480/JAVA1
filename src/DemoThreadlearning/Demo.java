package DemoThreadlearning;

public class Demo {
    public static void main(String[] args) {
        food fd=new food();
        new eat(fd).start();
        new customer(fd).start();

    }
}
