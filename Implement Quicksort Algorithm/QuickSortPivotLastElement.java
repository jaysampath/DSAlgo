import java.util.Arrays;

public class QuickSortPivotLastElement {

    void quicksort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr,low,high);

            quicksort(arr,pi+1,high);
            quicksort(arr,low,pi-1);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        QuickSortPivotLastElement obj = new QuickSortPivotLastElement();
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        obj.quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
