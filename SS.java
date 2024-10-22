import java.io.*;
class SS{
    void sort(int arr[]){
        int n = arr.length;


        for(int i = 0;i < n-1;i++){
            int min_idx = i;
            for(int j = i+1;j < n;j++){
                if(arr[j] < arr[min_idx]){
                min_idx = j;
            }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        SS ob = new SS();
        int arr[] = {60,7,20,55,11};
        ob.sort(arr);
        System.out.println("Sorted Array");
        ob.printArray(arr);
    }
}