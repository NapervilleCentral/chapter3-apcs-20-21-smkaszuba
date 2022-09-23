import java.util.*;

public class minivan{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); 
        String code, gear;
        int switchLeft, switchRight, childLock, masterUnlock, insideLeft, insideRight, outsideLeft, outsideRight;
        System.out.print("Enter minivan door code: ");
        code = in.nextLine();
        
        switchLeft = Integer.parseInt(code.substring(0,1));
        switchRight = Integer.parseInt(code.substring(1,2));
        childLock = Integer.parseInt(code.substring(2,3));
        masterUnlock = Integer.parseInt(code.substring(3,4));
        insideLeft = Integer.parseInt(code.substring(4,5));
        insideRight = Integer.parseInt(code.substring(5,6));
        outsideLeft = Integer.parseInt(code.substring(6,7));
        outsideRight = Integer.parseInt(code.substring(7,8));
        gear = code.substring(8,9);
        
        leftDoor = (insideLeft == 1 || outsideLeft == 1);
        rightDoor = (insideRight == 1 || outsideRight == 1);
        
        // if child lock off && gear is park && master unlock switch is on
        //      if left door is open and right is open; both open
        //      else if left is open; left is open
        //      else right is open
        // 
    
        if (childLock == 0 && gear.equals("P") && masterUnlock == 1)
            if ()
                
    }
}