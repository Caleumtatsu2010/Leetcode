import java.util.ArrayList;
import java.util.List;
class Node
{
    int val;
    Node left, right;
 
    public Node(int val)
    {
        this.val = val;
        left = right = null;
    }
}

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
    static void readNode(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.val);
        readNode(root.left);
        readNode(root.right);
    }


    public static void main(String[] args) {
        // int arr[] = new int[]{0,3,2,1};
        // System.out.println(validMountainArray(arr));

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(7);
        tree.root.left.right.right = new Node(8);
        tree.root.right = new Node(3);
        tree.root.right.right = new Node(6);
        tree.root.right.right.left = new Node(9);

        
        readNode(tree.root);



    }   
}
class BinaryTree{

    Node root;
    BinaryTree(int key)
    {
        root = new Node(key);
    }
 
    BinaryTree()
    {
        root = null;
    }
}

