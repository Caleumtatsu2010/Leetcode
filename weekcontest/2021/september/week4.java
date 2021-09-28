
import java.util.List;
import java.lang.reflect.Array;
import java.util.*;

public class week4 {
    public static String breakPalindrome(String palindrome) 
    {
        int length = palindrome.length();
        if (length == 1) {
            return "";
        }
        // Strings are immutable in Java, convert it into a char array
        char[] palindromeArray = palindrome.toCharArray();

        for (int i = 0; i < length / 2; i++) {
            if (palindromeArray[i] != 'a') {
                palindromeArray[i] = 'a';
                return String.valueOf(palindromeArray);
            }
        }

        palindromeArray[length - 1] = 'b';
        return String.valueOf(palindromeArray);
    }
   
    public static int tribonacci(int n) 
    {
        if(n < 2)
        {
            return n;
        }
            
        int x = 0, y = 1, z = 1, sum = 2;
        
        while(n != 2)
        {
            x = y;
            y = z;
            z = sum;
            sum = x + y + z;
            n--;
        }
        
        return z;
    }
    public static int numUniqueEmails(String[] emails) 
    {
        HashSet<String> set = new HashSet<>();
        for(String email : emails)
        {
           int  a = email.indexOf("@");
           String domain = email.substring(a, email.length());
           String local = email.substring(0, a);
           StringBuilder sb = new StringBuilder();
           for(char ch: local.toCharArray())
           {
               if(ch == '.')
               {
                   continue;
               }
               if(ch == '+')
               {
                   break;
               }
               sb.append(ch);
           }
           sb.append(domain);
           set.add(sb.toString());
        }
       
        return  set.size();;
    }
    public static int[] sortArrayByParityII(int[] nums) 
    {

        int n = nums.length;
        int result[] = new int[n];
        int even = 0;
        int odd = 1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2 == 0)
            {
                result[even] = nums[i];
                even += 2;
            }
            else
            {
                result[odd] = nums[i];
                odd += 2;
            }
        }
        return result;
    }
    public static void main(String[] args) 
    {
        //int nums[] = new int[]{4,2,5,7};
        //System.out.println(tribonacci(4));
        String []emails = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        //System.out.println(Arrays.toString(sortArrayByParityII(nums)));
        numUniqueEmails(emails);
    }

}
