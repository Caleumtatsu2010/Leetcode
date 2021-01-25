package week1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day123
{
    public static boolean detectCapitalUse(String word) 
    {
        boolean result = false;
        if(Character.isUpperCase(word.charAt(0)) ==true && countUpperCase(word) == 1 )  result = true;
        if(countUpperCase(word) == 0)   result = true;
        if(countUpperCase(word) == word.length())  result =true;
        return result;
    }
    public static int countUpperCase(String word)
    {
        int count =0;
        for(int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }
    public static boolean isPalindrome(String s) 
    {
        if(s==null)
        {
            return false;
        }
        s = s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0'&&s.charAt(i)<='9')))
            {
                i++;
            }
            while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z') || (s.charAt(j)>='0'&&s.charAt(j)<='9')))
            {
                j--;
            }
 
        if(s.charAt(i) != s.charAt(j))
        {
            return false;
        }
 
        i++;
        j--;
        }
    return true;
        
    }
    public static void main(String[] args) 
    {
        //System.out.println(detectCapitalUse("AbcD"));
        //System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        
    }
    
}