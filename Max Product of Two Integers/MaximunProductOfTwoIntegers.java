import java.util.Arrays;

public class MaximunProductOfTwoIntegers {
    public static void main(String[] args) {
        int[] arr = {-10,-20,-40,-60,-50,10,30,50,20,40};

        maxProductSingleTraversal(arr);
        maxProductUsingSorting(arr);
    }

    private static void maxProductSingleTraversal(int[] arr) {
        int firstPositiveMax = Integer.MIN_VALUE;
        int secondPositiveMax = Integer.MIN_VALUE;

        int firstNegativeMin = Integer.MAX_VALUE;
        int secondNegativeMin = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
                if (firstPositiveMax < arr[i]) {
                    secondPositiveMax = firstPositiveMax;
                    firstPositiveMax = arr[i];
                }else if(secondPositiveMax < arr[i])
                    secondPositiveMax = arr[i];
            if(arr[i]<0){
                if(arr[i] < firstNegativeMin){
                    secondNegativeMin = firstNegativeMin;
                    firstNegativeMin = arr[i];
                }else if(arr[i] < secondNegativeMin)
                    secondNegativeMin = arr[i];
            }
        }

        int productOfPositiveMaxNums = firstPositiveMax*secondPositiveMax;
        int productOfNegativeMinNums = firstNegativeMin*secondNegativeMin;
        System.out.println("maxProductSingleTraversal -> " + Math.max(productOfPositiveMaxNums,productOfNegativeMinNums));
    }

    private static void maxProductUsingSorting(int[] arr) {
        Arrays.sort(arr);
        int productOfFirstTwo = arr[0]*arr[1];
        int productOfLastTwo = arr[arr.length-1]*arr[arr.length-2];
        System.out.println("maxProductUsingSorting -> " + Math.max(productOfFirstTwo,productOfLastTwo));
    }
}
