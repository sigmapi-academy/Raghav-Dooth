package myApp;
import java.io.Console;
import java.util.Arrays;

public class TestConsole {
    public static void main(String[] args) {
        Console con = System.console();
        if(con == null){
            System.err.println("Console not supported!");
        }
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(con.readLine());
        System.out.println("Enter name: ");
        String name = con.readLine();
        System.out.println("Enter password: ");
        char pass[] = con.readPassword();
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Your password: " + Arrays.toString(pass));
    }
}
