import java.util.Arrays;

public class Problem9 {

    public static int[] plusOne(int[] digits) 
    {
        int n = digits.length;

        for(int i = n-1; i>=0; i--)
        {
            int flag = 1;
            digits[i] += flag;
            if(digits[i] <= 9)
            {
                flag = 0;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        int[] res = new int[n+1];
        res[0] = 1;
        return res;
    }
    public static void main(String[] args) {
        int []nums = {9,2,9};
        System.out.println(Arrays.toString(plusOne(nums)));
        
    }
    
}
