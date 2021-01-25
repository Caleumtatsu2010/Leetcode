

public class Problem6 
{
    public static int singleNumber(int[] nums) 
    {
        int  result = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            result = result^nums[i];// XOR gate
        }
        return result;       
    }
    public static void main(String[] args) 
    {
        // int nums[] = new int[]{1,2,1,2,3,4,5,6,6,5,4};
        // System.out.println(singleNumber(nums));
        
    }
    
}