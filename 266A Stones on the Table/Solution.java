import java.io.*;
public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
	    BufferedReader br = new BufferedReader(in);	
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int count = 0;
        for (int i=1; i<N; i++)
        {
            if(str.charAt(i) == str.charAt(i-1))
                count++;
        }      
        System.out.println(count);
        br.close();
	}
} 
