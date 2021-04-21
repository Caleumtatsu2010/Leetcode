import java.util.ArrayList;
import java.util.List;

public class Node
{
    int val;
    List<Node> children = new ArrayList<>();
    Node(int val, List<Node> children)
    {
        this.val = val;
        this.children  = children;
    }
    Node(int val)
    {
        this.val = val;
    }
    static List<Integer> result = new ArrayList<>();
    public static List<Integer> preorder(Node root) 
    {
        
        if(root == null)
        {
            return result;
        }
        result.add(root.val);
        for(Node child:root.children)
        {
            preorder(child);
        }
        return result;
    }
    public static void main(String[] args) 
    {
        Node root = new Node(1);
        root.children.add(new Node(2));
        root.children.add(new Node(3));
        root.children.add(new Node(4));
        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));
        root.children.get(1).children.add(new Node(8));
        root.children.get(2).children.add(new Node(9));
        root.children.get(2).children.add(new Node(10));
        System.out.println(preorder(root));
    }
}



