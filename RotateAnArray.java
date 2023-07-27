import java.util.*;

public class RotateAnArray {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        rotate(a, 3);
        display(a);
    }

    static void reverse(int[] a, int s, int e) {
        int temp;
        s = 0;
        e = a.length - 1;
        while (s < e) {
            temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }

    public static void rotate(int[] a, int k) {
        k = k % a.length;
        if (k < 0) {
            k = k + a.length;
        }
        // part 1
        reverse(a, 0, a.length - k - 1);
        // part 2
        reverse(a, a.length - k, a.length - 1);
        // reverse all
        reverse(a, 0, a.length - 1);
    }
}