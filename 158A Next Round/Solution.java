import java.io.*;
public class Solution 
{
    public static void main(String args[] ) throws Exception 
    {
        InputStreamReader in = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(in);
        String[] nk = br.readLine().split(" ");
        int N = Integer.parseInt(nk[0]);
        int K = Integer.parseInt(nk[1]);
        String[] scores = br.readLine().split(" ");
        int kRank = Integer.parseInt(scores[K-1]);
        int count = 0;
        for (int i=0; i<N; i++)
        {
            int scoreI = Integer.parseInt(scores[i]);
            if (scoreI <= 0)
                break;
            else if (scoreI >= kRank)
                count++;
        }       
        System.out.println(count);
    }
}
