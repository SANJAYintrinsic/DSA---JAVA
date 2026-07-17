public class LeadersInArray {

    public static void main(String[] args) {

        int arr[] = {16, 17, 4, 3, 5, 2};

        int leaders[] = new int[arr.length];
        int count = 0;

        int max = arr[arr.length - 1];

        // Last element is always a leader
        leaders[count] = max;
        count++;

        // Traverse from right to left
        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] >= max) {
                max = arr[i];
                leaders[count] = arr[i];
                count++;
            }
        }

        // Print in reverse because leaders are stored from right to left
        System.out.println("Leaders are:");

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(leaders[i] + " ");
        }
    }
}
