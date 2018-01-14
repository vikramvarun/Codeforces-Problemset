import java.io.*;
import java.math.*;
public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
	    BufferedReader br = new BufferedReader(in);	  
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int P = Integer.parseInt(arr[1]);
        int L = Integer.parseInt(arr[2]);
        int R = Integer.parseInt(arr[3]);
        int result1 = 0, result2=0;
        if (L > 1)
        {
            result1 += Math.abs(P-L) + 1;
            if (R < N)
                result1 += Math.abs(R-L) + 1;
        }
        else if (R < N)
            result1 += Math.abs(R-P) + 1;
        if (R < N)
        {
            result2 += Math.abs(P-R) + 1;
            if (L > 1)
                result2 += Math.abs(R-L) + 1;
        }
        else if (L > 1)
            result2 += Math.abs(L-P) + 1;
        int result = Math.min(result1, result2);
        System.out.println(result);
        br.close();
	}
}
