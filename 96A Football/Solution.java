import java.io.*;
public class Solution 
{
    public static void main(String args[] ) throws Exception 
    {
        InputStreamReader in = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(in);
        String str = br.readLine();
        int count = 1;
        String result = "YES";
        for (int i=1; i<str.length(); i++)
        {
            if(str.charAt(i) == str.charAt(i-1))             
                count++;
            else
                count = 1;
            if (count == 7)
                break;
        } 
        if (count < 7)
            result = "NO";
        System.out.println(result);
    }
}
