import java.util.*;

public class palindromicSubString {
    public static void main(String[] args) {
        substring("abccbc");
    }

    static void substring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String st = str.substring(i, j);
                if (palindrome(st)) {
                    System.out.println(st);
                }
            }
        }
    }

    static boolean palindrome(String str) {
        StringBuilder str_new = new StringBuilder(str);
        str_new.reverse();
        if (!str_new.toString().equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

}
