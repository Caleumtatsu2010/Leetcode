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
    public static int mySqrt(int x) {
        int count = 0;
        for(int i=1; i<=x; i += 2)
        {
            x -= i;
            count++;
        }
        return count;
        
    }
    public static void quickSort(int x[], int left, int right)
    {
        if (left < right) 
        {
            int k = (left + right) / 2; 
            int t = x[k];
            int i = left; int 
            j = right;
            do
            {
                while (x[i] < t) i = i + 1;
                while (x[j] > t) j = j - 1;
                if (i <= j) 
                {
                    int tg = x[i];
                    x[i] = x[j]; x[j] = tg;
                    i = i+1; j = j-1;
                }
            }while (i <= j);
            quickSort(x,left,j);
            quickSort(x,i,right);
        }
    }
    public static int[] sortArray(int[] nums)
    {
        quickSort(nums, 0, nums.length-1);
        return nums;

    }
    public static void main(String[] args) {
        int []nums = {9,2,9,5,3,8,6};
        //System.out.println(Arrays.toString(plusOne(nums)));
        //System.out.println(mySqrt(25));
        System.out.println(Arrays.toString(sortArray(nums)));
        
    }
    
}
