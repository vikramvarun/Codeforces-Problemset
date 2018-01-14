public class Solution
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        char[] wordArr = word.toCharArray();
        int lower = 0, upper = 0;
        for (int i=0; i<word.length(); i++)
        {
            int valueASCII = (int) wordArr[i];
            if (valueASCII > 95)
                lower++;
            else
                upper++;
        }
        if (upper > lower) 
        {
            for (int i=0; i<word.length(); i++)
            {
                int valueASCII = (int) wordArr[i];
                if (valueASCII > 95)
                    wordArr[i] = (char) (wordArr[i] - 32);
                System.out.print(wordArr[i]);
            }
        }
        else 
        {
            for (int i=0; i<word.length(); i++)
            {
                int valueASCII = (int) wordArr[i];
                if (valueASCII < 95)
                    wordArr[i] = (char) (wordArr[i] + 32);
                System.out.print(wordArr[i]);
            }
        }
        in.close();
    }
}
