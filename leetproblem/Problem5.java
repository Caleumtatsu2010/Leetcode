import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;


public class Problem5 
{
    public static boolean isValid(String s) 
    {
        Stack st = new Stack();
        if(s.isEmpty())
            return false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                st.push(s.charAt(i));
            }
            else if(st.isEmpty() || (s.charAt(i) == ')' && st.peek() != "(") || (s.charAt(i) == ']' && st.peek() != "[") || (s.charAt(i) == '}' && st.peek() != "{"))
            {
                return false;
            }
            else
            {
                st.pop();
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int climbingStairs(int i, int n)
    {
        if(i > n)
        {
            return 0;
        }
        if(i == n)
        {
            return 1;
        }
        else
        {
            return climbingStairs(i+1, n) + climbingStairs(i+2, n);
        }
    }
    public static int maxProfit(int[] prices) 
    {
        int min = Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i] < min)
            {
                min = prices[i];//searching for buy (minprice)
            }
            else if( prices[i] - min > maxprofit)//avoid profit <= 0
            {
                maxprofit = prices[i] - min;//profit = sell - buy(minprice)
            }
        }

        return maxprofit;
    }
    public static int missingNumber(int[] nums) 
    {
        int miss;
        List<Integer> tmp = new ArrayList<Integer>();
        for(int i:nums)
        {
            tmp.add(i);
        }
        for(int i =0;i<nums.length+1;i++)//range
        {
            if(!tmp.contains(i))
            {
                return i;
            }
        }
        return -1;

    }
    public static int majorityElement(int[] nums) {
        int n = nums.length / 2;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
            if(count > n)
            {
                return nums[i];
            }
        }
        return -1;

    }
    public static void main(String[] args) 
    {
        //System.out.println(isValid("()[]{}"));
        //System.out.println(climbingStairs(0, 3));
        //int a[] = new int[]{9,6,4,2,3,5,7,0,1};
        // System.out.println(maxProfit(a));
        int nums[] = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
        

        
    }
    
}
