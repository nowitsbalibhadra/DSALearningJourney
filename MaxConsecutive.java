public class MaxConsecutive {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1 };
        System.out.println(MaxConsecutiveOne(arr));
    }

    static int MaxConsecutiveOne(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}
