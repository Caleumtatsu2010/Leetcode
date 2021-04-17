import java.util.HashMap;
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
        
        
    }
    public static void main(String[] args) 
    {
        System.out.println(removeDuplicates("deeedbbcccbdaa", 3));
        
        
    }
}