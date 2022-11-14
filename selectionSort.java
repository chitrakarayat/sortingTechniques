import java.util.Arrays;

public class selectionSort {

    // key points
    // after every iteration the smallest element in the subarray reaches the first position
    // Space Complexity O(1)
    // Time Complexity O(n^2)
    // Number of iterations in each step n-i

    public static void selectionSort(int arr[]){
        for (int i=0;i<arr.length -1;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
