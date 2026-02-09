package TestMyGraphics;

import MyGraphics.*;
/**
 * Write a description of class CreateRectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreateRectangle
{
    public static void main(String args[]){
        Rectangle r1 = new Rectangle(10,10, 180, 120);
        r1.draw();
        //Canvas canvas = Canvas.getInstance();
        //canvas.show(r1);
    }
}