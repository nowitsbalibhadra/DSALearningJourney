import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter Your String");
        String s = user.next();
        // String s = "Hello bali, Keep trying so hard";
        System.out.println(count(s));
    }

    /**
     * @param s
     * @return
     */
    static int count(String s) {
        // String[] str = s.split("");
        // return str.length;
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
                count += 1;
            }
        }
        return count;
    }
}
