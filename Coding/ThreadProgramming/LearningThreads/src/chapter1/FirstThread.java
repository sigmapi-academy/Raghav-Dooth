package chapter1;

public class FirstThread  implements Runnable{
    @Override
    public void run() {
        final int max = 10;
        for (int i = 0; i < max; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
