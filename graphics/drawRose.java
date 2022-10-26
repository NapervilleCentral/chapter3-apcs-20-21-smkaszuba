import TurtleGraphics.*;
import java.awt.*;

public class drawRose{
    public static void main(String[] args){
        StandardPen pen = new StandardPen();
        double r, x, y;
        pen.up();
        
        for (double theta = 0; theta < (2 * Math.PI); theta += (Math.PI / 50)){
            r = Math.cos(theta * 2);
            x = r * Math.cos(theta);
            y = r * Math.sin(theta);
            
            pen.move(x * 100, y * 100);
            pen.down();
        }   
    }
}