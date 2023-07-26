import java.util.*;

public class reverseword {
    public static void main(String[] args) {
        Reverse("Bali, I really love you!");
    }

    static void Reverse(String str) {
        String[] words = str.split(" ");
        String rev_string = " ";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            rev_string = rev_string + sb + " ";
        }
        System.out.println(rev_string);
    }
}
