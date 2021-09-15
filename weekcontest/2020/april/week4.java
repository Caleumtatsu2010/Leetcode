import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class week4 
{
    static int best=0;
    static Map<Integer, Integer> freq = new HashMap<>();
    public static int leastBricks(List<List<Integer>> wall) 
    {
        for(int i=0;i<wall.size();i++)
        {
            processRow(wall.get(i));
        }
        // find highest frequency of an specify edge
        Map.Entry<Integer, Integer> entryWithMaxValue = null;
        for (Map.Entry<Integer, Integer> currentEntry : freq.entrySet()) {
  
            if (entryWithMaxValue == null|| currentEntry.getValue().compareTo(entryWithMaxValue.getValue())> 0) 
            {
  
                entryWithMaxValue = currentEntry;
            }
        }
        best = entryWithMaxValue.getValue();
        return wall.size() - best; //wall row - most frequent edge = least brick
        

    }
    public static void processRow(List<Integer> row)
    {
        int rowsum = row.get(0);
        for(int i=1;i<row.size();i++)//find frequency of each edge in a row
        {
            if(!freq.containsKey(rowsum))
            {
                freq.put(rowsum, 1);
            }
            else
            {
                freq.replace(rowsum, freq.get(rowsum)+1);
            }
            rowsum += row.get(i);
        }
        System.out.println(freq);
    }
    public static int countBinarySubstrings(String s) 
    {
        int[] groups = new int[s.length()];
        int t = 0;
        groups[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) != s.charAt(i)) {
                groups[++t] = 1;
            } else {
                groups[t]++;
            }
        }
        int ans=0;
        for (int i = 1; i <= t; i++) {
            ans += Math.min(groups[i-1], groups[i]);
        }
        return ans;
    }
    public static boolean isPowerOfThree(int n) 
    {
        if (n < 1)//3^0 = 1
            return false;
        while(n>=3)//3^2 ==9 => n%3==0
        {
            if(n%3 != 0)//n ko chia het cho 3
            {
                return false;
            }
            n = n/3;
        }
        return n==1;
    }
    public static int furthestBuilding(int[] h, int b, int l) 
    {
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        for(int i=0;i<h.length-1;i++)
        {
            int diff = h[i+1] - h[i]; 
            if(diff > 0)
            {
                min_heap.add(diff);
            }//use bricks first for small distance
            if(min_heap.size() > l)
            {
                b = b - min_heap.remove();
            }
            //if heapmin.size() == ladder => we can pass more heapmin.size() builings
            if(b<0)
            {
                return i;
            }
        }
        return h.length - 1;
    }

    public static void main(String[] args) {
        
        //System.out.println(countBinarySubstrings("00110011"));
        // int [][]matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        // rotate(matrix);
        //System.out.println(isPowerOfThree(2));
        // int []h = {4,12,2,7,3,18,20,3,19};
        // System.out.println(furthestBuilding(h, 10, 2));
    }
}
