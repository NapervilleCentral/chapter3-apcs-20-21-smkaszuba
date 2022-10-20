import java.util.*;

public class fibonacci
{
    public static void main(String[] args)
    {
        int size, seed, inc;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter size: ");
        size = in.nextInt();
        System.out.print("Enter seed: ");
        seed = in.nextInt();
        
        System.out.print(seed);
        for (int i = 1, increase = seed; i < size; i++, increase += seed)
        {
            System.out.print(seed + increase + " ");
        }
    }
}