import java.util.*;
public class Solution
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int x=0, y=0, z=0;
        String result = "NO";
        for (int i=0; i<N; i++)
        {
            x += in.nextInt();
            y += in.nextInt();
            z += in.nextInt();
        }
        if (x == 0 && y == 0 && z == 0)
            result = "YES";
        System.out.print(result);
        in.close();
    }
}
