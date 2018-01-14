import java.util.*;
public class Solution
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        for (int i=0; i<N; i++)
        {
            arr[i] = in.nextInt();
            arr[i] = arr[i] % 2;
            sum += arr[i];
        }
        if (sum == 1)
        {
            for (int i=0; i<N; i++)
            {
                if (arr[i] == 1)
                {
                    System.out.print(i+1);
                    break;
                }
            }
        }
        else
        {
            for (int i=0; i<N; i++)
            {
                if (arr[i] == 0)
                {
                    System.out.print(i+1);
                    break;
                }
            }
        }
        in.close();
    }
}
