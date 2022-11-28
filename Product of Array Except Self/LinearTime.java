class LinearTime {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

        Arrays.fill(left, 1);
        Arrays.fill(right, 1);

        // populate left product array
        for (int i = 1; i < n; i++) {
            left[i] = left[i-1] * arr[i-1];
        }

        // populate right product array
        for (int i = n-2 ; i >= 0; i--) {
            right[i] = right[i+1] * arr[i+1];
        }

        // populate final array
        for (int i =0; i< n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}
