import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1,4,7,8,10};
        int arr2[] = {2,3,9};

        System.out.println("Before merge - ");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        merge(arr1, arr2, arr1.length, arr2.length);

        System.out.println("After merge - ");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private static void merge(int[] arr1, int[] arr2, int m, int n) {
        // Gap Method
        int gap =(int) Math.ceil((double)(m + n) / 2.0);

        // loop until gap > 0
        while (gap > 0) {
            int left = 0;
            int right = gap;
            while (right < (n+m)) {
                 // if both pointers in arr1
                if (right < m && arr1[right] < arr1[left]) {
                    swap(arr1, left, right);
                }
                // if left is in arr1 and right is in arr2
                else if (right >= m && left < m && arr2[right-m] < arr1[left]) {
                    swap(arr1, arr2, left, right-m);
                }
                // if both are in arr2
                else if (right >= m && left >= m && arr2[right-m] < arr2[left-m]) {
                    swap(arr2, arr2, right-m, left-m);
                }

                left++;
                right++;
            }
            if (gap == 1) {
                gap = 0;
            } else {
                gap =(int) Math.ceil((double) gap / 2.0);
            }
        }
    }

    private static void swap(int[] arr,int left, int right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    private static void swap(int[] arr1, int[] arr2, int left, int right)
    {
        int temp = arr1[left];
        arr1[left] = arr2[right];
        arr2[right] = temp;
    }
}
