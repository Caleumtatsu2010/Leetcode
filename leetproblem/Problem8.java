import java.util.*;

public class Problem8 
{
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        combinatrics(candidates,0,target,list,new LinkedList<Integer>());
        return list;
    }
    public void combinatrics(int[] candidates,int start,int target,List<List<Integer>> list,LinkedList<Integer> listin){
        if(target==0)
        {
            list.add(new ArrayList<Integer>(listin));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i] == candidates[i-1]) continue;
            listin.add(candidates[i]);
            combinatrics(candidates,i+1,target-candidates[i],list,listin);
            listin.removeLast();
        }
    }
    public static int numIdenticalPairs(int[] nums) 
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static int strStr(String haystack, String needle) 
    {
        int check = needle.length();
        if(check == 0)
        {
            return 0;
        }
        if(haystack.equals(needle))
        {
            return 0;
        }
        for(int i=0;i<haystack.length() - check + 1;i++)
        {
            if(haystack.substring(i, i+check).equals(needle))
            {
                return i;
            }

        }
        return -1;
        
    }
    public static void main(String[] args) 
    {
        //int []nums = {1,2,3,1,1,3};
        //System.out.println(numIdenticalPairs(nums));
        System.out.println(strStr("abcdeeefgh", "eee"));

    }
    
}
