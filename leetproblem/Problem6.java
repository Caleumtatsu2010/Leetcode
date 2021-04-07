import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem6
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
    public static int lengthOfLongestSubstring(String s) 
    {
        int count=0;
        List<String> list = new ArrayList<String>();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                list.add(s.substring(i-count, i));
                map.clear();
                count=0;
                i--;
            }
            else
            {
                map.put(s.charAt(i), i);
                count++;
            }
            
        }        
        int maxstring = list.get(0).length();
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i).length() > maxstring)
            {
                maxstring = list.get(i).length();
            }
        }
        return maxstring;
    }
    public static int myAtoi(String s)
    {
        s=s.trim();
        String temp="";
        int i=0;
        if(s.charAt(0) == '+' || s.charAt(0) == '-')
        {
            temp =temp + s.charAt(0);
            i++;
        }
        while((s.charAt(i) != ' ' && s.charAt(i) <='9' && s.charAt(i) >='0'))
        {
            temp =temp + s.charAt(i);
            i++;
        }
        try
        {
            return (int)Double.parseDouble(temp);
        }catch(Exception e)
        {
            return 0;
        }
    }
    public static  int maxSubArray(int[] nums) 
    {
        int sum = nums[0];
        int tempsum=0;
        for(int i=0;i<nums.length;i++)
        {
            tempsum+=nums[i];
            if(tempsum > sum)
            {
                sum = tempsum;
            }
            if(tempsum < 0)
            {
                tempsum=0;
            }
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        // int digits[] = {4, 3, 2, 1};
        // System.out.print(plusOne(digits));
        //System.out.println(lengthOfLongestSubstring("abcabcbb"));
        //System.out.println(myAtoi("words and 987"));
        int nums[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

}