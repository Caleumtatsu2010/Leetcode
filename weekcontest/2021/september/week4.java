
import java.util.List;
import java.lang.reflect.Array;
import java.util.*;

public class week4 {
    public static String breakPalindrome(String palindrome) 
    {
        int length = palindrome.length();
        if (length == 1) {
            return "";
        }
        // Strings are immutable in Java, convert it into a char array
        char[] palindromeArray = palindrome.toCharArray();

        for (int i = 0; i < length / 2; i++) {
            if (palindromeArray[i] != 'a') {
                palindromeArray[i] = 'a';
                return String.valueOf(palindromeArray);
            }
        }

        palindromeArray[length - 1] = 'b';
        return String.valueOf(palindromeArray);
    }

    public static void main(String[] args) {
        System.out.println(5/2);
    }

}
