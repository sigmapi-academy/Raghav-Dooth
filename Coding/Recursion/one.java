public class one{
    public static void main(String[] args) {
        System.out.println("\fSum of squares of digits: " + sumSq(471));
    }

    public static int sumSq(int n){
        if(n == 0){
            return n;
        }
        else{
            return (n%10) * (n %10) + sumSq(n/10);
        }
    }
}
