// Mitchell Kaszuba
// 10/31/22
// drawSpiral
// draws a spiral
import TurtleGraphics.*;
import java.awt.*;

public class drawSpiral{
    public static void main(String[] args){
        StandardPen pen = new WiggleRainbowPen();
        pen.setWidth(1);
        pen.up();
        
        for (int d = 0; d < 650; d++){
            // the code words by moving a certain distance, turning 90 degrees, then moving a slightly farther distance
            pen.move(d);
            pen.turn(90);
            pen.down();
        }
    }
}