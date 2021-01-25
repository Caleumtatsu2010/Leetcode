


public class Problem2
{
    public static long divide2Integer(long dividend, long divisor)
    {
        long newdividend = Math.abs(dividend);
        long newdivisor = Math.abs(divisor); 
        long quote= 0;
        while(newdividend >= newdivisor)
        {
            newdividend = newdividend - newdivisor;
            quote++;
        }
        int sign;
        if(dividend<0 && divisor<0 ) sign = 1;
        else if(dividend>0 && divisor>0) sign = 1;
        else
        {
            sign = -1;
        }
        return sign*quote;
    }
    public static int removeElement(int num[], int val)
    {
        //remove bad element to the end of array
        for(int i =0;i<num.length;i++)
        {
            for(int j=num.length-1 ;j>0;j--)
            {
                if(num[i] == val)
                {
                    int tmp;
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }
        int count=0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i] != val)
            {
                count++;
            }
        }
        return count;
    }
    // public static int strStr(String haystack, String needle) 
    // {

    // }
    
    public static void main(String[] args) 
    {
        //System.out.println(divide2Integer(-2147483648, -1));
        // int num[] = new int[] {3,2,2,3};
        // System.out.println(removeElement(num, 3));
        //System.out.println(strStr("aaaabca", "abc")); 
        



        
    }
    
}