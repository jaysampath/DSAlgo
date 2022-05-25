class Solution {
	int largestContiguousSum(int[] arr){
		int result = Integer.MIN_VALUE;
		int sum = 0;
		for(int i : arr){
			sum += i;
			
			if(result<sum)
				result=sum;
			if(sum<0)
				sum=0;
		}
		return result;
	}
}
