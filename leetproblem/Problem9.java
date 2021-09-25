import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Problem9 {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            int flag = 1;
            digits[i] += flag;
            if (digits[i] <= 9) {
                flag = 0;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }

    public static int mySqrt(int x) {
        int count = 0;
        for (int i = 1; i <= x; i += 2) {
            x -= i;
            count++;
        }
        return count;

    }

    public static void quickSort(int x[], int left, int right) {
        if (left < right) {
            int k = (left + right) / 2;
            int t = x[k];
            int i = left;
            int j = right;
            do {
                while (x[i] < t)
                    i = i + 1;
                while (x[j] > t)
                    j = j - 1;
                if (i <= j) {
                    int tg = x[i];
                    x[i] = x[j];
                    x[j] = tg;
                    i = i + 1;
                    j = j - 1;
                }
            } while (i <= j);
            quickSort(x, left, j);
            quickSort(x, i, right);
        }
    }

    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;// create temp node to store head node
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else
                temp = temp.next;
        }
        return head;

    }

    public static void SelfAvoidingWalk(int n) {
        boolean[][] a = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = false;
                System.out.print(a[i][j] + "\t");
            }

            System.out.print("\n");
        }
        System.out.println("\n");
        int x = n / 2;
        int y = n / 2;
        int deadend = 0;
        while (x > 0 && x < n - 1 && y > 0 && y < n - 1) { // Check for dead end and make a random move.
            a[x][y] = true;
            if (a[x + 1][y] && a[x - 1][y] && a[x][y + 1] && a[x][y - 1])// if surrounded by true then break
            {
                deadend++;
                break;
            }
            double r = Math.random();
            if (r < 0.25) {
                if (!a[x + 1][y])
                    x++;
            } else if (r < 0.50) {
                if (!a[x - 1][y])
                    x--;
            } else if (r < 0.75) {
                if (!a[x][y + 1])
                    y++;
            } else {
                if (!a[x][y - 1])
                    y--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }

            System.out.print("\n");
        }

    }


    static List<Integer> list = new ArrayList<Integer>();
    public static List<Integer> inorderTraversal(TreeNode root) {

         if(root !=  null) 
         {
            inorderTraversal(root.left);
            //Visit the node by Printing the node data
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return list;
    }


    public static void main(String[] args) {
        // int []nums = {9,2,9,5,3,8,6};
        // System.out.println(Arrays.toString(plusOne(nums)));
        // System.out.println(mySqrt(25));
        // System.out.println(Arrays.toString(sortArray(nums)));
        //SelfAvoidingWalk(4);
        


    }

}
class TreeNode 
{
         int val;
         TreeNode left;
         TreeNode right;
        TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
            this.right = right;
         }
}
