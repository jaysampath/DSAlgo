class Solution {
	void mergeSort (int[] arr) {
		// add your logic here
		// base condition
		if(arr.length<2)
			return;
		//divide the arrays based on mid point
		int n = arr.length;
		int mid = n/2;
		int l[] = new int[mid];
		int r[] = new int[n-mid];
		//populate the halved arrays
		for(int i=0;i<mid;i++)
			l[i] = arr[i];
		for(int i = mid;i<n;i++)
			r[i-mid]=arr[i];
		//mergeSort on left half
		mergeSort(l);
		//mergeSort on right half
		mergeSort(r);
		//merge the sorted two halves
		merge(arr,l,r,mid,n-mid);
	}
	void merge(int[] arr,int[] l,int[] r,int left,int right){
		int i=0,j=0,k=0;
		while(i<left && j<right){
			if(l[i]<r[j]){
				arr[k++]=l[i++];
			}else{
				arr[k++]=r[j++];
			}
		}
		while(i<left){
			arr[k++]=l[i++];
		}
		while(j<right){
			arr[k++]=r[j++];
		}
	}
}
