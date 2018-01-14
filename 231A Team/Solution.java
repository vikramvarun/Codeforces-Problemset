import java.io.*;
public class Solution 
{
    public static void main(String args[] ) throws Exception 
    {
        InputStreamReader in = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(in);
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i=0; i<N; i++)
        {
            String[] arr = br.readLine().split(" ");
            int total = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]);
            if (total >= 2)
                count++;           
        }   
        System.out.println(count);
    }
}
