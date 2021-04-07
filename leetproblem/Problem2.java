


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
    public static int singleNumber(int[] nums) 
    {
        int  result = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            result = result^nums[i];// XOR gate
        }
        return result;       
    }
    public static void removeDuplicates(int[] nums) 
    {
        int n = nums.length;
        int[] temp = new int[n]; 
        int j = 0; 
        for (int i=0; i<n-1; i++)
        {
            if (nums[i] != nums[i+1])
            {
                temp[j++] = nums[i]; 
            }
        } 
        temp[j++] = nums[n-1];    
        for(int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }

    }
    public static boolean isPowerOfFour(int num) 
    {
        boolean result = false;
        for(int i = 0;i<16;i++)
        {
            if(num == Math.pow(4, i))
            {
                result = true;
            }
        }
        return result;

    }
    public static int lengthOfLastWord(String s) 
    {
        if(s.length() == 0)
            return 0;
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != ' ')
            {
                count++;
            }
            if(count == s.length())
            return s.length();
        }
        s.trim();
        String arrstring[] = s.split(" ");
        return arrstring[arrstring.length-1].length();
    }
    
    public static void main(String[] args) 
    {
        //System.out.println(divide2Integer(-2147483648, -1));
        // int num[] = new int[] {3,2,2,3};
        // System.out.println(removeElement(num, 3));
        //System.out.println(strStr("aaaabca", "abc")); 
        // int nums[] = new int[]{1,2,1,2,3,4,5,6,6,5,4};
        // System.out.println(singleNumber(nums));
        // int nums[] = new int[]{1, 1, 2, 2, 3, 4, 5, 5, 6, 6, 6, 7};
        // removeDuplicates(nums);
        //System.out.println(isPowerOfFour(16));
        //System.out.println(lengthOfLastWord("abce rfdg"));
        



        
    }
    
}