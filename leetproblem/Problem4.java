

public class Problem4 
{
    public static void removeDuplicates(int[] nums) 
    {
        int n = nums.length;
        int[] temp = new int[n]; 
        int j = 0; 
        for (int i=0; i<n-1; i++)
        {
            if (nums[i] != nums[i+1])
            {
                temp[j++] = nums[i]; 
            }
        } 
        temp[j++] = nums[n-1];    
        for(int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }

    }
    public static boolean isPowerOfFour(int num) 
    {
        boolean result = false;
        for(int i = 0;i<16;i++)
        {
            if(num == Math.pow(4, i))
            {
                result = true;
            }
        }
        return result;

    }
    public static int lengthOfLastWord(String s) 
    {
        if(s.length() == 0)
            return 0;
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != ' ')
            {
                count++;
            }
            if(count == s.length())
            return s.length();
        }
        s.trim();
        String arrstring[] = s.split(" ");
        return arrstring[arrstring.length-1].length();
    }
    public static void main(String[] args) 
    {
        // int nums[] = new int[]{1, 1, 2, 2, 3, 4, 5, 5, 6, 6, 6, 7};
        // removeDuplicates(nums);
        //System.out.println(isPowerOfFour(16));
        //System.out.println(lengthOfLastWord("abce rfdg"));

        
    }
}