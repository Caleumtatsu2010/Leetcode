

public class Problem7
{
    public static int[] plusOne(int []digits)
    {
        for(int i=digits.length-1; i>=0; i--)
        {
            if(digits[i] != 9)
            {
                digits[i]++;
            }
            else
            {
                digits[i] =0;
                if(i == 0)
                {
                    digits = new int[ (digits.length-1) + 2];
                    digits[i] = 1;
                }
            }
        }
        return digits;
    }

    public static void main(String[] args) 
    {
        int digits[] = {4, 3, 2, 1};
        System.out.print(plusOne(digits));


    }

}