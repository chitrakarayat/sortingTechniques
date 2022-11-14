import java.util.Arrays;

public class mergeSort{

     public static void mergeTwoSortedSubArrays(int arr[],int b,int e,int m){
     
        int x=m-b+1;
        int y=e-m;
        int arr1[]=new int[x];
        int arr2[]=new int[y];
        for(int i=0;i<x;i++){
            arr1[i]=arr[b+i];
        }

        for(int i=0;i<y;i++){
            arr2[i]=arr[m+i+1];
        }
        int i=0;
        int j=0;
        int p=b;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>=arr2[j]){
                arr[p]=arr2[j];
                j++;
            }
            else{
                arr[p]=arr1[i];
                i++;
            }
            p++;
        }

        while(i<arr1.length){
            arr[p]=arr1[i];
            i++;
            p++;
        }
        while(j<arr2.length){
            arr[p]=arr2[j];
            j++;
            p++;
        }
    }

    public static void MergeSort(int arr[],int b,int e){
        if(b<e){
            int m=(b+e)/2;

            mergeSort(arr,b,m);
            mergeSort(arr,m+1,e);

            mergeTwoSortedSubArrays(arr,b,e,m);
        }
    }
}
