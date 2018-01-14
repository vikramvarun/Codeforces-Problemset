import java.io.*;
public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
	    BufferedReader br = new BufferedReader(in);	
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[4];
        for (int i=0; i<N; i++)
        {
            int num = Integer.parseInt(str[i]);
            arr[num-1] += 1;
        }
        if (arr[1]%2 == 1)
            arr[0] -= 2;
        arr[0] = Math.max(arr[0]-arr[2], 0);
        int result = arr[3] + arr[2] + ((arr[1] +1)/2) + ((arr[0] +3)/4);       
        System.out.print(result);
        br.close();
	}
}
