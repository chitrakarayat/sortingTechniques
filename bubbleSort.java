import java.util.Arrays;

public class bubbleSort {


    // key points
    // compare adjacent elements
    // after every iteration the largest element in the sub-array reaches the end
    // Time Complexity O(n^2)
    // Space Complexity O(1)
    // Number of comparisons in each step n-i
    // Total number of comparisons n(n-1)/2

    public static void BubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

