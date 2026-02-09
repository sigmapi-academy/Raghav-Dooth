package chapter1;

public class TestFirstThread {
    public static void main(String[] args) {
        OurClass oc = new OurClass();
        oc.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main");
        }
    }
}
