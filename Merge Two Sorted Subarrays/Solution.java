class Solution {
	void merge (int[] arr, int endIndex) {
		// add your logic here
		int i=0,j=endIndex+1,k=0;
		int n = arr.length;
		int[] res = new int[n];
		while(i<=endIndex && j<n){
			if(arr[i]<arr[j]){
				res[k++]=arr[i++];
			}else{
				res[k++]=arr[j++];
			}	
		}
		while(i<=endIndex){
				res[k++]=arr[i++];
			}
			while(j<n){
				res[k++]=arr[j++];
			}
		for(int y=0;y<n;y++){
			arr[y]=res[y];
		}
	}
}
