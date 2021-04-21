import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class week3
{
    public static String removeDuplicates(String s, int k) 
    {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i), 1);
            }
            else
            {
                map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        for(Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue() == k)
            {
                
                s=s.replace(entry.getKey().toString(), "");
            }
		}
        return s;
    }
    public static int numSubmatrixSumTarget(int[][] matrix, int target) 
    {
        
        return 0;
    }
    // public static ListNode removeNthFromEnd(ListNode head, int n) 
    // {
    
    // }
    public static int combinationSum4(int[] nums, int target) 
    {
        if(target == 0)
        {
            return 1;
        }
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] <= target)
            {
                count = count + combinationSum4(nums, target-nums[i]);
                System.out.println(count);
            }
        }
        return count;
    }
    //[root, left , right]
    public static List<Integer> preorder(Node root) 
    {
        List<Integer> result = new ArrayList<>();
        if(root = null)
        {
            return result;
        }
        result.add(root);
        for(Node child:root.children)
        {
            preorder(child);
        }
        return result;
    }
    public static void main(String[] args) 
    {
        //System.out.println(removeDuplicates("deeedbbcccbdaa", 3));
        // int []nums = new int[]{1,2,3};
        // System.out.println(combinationSum4(nums, 3));
        


    }
}

