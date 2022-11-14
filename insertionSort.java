import java.util.Arrays;

public class insertionSort {

     // key points
    // places elements at its suitable place
    // Time Complexity O(n^2)
    // Space Complexity O(1)
    public static void InsertionSort(int arr[]){
        for (int i=1;i<arr.length;i++){
            int j=i-1;
            int key=arr[i];
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
  
}
