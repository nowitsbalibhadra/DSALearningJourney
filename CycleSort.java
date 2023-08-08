import java.util.Arrays;
//when given numbers from range 1 to N-> use cycle sort
public class CycleSort {
    public static void main(String[] args) {
       int arr[] ={3,1,5,4,2,6,7,8};
       cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle(int[] arr){
        int index=0;
        while(index<arr.length){
            int correctIndex=arr[index]-1;
            if(arr[index]!=arr[correctIndex]){
                swap(arr,index,correctIndex);
            }else{
                index++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
