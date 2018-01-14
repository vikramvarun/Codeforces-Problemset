import java.util.*;
public class Solution
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i=0; i<N; i++)
        {
            String word = in.next();
            int L = word.length();
            if (L > 10)
            {
                System.out.print(word.charAt(0));
                System.out.print(L-2);
                System.out.print(word.charAt(L-1) + "\n");
            }
            else
                System.out.println(word);
        }
        in.close();
    }
}
