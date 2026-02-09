import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("./CollectionFramework/Map/app.properties"));
            String str = p.getProperty("user");
            System.out.println("value: " + str);
            p.setProperty("newuser2", "shivin");
            p.setProperty("newpassword2", "12345@09876abc");
            p.store(new FileOutputStream("./CollectionFramework/Map/app.properties"), "Just updated");
        }
        catch(FileNotFoundException e){
            System.out.println("File nahi mila!!!!"+"\n"+e.getMessage());
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Network Error"+"\n"+e.getMessage());
        }
    }
}
