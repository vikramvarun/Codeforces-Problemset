import java.io.*;
import java.math.*;
public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
	    BufferedReader br = new BufferedReader(in);	  
        String[] nk = br.readLine().split(" ");
        int N = Integer.parseInt(nk[0]);
        int K = Integer.parseInt(nk[1]);
        int result = K;
        String[] arr = br.readLine().split(" ");
        for (int t=0; t<N; t++)
        {
            int num = Integer.parseInt(arr[t]);
            if (K%num == 0)
            {
                num = K/num;
                result = Math.min(result, num);
            }            
        }
        System.out.println(result);
        br.close();
	}
} 
