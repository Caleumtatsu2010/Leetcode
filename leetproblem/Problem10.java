import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Problem10
{
    static Stack stack;
    public static String reverseWords(String s) 
    {
        String res="";
        int n= s.length();
        stack = new Stack<String>();
        int j=0;
        
        for(int i=0;i<n;i++)
        {
            
            if(s.charAt(i) == ' ')
            {
                stack.push(s.substring(i-j, i));
                j=0;
            }
            else
            {
                j++;
            }
        }
        if(s.charAt(n-1) !=' ')
        {
            stack.push(s.substring(n-j, n));
        }
        for (Object o : stack.toArray()) {
            res = res + stack.pop().toString() +" ";
        }

        return res.trim().replaceAll("\\s+", " ");
        
        

    }
    
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
}


