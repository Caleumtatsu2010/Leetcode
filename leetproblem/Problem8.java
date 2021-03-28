import java.util.Stack;


public class Problem8 
{
    public static boolean isValid(String s) 
    {
        Stack st = new Stack();
        if(s.isEmpty())
            return false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                st.push(s.charAt(i));
            }
            else if(st.isEmpty() || (s.charAt(i) == ')' && st.peek() != "(") || (s.charAt(i) == ']' && st.peek() != "[") || (s.charAt(i) == '}' && st.peek() != "{"))
            {
                return false;
            }
            else
            {
                st.pop();
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int climbingStairs(int i, int n)
    {
        if(i > n)
        {
            return 0;
        }
        if(i == n)
        {
            return 1;
        }
        else
        {
            return climbingStairs(i+1, n) + climbingStairs(i+2, n);
        }
    }
    public static void main(String[] args) 
    {
        //System.out.println(isValid("()[]{}"));
        System.out.println(climbingStairs(0, 3));

        
    }
    
}
