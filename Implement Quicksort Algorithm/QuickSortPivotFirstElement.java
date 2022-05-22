public class QuickSortPivotFirstElement {
    private void quicksort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr,low,high);

            quicksort(arr,pi+1,high);
            quicksort(arr,low,pi-1);
        }
    }

    private int partition(int[] arr, int low, int high) {
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
        QuickSortPivotFirstElement obj = new QuickSortPivotFirstElement();
        int[] arr = {5, 9, 4, 6, 5, 3};
        obj.quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
