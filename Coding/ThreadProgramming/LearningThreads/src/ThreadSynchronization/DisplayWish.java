package ThreadSynchronization;

public class DisplayWish {
    public void wish(String name){
        ;;;;;;;;;;;; //million line code
        ;;;;;;;;;;;;
        //synchronized(this){ //using the current object
        // synchronized(new DisplayWish()){ //object level lock
        synchronized(DisplayWish.class){ //class level lock
        
            for (int i = 0; i < 10; i++) {
                System.out.println("Good morning: " + name);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ;;;;;;;;;;;;//million line of code
        ;;;;;;;;;;;;
    }
}
