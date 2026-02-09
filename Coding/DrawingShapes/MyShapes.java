import MyGraphics.*;

public class MyShapes {
    public static void main(String[] args) {
        Rectangle rect  = new Rectangle(10,10, 150, 100);
        Canvas canvas = Canvas.getInstance();
        canvas.show(rect);
    }
}
