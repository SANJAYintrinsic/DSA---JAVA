public class CountInversion {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int n = arr.length;
        System.out.println("Number of inversions: " + countInversions(arr, 0, n - 1));
    }

    public static int countInversions(int[] arr, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            count += countInversions(arr, left, mid);
            count += countInversions(arr, mid + 1, right);
            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }

    private static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] leftArr = new int[mid - left + 1];
        int[] rightArr = new int[right - mid];

        for (int i = 0; i < leftArr.length; i++)
            leftArr[i] = arr[left + i];
        for (int i = 0; i < rightArr.length; i++)
            rightArr[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left, swaps = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                swaps += (mid + 1) - (left + i); // all remaining left elements form inversions
            }
        }

        while (i < leftArr.length)
            arr[k++] = leftArr[i++];

        while (j < rightArr.length)
            arr[k++] = rightArr[j++];

        return swaps;
    }
}
