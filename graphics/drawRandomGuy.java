import TurtleGraphics.*;
import java.awt.*;
import java.util.*;

public class drawRandomGuy
{
    public static void main(String[] args)
    {
        double distance, direction;
        StandardPen pen = new StandardPen();
        Random random = new Random();       
        pen.up();
        for (int i = 0; i < 100; i++)
        {
           distance = random.nextInt(65);
           direction = random.nextInt(361);
           
           pen.turn(direction);
           pen.move(distance);
           pen.down();
        }
    }
}
