import java.io.*;
import java.math.*;
public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
    	BufferedReader br = new BufferedReader(in);		
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        BigInteger base = BigInteger.valueOf(2);
        BigInteger num = BigInteger.valueOf(M);
        base =  base.pow(N);
        BigInteger result = num.mod(base);
        System.out.println(result);
        br.close();
    }
}
