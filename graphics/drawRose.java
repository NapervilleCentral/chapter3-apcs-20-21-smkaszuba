// Mitchell Kaszuba
// 10/31/22
// rose
// makes a rose
import TurtleGraphics.*;
import java.awt.*;

public class drawRose{
    public static void main(String[] args){
        StandardPen pen = new StandardPen();
        double r, x, y;
        pen.up();
        
        // theta: angle of triangle in radians
        // loop ends when triangle is a full circle (2 pi)
        // it increases by 50 every loop
        for (double theta = 0; theta < (2 * Math.PI); theta += (Math.PI / 50)){
            // r - radius being drawn
            // x - x position of pen
            // y - y position of pen
            r = Math.cos(theta * 2);
            x = r * Math.cos(theta);
            y = r * Math.sin(theta);
            
            // move it to those angles times 100 to scale up
            pen.move(x * 100, y * 100);
            pen.down();
        }   
    }
}