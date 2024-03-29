import java.util.ArrayList;
import java.util.HashMap;
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
    public static boolean canConstruct(String ransomNote, String magazine) 
    {
        
        if (ransomNote.length() > magazine.length())
        {
            return false;
        } 
        HashMap <Character, Integer> hashMap = new HashMap <Character, Integer>();
        for (int i=0;i<magazine.length();i++) 
        {
            char ch = magazine.charAt(i);
            if (hashMap.containsKey(ch)) 
            {
                hashMap.put(ch, hashMap.get(ch)+1);
            } else 
            {
                hashMap.put(ch, 1);
            }   
        }

        for (int i=0;i<ransomNote.length();i++) 
        {
            char ch = ransomNote.charAt(i);
            if (!hashMap.containsKey(ch)) return false;
            else 
            {
                if (hashMap.get(ch) != 0) 
                {
                    hashMap.put(ch, hashMap.get(ch)-1);
                } else
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static int countNegatives(int[][] grid) 
    {
		int count = 0;
		for(int i=0;i<grid.length;i++)
        {
			for(int j=0;j<grid[0].length;j++)
            {
				if(grid[i][j]>=0) count++;
				else break; // stop counting if negative hit since the rest will be negative also
			}            
		}
		return grid.length*grid[0].length - count;
	}
    public static void main(String[] args) {
        int []nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        //System.out.println(containsDuplicate(nums));
        //System.out.println(frequencyNumbers(nums));
        //System.out.println(canConstruct("aa", "aab"));
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
}