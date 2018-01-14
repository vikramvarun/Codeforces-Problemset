import java.util.*;
public class Solution
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> m1 = new HashMap<String, Integer>();
        Map<String, Integer> m2 = new HashMap<String, Integer>();
        String[] name = new String[1010];  
        int[] score = new int[1010];  
        int n = in.nextInt();  
        for(int i=0; i<n; i++)  
        {  
            name[i] = in.next();
            score[i] = in.nextInt();
            if (!m1.containsKey(name[i]))
                m1.put (name[i], score[i]); 
            else
            {
                score[i] += m1.get(name[i]);
                m1.put (name[i], score[i]); 
            }
        }  
        int maxx = -1005;  
        for(int i=0; i<n; i++)  
        {  
            if (m1.get(name[i]) > maxx)   
                maxx = m1.get(name[i]);  
        }  
        for(int i=0; i<n; i++)  
        {  
            m2.put (name[i], score[i]);
            if (m2.get(name[i]) >= maxx && m1.get(name[i]) >= maxx)
            if (m1.get(name[i]) >= maxx)
            {  
                System.out.println(name[i]); 
                break;  
            }  
        }  
        in.close();     
    }
}
