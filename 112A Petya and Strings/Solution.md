import java.io.*;
public class Solution 
{
    public static void main(String args[] ) throws Exception 
    {
        InputStreamReader in = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(in);
        String str1 = br.readLine().toUpperCase();
        String str2 = br.readLine().toUpperCase();
        int result = 0;
        for (int i=0; i<str1.length(); i++)
        {
            result = String.valueOf(str1.charAt(i)).compareTo(String.valueOf(str2.charAt(i)));
            if (result < 0)
            {
                result = -1;
                break;
            }
            else if (result > 0)
            {
                result = 1;
                break;
            }
        }
        System.out.println(result);
    }
}
