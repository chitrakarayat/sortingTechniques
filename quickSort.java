import java.util.Arrays;

public class quickSort{  
  
     public static int partition(int arr[],int low,int high){
        int pivot =arr[high];
        int j=low-1;
        for (int i=low; i<high;i++){
            if(arr[i]<=pivot){
                j++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        int temp=arr[j+1];
        arr[j+1]=arr[high];
        arr[high]=temp;
        return j+1;
    }

    public static void QuickSort(int arr[],int low,int high){
        if(low<high){
            int partition=partition(arr, low,high);

            quickSort(arr,low,partition-1);
            quickSort(arr,partition+1,high);

        }

    }
}
