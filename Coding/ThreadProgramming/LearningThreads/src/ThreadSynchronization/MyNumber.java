package ThreadSynchronization;

public class MyNumber {
    public synchronized void displayNumber() throws InterruptedException{
        for (int i = 0; i < 5; i++) {
            System.out.print(i+" ");
            Thread.sleep(2000);
        }
    }

    public synchronized void displayCharacters() throws InterruptedException{
        for(char i = 'A'; i < 'K'; i++){
            System.out.print(i + " ");
            Thread.sleep(2000);
        }
    }
}
