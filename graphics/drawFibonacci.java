// Mitchell Kaszuba
// 10/31/22
// drawFiboncacci 
// draw fibonacci spiral
import TurtleGraphics.*;
import java.awt.*;

public class drawFibonacci{
    public static void main(String[] args){
        StandardPen pen = new StandardPen();
        double x, y, r, pi = Math.PI;
        int term1 = 0, term2 = 1, nextTerm = 1;
        pen.up();
        
        for (int n = 0; n < 11; n++){
            for (int i = 0; i < 4; i++){
                pen.move(nextTerm);
                pen.turn(90);
            }
            pen.turn(90);
            pen.move(nextTerm);
        }
        
        // for 7 iterations:
        for (int n = 0; n < 11; n++){
            
            
           // for 90 degrees:
           for (int i = 0; i < 90; i++)
           {
              // move by the radius of the circle times pi
              // divided by 100 to scale down
              pen.move(nextTerm * pi / 20);
              // turn 1 degree every time
              pen.turn(1);
              pen.down();
           }
           
           // calculate next radius for circle by adding 2 previous terms
           nextTerm = term1 + term2;
           term1 = term2;
           term2 = nextTerm;
        }
    }
}