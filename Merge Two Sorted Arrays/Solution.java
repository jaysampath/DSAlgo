class Solution {
	int[] mergeSortedArrays(int[] A, int[] B) {
	    // add your logic here
		int n1 = A.length;
		int n2 = B.length;
		int i=0,j=0,k =0;
		int[] res = new int[n1+n2];
		while(i<n1 && j<n2){
			if(A[i]<B[j]){
				res[k++]=A[i++];
			}else{
				res[k++]=B[j++];
			}
		}
		while(i<n1){
			res[k++]=A[i++];
		}
		while(j<n2){
			res[k++]=B[j++];
		}
		return res;
	}
}
