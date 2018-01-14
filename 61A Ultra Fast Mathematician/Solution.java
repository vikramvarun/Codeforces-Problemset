import java.util.*;
public class Solution
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String num1 = in.next();
        String num2 = in.next();
        int N = num1.length();
        int[] digits = new int[N];
        for (int i=0; i<N; i++)
        {
            int dig1 = Integer.parseInt(String.valueOf(num1.charAt(i)));
            int dig2 = Integer.parseInt(String.valueOf(num2.charAt(i)));
            digits[i] = dig1 ^ dig2;
            System.out.print(digits[i]);
        }
        in.close();
    }
}
