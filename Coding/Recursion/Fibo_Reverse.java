public class Fibo_Reverse {
    int a = 0, b = 1; //1, 2

    void fibo(int a, int b) {
        if(a+b >= 100){  // 3
            return;  // 4
        }
        else{
            int c = a+b;  //5
            fibo(b, c);   //6
            System.out.print(c + ", " );  //7
        }
    }

    void display(){
        fibo(0,1);//8
        System.out.print(1+", "+0); //9 and 10
    }

    public static void main(String[] args){
        // new Fibo_Reverse().display();
        System.out.println(power(2,-3));

    }

    public static double power(int a, int b) {
        if(b == 0){
            return 1.0;
        }
        else if (b < 0){
            return 1/power(a, -b);
        }
        else{
            return a * power(a, b-1);
        }
    }
}
