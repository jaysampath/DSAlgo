import java.util.Arrays;
import java.util.Random;

public class QuickSortPivotRandomElement {
    private void quicksort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr,low,high);

            quicksort(arr,pi+1,high);
            quicksort(arr,low,pi-1);
        }
    }

    private void randomPartition(int[] arr,int low,int high) {
        Random random = new Random();
        int rand = random.nextInt(high-low)+low;
        swap(arr,rand,low);
    }

    private int partition(int[] arr, int low, int high) {
        randomPartition(arr,low,high);
        int pivot = arr[low];
        int i = high+1;
        for(int j=high;j>=0;j--){
            if(arr[j]>pivot){
                i--;
                swap(arr,i,j);
            }
        }
        swap(arr,i-1,low);
        return i-1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        QuickSortPivotRandomElement obj = new QuickSortPivotRandomElement();
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        obj.quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
