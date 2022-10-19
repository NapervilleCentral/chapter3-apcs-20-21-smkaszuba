import java.util.*;

public class monteyGuy{
    public static void main(String[] args){
        int pick, door, wrongDoor, win = 0, loss = 0;
        Random random = new Random();
        for(int x = 0; x < 1000; x++){
            door = random.nextInt(3) + 1;
            pick = random.nextInt(3) + 1;
            if (door == pick)
                loss++;
            else{
                win++;
            }
        }
        System.out.print("Switch Wins: " + win + "\nSwitch Losses: " + loss);
        win = 0;
        loss = 0;
        for (int x = 0; x < 1000; x++){
            door = random.nextInt(3) + 1;
            pick = random.nextInt(3) + 1;
            if (door == pick)
                win++;
            else
                loss++;
        }
        System.out.print("\nNo switch Wins: " + win + "\nNo switch Losses: " + loss);
        }
    }