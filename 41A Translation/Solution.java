import java.util.*;
public class Solution
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        String result = "YES";
        int L1 = str1.length();
        int L2 = str2.length();
        if (L1 != L2)
            result = "NO";
        else
        {
            for (int i=0; i<L1; i++)
            {
                if (str1.charAt(i) != str2.charAt(L1-1-i))
                {
                    result = "NO";
                    break;
                }
        }
        }
        System.out.print(result);
        in.close();
    }
}
