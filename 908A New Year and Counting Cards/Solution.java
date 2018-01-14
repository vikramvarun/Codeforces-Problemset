import java.io.*;
public class Solution 
{
    public static void main(String args[] ) throws Exception 
    {
        InputStreamReader in = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(in);
        String str = br.readLine();
        int total = 0;
        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);             
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                total++;
            if (ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9')
                total++;
        }   
        System.out.println(total);
    }
}
