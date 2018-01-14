import java.util.*;
public class Solution
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String result = "NO";
        String testStr = "hello";
        int j = 0;
        for (int i=0; i<str.length(); i++)
        {
            if (str.charAt(i) == testStr.charAt(j))
                j++;
            if (j == 5)
            {
                result = "YES";
                break;
                
            }
        }
        System.out.print(result);
        in.close();
    }
}
