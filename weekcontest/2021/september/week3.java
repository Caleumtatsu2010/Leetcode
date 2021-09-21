
import java.util.List;
import java.lang.reflect.Array;
import java.util.*;

public class week3 {
    public static int maxTurbulenceSize(int[] A) {
        int mx = 0, c = 0;

        for (int i = 0; i < A.length; i++) {
            if (i >= 2 && ((A[i - 2] > A[i - 1] && A[i - 1] < A[i]) || (A[i - 2] < A[i - 1] && A[i - 1] > A[i]))) {
                c++;
            } else if (i >= 1 && A[i - 1] != A[i]) {

                c = 2;
            } else {

                c = 1;
            }
        }
        return Math.max(mx, c);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    result.add(nums2[j]);
                    nums2[j] = -1;// prevent duplicate
                    break;
                }
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;

    }

    // public static String tictactoe(int[][] moves) {
    //     for (int row = 0; row < moves.length; row++) {
    //         for (int col = 0; col < moves[row].length; col++) 
    //         {
                
    //             if(moves[row][col] == moves[row][col+1] == moves[row][col+2])
    //             {

    //             }
    //         }
    //     }

    // }
    public static int findMaxConsecutiveOnes(int[] nums) 
    {
        List<Integer> maxlist = new ArrayList<Integer>();
        int n = nums.length;
        int count = 0;
        int max = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 1)
            {
                count++;
            }
            else{
                maxlist.add(count);
                count = 0;
            }
        }
        maxlist.add(count);
        return Collections.max(maxlist);
        
        
    }

    public static void main(String[] args) {
        // int nums1[] = new int[] {1,2,2,1};
        // int nums2[] = new int[] {2,2};
        // System.out.println(Arrays.toString(intersect(nums1, nums2)));
        int []nums = {1,1,0,1,1,1, 0, 0, 1,1,1,1, 1};
        System.out.println(findMaxConsecutiveOnes(nums)); 

    }

}
