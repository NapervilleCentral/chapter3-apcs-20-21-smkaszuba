import TurtleGraphics.*;
import java.awt.*;

public class drawFibonacci{
    public static void main(String[] args){
        StandardPen pen = new StandardPen();
        double x, y, r, pi = Math.PI;
        int term1 = 0, term2 = 1, nextTerm = 1;
        
        pen.up();
        
        for (int n = 0; n < 15; n++){
           for (int i = 0; i < 90; i++)
           {
              pen.turn(1);
              pen.move(nextTerm);
              pen.down();
           }
            
           nextTerm = term1 + term2;
           term1 = term2;
           term2 = nextTerm;
        }
    }
}