import java.util.ArrayList;
import java.util.List;

public class Problem7
{
    public static int count(List<Integer> list , int n)
    {
        int count=0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i) == n)
            {
                count++;
            }
        }
        return count;
    }
    public static List<String> frequencyNumbers(int[] nums) 
    {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> n = new ArrayList<Integer>();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            n.add(nums[i]);
            if(!tmp.contains(nums[i]))
            {
                tmp.add(nums[i]);
            }
        }
        for(int i=0; i<tmp.size();i++)
        {
            int count = count(n, tmp.get(i));
            list.add("["+tmp.get(i)+", "+count+"]");
        }
        return list;
    }
    public static boolean containsDuplicate(int[] nums) 
    {
        boolean result=false;
        ArrayList<Integer> n = new ArrayList<Integer>();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            n.add(nums[i]);
            if(!tmp.contains(nums[i]))
            {
                tmp.add(nums[i]);
            }
        }
        for(int i=0; i<tmp.size();i++)
        {
            int count = count(n, tmp.get(i));
            if(count > 1)
            {
                result=true;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int []nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        //System.out.println(containsDuplicate(nums));
        //System.out.println(frequencyNumbers(nums));
    }
}