// Mitchell Kaszuba
// 10/31/22
// drawRandomGuy
// draws random guy going random
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
           // distance is how far the guy moves
           distance = random.nextInt(65);
           // direction is how far the guy turns every time
           direction = random.nextInt(361);
           
           // guy turns a random direction and moves a random distance
           pen.turn(direction);
           pen.move(distance);
           pen.down();
        }
    }
}
