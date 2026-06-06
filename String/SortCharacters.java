import java.util.Arrays;

public class SortStringCharacters {
    public static void main(String[] args) {
        String str = "programming";

        // Convert string to character array
        char[] chars = str.toCharArray();

        // Sort the array
        Arrays.sort(chars);

        // Convert back to string
        String sortedString = new String(chars);

        System.out.println("Original String: " + str);
        System.out.println("Sorted String: " + sortedString);
    }
}
