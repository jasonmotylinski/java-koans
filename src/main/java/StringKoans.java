import java.util.Arrays;
import java.util.Hashtable;

/**
 * Created by developer on 1/12/17.
 */
public class StringKoans {

    public static boolean isUnique(String str){
        if(str.length() > 128){
            return false;
        }
        boolean[] chars = new boolean[128];
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(chars[c]){
                return false;
            }
            chars[c] = true;
        }
        return true;
    }

    public static boolean isPermutation(String str1, String str2){
       if(str1.length() != str2.length()) {
           return false;
       }

       return sort(str1).equals(sort(str2));
    }

    public static boolean isPalindrome(String str1){
        String reversed = "";
        for(int i = str1.length() - 1; i >= 0; i--)
           reversed = reversed + str1.charAt(i);

        return str1.equals(reversed);
    }

    private static String sort(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
