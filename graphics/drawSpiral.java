import TurtleGraphics.*;
import java.awt.*;

public class drawSpiral{
    public static void main(String[] args){
        StandardPen pen = new RainbowPen();
        pen.setWidth(1);
        pen.up();
        
        for (int d = 1; d < 1000; d++){
            pen.move(d);
            pen.turn(90);
            pen.down();
        }
    }
}