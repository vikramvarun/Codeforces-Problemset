import java.util.*;
public class Solution
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String result = "NO";
        if (N%2 == 0 && N > 2)
            result = "YES";
        System.out.print(result);
        in.close();
    }
}
