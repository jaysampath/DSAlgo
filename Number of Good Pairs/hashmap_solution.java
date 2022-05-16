class Solution {
    public int numIdenticalPairs(int[] arr) {
        int count=0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i : arr){
			if(!map.containsKey(i)){
				map.put(i,1);
			}else{
				map.put(i,(map.get(i)+1));
			}
		}
		for(int i:arr){
			int temp = map.get(i);
			if(temp>=2){
				
				map.put(i,(map.get(i)-1));
				count += map.get(i);
			}
		}
		return count;
        
    }
}
