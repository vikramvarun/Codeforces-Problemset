import java.util.*;
public class Solution
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        int x, y;
        if (n%a == 0)
            x = n/a;
        else 
            x = (n/a) + 1;
        if (m%a == 0)
            y = m/a;
        else 
            y = (m/a) + 1;
        long result = (long) x*y;
        System.out.println(result);
        in.close();
    }
}
