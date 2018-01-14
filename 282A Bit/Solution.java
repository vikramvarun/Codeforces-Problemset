import java.io.*;
public class Solution 
{
    public static void main(String args[] ) throws Exception 
    {
        InputStreamReader in = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(in);
        int N = Integer.parseInt(br.readLine());
        int total = 0;
        for (int i=0; i<N; i++)
        {
            String str = br.readLine();
            char ch = str.charAt(1);             
            if (ch == '+')
                total++;
            else
                total--;
        }   
        System.out.println(total);
    }
}
