import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ListNode 
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Problem7
{
    public static int[] plusOne(int []digits)
    {
        for(int i=digits.length-1; i>=0; i--)
        {
            if(digits[i] != 9)
            {
                digits[i]++;
            }
            else
            {
                digits[i] =0;
                if(i == 0)
                {
                    digits = new int[ (digits.length-1) + 2];
                    digits[i] = 1;
                }
            }
        }
        return digits;
    }
    public static int lengthOfLongestSubstring(String s) 
    {
        int count=0;
        List<String> list = new ArrayList<String>();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                list.add(s.substring(i-count, i));
                map.clear();
                count=0;
                i--;
            }
            else
            {
                map.put(s.charAt(i), i);
                count++;
            }
            
        }        
        int maxstring = list.get(0).length();
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i).length() > maxstring)
            {
                maxstring = list.get(i).length();
            }
        }
        return maxstring;
    }

    public static void main(String[] args) 
    {
        // int digits[] = {4, 3, 2, 1};
        // System.out.print(plusOne(digits));
        //System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }

}