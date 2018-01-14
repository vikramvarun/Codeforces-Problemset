import java.io.*;
public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
	    BufferedReader br = new BufferedReader(in);	
        String str = br.readLine();
        char first = str.charAt(0);
        if (first > 'Z')
            first = (char) (first - 32);
        System.out.print(first);
        for (int i=1; i<str.length(); i++)
            System.out.print(str.charAt(i));    
        br.close();
	}
}
