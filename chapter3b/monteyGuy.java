// Mitchell Kaszuba
// 10/22/22
// monty hall problem solver
// simulates monty hall problem
import java.util.*;

public class monteyGuy{
    public static void main(String[] args){
        int pick, door, wrongDoor, win = 0, loss = 0;
        Random random = new Random();
        
        // this for loop simulates switching the door every time 1000 times
        for(int x = 0; x < 1000; x++){
            // door - the door with the money
            // pick - the door picked by the user
            door = random.nextInt(3) + 1;
            pick = random.nextInt(3) + 1;
            
            // if the user picks the correct door first, the they lose
            // because they switch away from the door every time
            // every other scenario they win
            if (door == pick)
                loss++;
            else{
                win++;
            }
        }
        System.out.print("Switch Wins: " + win + "\nSwitch Losses: " + loss);
        
        // reset wins and losses
        win = 0;
        loss = 0;
        
        // simulates what happens when the user chooses not to switch 1000 times
        for (int x = 0; x < 1000; x++){
            door = random.nextInt(3) + 1;
            pick = random.nextInt(3) + 1;
            
            // if the user picks the right door the first time, they win
            // if they dont, they lose because they dont switch the door
            if (door == pick)
                win++;
            else
                loss++;
        }
        System.out.print("\nNo switch Wins: " + win + "\nNo switch Losses: " + loss);
        }
    }