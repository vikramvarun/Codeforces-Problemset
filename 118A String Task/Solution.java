import java.io.*;
public class Solution 
{
    public static void main(String args[] ) throws Exception 
    {
        InputStreamReader in = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(in);
        String str = br.readLine();
        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch < 'a')
                ch += 32;
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'y')
            System.out.print("."+ch);
        }       
    }
}
