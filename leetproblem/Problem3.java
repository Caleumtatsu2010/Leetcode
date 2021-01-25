

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem3
{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n = nums1.length + nums2.length;
        int sum = 0;
        for(int i=0;i<nums1.length;i++)
        {
            sum = sum +nums1[i];
        }
        for(int i=0;i<nums2.length;i++)
        {
            sum = sum + nums2[i];
        }
        return  sum/n;
    }
    public static double myPow(double x, int n) 
    {
        double result = 1;
        int i=0;
        if(n >0)
        {
            while(i < n)
            {
                result = result *x;
                i++;
            }
        }
        else if(n<0)
        {
            while(i < Math.abs(n))
            {
                result = result *(1/x);
                i++;
            }
        }
        else
            return 1;

        return result;
        
    }
    public static List<List<Integer>> threeSums(int nums[])
    {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0)
                    {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        set.add(list);
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
    public static int getClosest(int val1, int val2, int target)
    {
        if((val1-target) >= (val2-target) )
        {
            return val2;
        }
        else
        return val1;
    }
    public static int threeSumClosest(int[] nums, int target) 
    {   
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums.length-2;i++)
        {
           for(int j=i+1;j<nums.length-1;j++)
           {
               for(int k=j+1;k<nums.length;k++)
               {
                   int sum= nums[i]+nums[j]+nums[k];
                    int distance= Math.abs(sum-target);//get the distance between sum and target
                    list.add(distance);
               }
           } 
        }
        Collections.sort(list);// find min distance
        return list.get(0)+target;
    }
        

        
    public static void main(String[] args) 
    {
        // int[] nums1 = new int[] {3};
        // int[] nums2 = new int[] {-2, -1};
        // System.out.println(findMedianSortedArrays(nums1, nums2));
        //System.out.println(myPow(2, -3));
        //int nums[] = new int[]{-1, 2, 1, -4};
        // System.out.println(threeSums(nums));
        //System.out.println(threeSumClosest(nums, 1));

        

        
    }
    
}