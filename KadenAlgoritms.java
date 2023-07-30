public class KadenAlgoritms {
    public static void main(String[] args) {
        int a[] = { 5, -4, 6, -3, 4, -1 };
        System.out.println(maxSumSubArray(a));
    }

    static int maxSumSubArray(int[] a) {
        int maxSum = 0;
        int currSum = 0;
        for (int i = 0; i < a.length; i++) {
            currSum += a[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
