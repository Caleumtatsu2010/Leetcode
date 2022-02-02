public class Problem11 {
    public static boolean validMountainArray(int[] arr) {
        if(arr.length <3)
            return false;
        int l = 0;
        int r = arr.length-1;
        while(l+1 <arr.length-1 && arr[l] < arr[l+1])
            l++;
        
        while(r-1 > 0 && arr[r] < arr[r-1])
            r--;

        if(l == r)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{0,3,2,1};
        System.out.println(validMountainArray(arr));
    }
    
}
