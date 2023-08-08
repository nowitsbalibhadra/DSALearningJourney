import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={3,5,2,9,6,1};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]) {
                    swap(arr,j, j - 1);
                }else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
