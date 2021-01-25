


import java.util.HashMap;

import java.util.Map;


public class Problem1
{
    public static void twoSum() throws IllegalArgumentException
    {
        int nums[] = {2, 7, 11, 15, 16, 24, 22, 40, 10};
        int target = 24;
        for(int i=0;i<nums.length;i++)
        {
            int temp = target - nums[i];
            for(int j = i+1;j<nums.length;j++)
            {
                if(nums[j] == temp)
                {
                    System.out.println("i = "+i+" j = "+j);
                }
            } 
        }
    }
    public static int reverseInteger()
    {
        int n = -1534;
        long res = 0;
            while(n!=0)
            {
                int temp = n % 10;
                res = res*10 +temp;
                n = n /10;
            }
            if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE)
            {
                return 0;
            }
        else
        return (int) res;
        
    }
    public static void palindrome()
    {
        int n = 123321, res = 0;
        int m = n;
        while(m>0)
        {
            int temp = m % 10;
            res = res*10 +temp;
            m = m /10;
        }
        System.out.println(res);
        if(res == n)  System.out.println("true");
        else
        {
            System.out.println("false");
        }   
    }
    public static int romanToInteger(String roman) 
    {
        int sum = hashMap(roman.charAt(roman.length()-1));
        for(int i=roman.length()-2;i>=0;i--)
        {
            if(hashMap(roman.charAt(i)) >= hashMap(roman.charAt(i+1)))
            {
                sum = sum + hashMap(roman.charAt(i));
            }
            else
            {
                sum = sum - hashMap(roman.charAt(i));
            }
        }
        return sum;
    }

    public static int hashMap(Character key)
    {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map.get(key);
    }
    public static String longgestCommonPrefix(String a[])
    {
        int n = a.length;
        int i=0;
        while(i < shortestString(a) && a[0].charAt(i) == a[n-1].charAt(i))
        {
            i++;
        }
        return a[0].substring(0, i);
    }
    public static int shortestString(String a[])
    {
        String min = a[0];
        for(int t=1;t<a.length;t++)
        {
            if(a[t].length() < min.length()) min = a[t];
        }
        return min.length();
    }
    public static String integerToRoman(int n)
    {
        int []value = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String []romans = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<value.length;i++)
        {
            while(n >= value[i])
            {
                sb.append(romans[i]);
                n = n-value[i];
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IllegalArgumentException, IndexOutOfBoundsException
    {
        twoSum(); 
        System.out.println(reverseInteger());
        palindrome();
        System.out.println(romanToInteger("IXV"));
        String a[]={"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(longgestCommonPrefix(a));
        System.out.println(integerToRoman(449));


    }
    
    
}