import java.util.Arrays;

public class QuickSortPivotLastElement {

    void quicksort(int[] arr, int low, int high){
		if(low<high){
			//get the pivot
			int pi = partition(arr,low,high);
			//sort the left half of pivot
			quicksort(arr,low,pi-1);
			//sort the right half of pivot
			quicksort(arr,pi+1,high);
		}
	}
	
	int partition(int[] arr, int low, int high){
		//implement the partition
		
		//choose an element as pivot
		//choosing the last element in this case
		int pivot = arr[high];
		
		//start value
		int i = low-1;
		
	    //replace small elements before pivot
		for(int j=low;j<high;j++){
			if(arr[j]<pivot){
				i++;
				swap(arr,i,j);
			}
		}
		
		//place pivot at the right position
		swap(arr,i+1,high);
		
		//return the right position
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
