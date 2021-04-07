import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem4 
{
    public static List<List<Integer>> fourSum(int[] nums, int target) 
    {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        for(int i=0;i<nums.length-3;i++)
        {
            for(int j=i+1;j<nums.length-2;j++)
            {
                for(int k=j+1;k<nums.length-1;k++)
                {
                    for(int l =k+1;l<nums.length;l++)
                    {
                        if(nums[i] + nums[j] + nums[k] + nums[l] == target)
                        {
                            List<Integer> list = new ArrayList<Integer>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            list.add(nums[l]);
                            set.add(list);

                            
                        }
                    }
                }
            }
        }
        for(List<Integer> i : set)
        {
            result.add(i);
        }
        return result;
        
    }
    public static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1; 
        while (i < j) 
        { 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
            i++; 
            j--; 
        } 
        return true; 
    }
    public static String findmaxString(List<String> list)
    {
        String max = list.get(0);
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i).length() > max.length())
            {
                max = list.get(i);
            }
        }
        return max;
    }
    public static String longestPalindrome(String str) throws IndexOutOfBoundsException
    {
        List<String> list = new ArrayList<String>();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                if(isPalindrome(str.substring(i, j)))
                {
                    list.add(str.substring(i, j));
                } 

            }
        }
        return findmaxString(list);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> results = new ArrayList<>();
        if (candidates == null || candidates.length == 0) 
        {
            return results;
        }
        Arrays.sort(candidates);
        List<Integer> combination = new ArrayList<>();
        toFindCombinationsToTarget(results, combination, candidates, target, 0);
        
        return results;
    }
    public static void toFindCombinationsToTarget(List<List<Integer>> results, List<Integer> combination, int[] candidates, int target, int startIndex) {
        if (target == 0) {
            results.add(new ArrayList<>(combination));
            return;
        }
        
        for (int i = startIndex; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }         
            
            combination.add(candidates[i]);
            toFindCombinationsToTarget(results, combination, candidates, target - candidates[i], i);
            combination.remove(combination.size() - 1);
        }        
    }
    

    public static void main(String[] args) throws IndexOutOfBoundsException
    {
        // int nums[] = new int[]{1, 0, -1, 0, -2, 2};
        // System.out.println(fourSum(nums, 0));
        System.out.println(longestPalindrome("babad"));
        // int candidates[] = new int[]{2, 6, 3, 7};
        // System.out.println(combinationSum(candidates, 8));
        
    
        
    }
    
    
}