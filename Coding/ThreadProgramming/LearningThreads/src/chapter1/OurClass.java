package chapter1;

public class OurClass extends Thread{
    @Override
    public void run(){
        int i;
        for(i = 0; i < 10; i++){
            System.out.println("Hello");
        }
    }
}
