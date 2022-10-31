import TurtleGraphics.*;
import java.awt.*;

public class drawSpiral{
    public static void main(String[] args){
        StandardPen pen = new WiggleRainbowPen();
        pen.setWidth(1);
        pen.up();
        
        for (int d = 0; d < 650; d++){
            pen.move(d);
            pen.turn(90);
            pen.down();
        }
    }
}