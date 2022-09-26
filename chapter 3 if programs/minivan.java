// Mitchell Kaszuba
// 9/25/22
// minivan code proseccor
// processes minivade door codes
import java.util.*;

public class minivan{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); 
        String code, gear;
        int switchLeft, switchRight, childLock, masterUnlock, insideLeft, 
            insideRight, outsideLeft, outsideRight, leftDoor, rightDoor;
        
        System.out.print("Enter minivan door code: ");
        code = in.nextLine();

        // put each position in the minivan door code into an int, besides the gear
        switchLeft = Integer.parseInt(code.substring(0,1));
        switchRight = Integer.parseInt(code.substring(1,2));
        childLock = Integer.parseInt(code.substring(2,3));
        masterUnlock = Integer.parseInt(code.substring(3,4));
        insideLeft = Integer.parseInt(code.substring(4,5));
        insideRight = Integer.parseInt(code.substring(5,6));
        outsideLeft = Integer.parseInt(code.substring(6,7));
        outsideRight = Integer.parseInt(code.substring(7,8));
        gear = code.substring(8);
        
        // if childlock is on, disable the inside handles being on
        if (childLock == 1){
          insideLeft = 0;
          insideRight = 0;
        }
        // detirmine if the left and right doors are open using bitwise operators
        leftDoor = insideLeft | outsideLeft | switchLeft;
        rightDoor = insideRight | outsideRight | switchRight;

        // if gear is in park and master unlock is on and at least 1 door is open
        if ((leftDoor | rightDoor) == 1 && gear.equals("P") && masterUnlock == 1){
            if (leftDoor == 1)
              System.out.println("Left door open");
            if (rightDoor == 1)
              System.out.print("Right door open");
        }
        else
          System.out.print("Both doors closed");
    }
}