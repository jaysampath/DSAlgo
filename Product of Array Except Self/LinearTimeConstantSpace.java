class LinearTimeConstantSpace {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        // Take the total product of the array and replace it with dividing ith element at position i
        // However it breaks the case where single/multiple zeros exist
        // if a single zero exist except that position, every other element should be zero
        // if multiple zeros exist all the elements should be zero

        boolean singleZero = false;
        boolean multipleZeros = false;

        int totalProduct = 1;

        // find the total product and update zero flags
        for (int ele : arr) {
            if (ele != 0) {
                totalProduct *= ele;
            } else {
                if (singleZero) {
                    multipleZeros = true;
                } else {
                    singleZero = true;
                }
            }
        }

        // populate result array
        for (int i = 0; i < n; i++) {
            if (!singleZero) {
                result[i] = totalProduct / arr[i];
            } else {
                if (arr[i] != 0 || multipleZeros) {
                    result[i] = 0;
                } else {
                    result[i] = totalProduct;
                }
            }
        }

        return result;
    }
}
