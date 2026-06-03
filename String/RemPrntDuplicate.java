import java.util.*;

class Rpduplicate {
    public static void main(String[] args) {
        String str = "All is Wells";

        HashSet<Character> seen = new HashSet<>();
        LinkedHashSet<Character> duplicate = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {

            // Keep spaces as they are
            if (ch == ' ') {
                sb.append(ch);
                continue;
            }

            // First occurrence
            if (seen.add(ch)) {
                sb.append(ch);
            } else {
                duplicate.add(ch);
            }
        }

        System.out.println("After removing duplicates: " + sb);

        System.out.print("Duplicate characters: ");
        for (char ch : duplicate) {
            System.out.print(ch + " ");
        }
    }
}
