
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class Problem10 {
    static Stack stack;

    public static String reverseWords(String s) {
        String res = "";
        int n = s.length();
        stack = new Stack<String>();
        int j = 0;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == ' ') {
                stack.push(s.substring(i - j, i));
                j = 0;
            } else {
                j++;
            }
        }
        if (s.charAt(n - 1) != ' ') {
            stack.push(s.substring(n - j, n));
        }
        for (Object o : stack.toArray()) {
            res = res + stack.pop().toString() + " ";
        }

        return res.trim().replaceAll("\\s+", " ");

    }

    // String temp[] = new String[100];
    // int mark[] = new int[100];
    public static String frequencySort(String s) {
        StringBuilder res = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] str_array = s.toCharArray();
        for (char c : str_array) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Map<Character, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        Object[] arr = sortedMap.keySet().toArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            int size = map.get(arr[i]);
            while (size > 0) {
                res.append(arr[i]);
                size--;
            }
        }
        return res.toString();

    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int temp = 1;
        int i = 0;
        while (i < n) {
            for (int j = i + 1; j < n; j++) {
                temp *= nums[j];
            }
            for (int j = i - 1; j >= 0; j--) {
                temp *= nums[j];
            }
            res[i] = temp;
            temp = 1;
            i++;
        }
        return res;
    }

    public static int searchInsert(int[] nums, int target) 
    {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] > target) {
                return i;
            }
        }

        return nums.length;
    }
    public static int maxDistance(int[] colors) 
    {
        int n = colors.length;
        //int res[] = new int[n*n];
        int max = 0;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if(colors[i] != colors[j])
                {
                    int dis = Math.abs(i - j);
                    // res[i] = dis;
                    if (dis > max)
                        max = dis;
                }
            }
        }
        return max;
        
    }



    public static void main(String[] args) {
        // System.out.println(reverseWords("a good example"));
        // System.out.println(frequencySort("aaaa"));
        // System.out.println(frequencySort("aaaaaaaebbccc"));
        //int[] nums = new int[] { 1, 3, 5, 6 };
        // System.out.println(Arrays.toString(productExceptSelf(nums)));
        //System.out.println(searchInsert(nums, 7));
         int[] colors = new int[] { 1,1,1,6,1,1,1};
         System.out.println(maxDistance(colors));
    }
}
