import java.io.*;
import java.util.*;
public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
	    BufferedReader br = new BufferedReader(in);		
        String str = br.readLine();
        int N = (str.length() + 1)/2;
        int[] arr = new int[N];
        for (int i=0; i<N; i++)
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(2*i)));
        Arrays.sort(arr);
        for (int i=0; i<N-1; i++)
            System.out.print(arr[i]+"+");
        System.out.print(arr[N-1]);
        br.close();
	}
} 
