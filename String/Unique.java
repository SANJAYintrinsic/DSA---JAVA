import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s1 = "apple banana mango orange";
        String s2 = "banana grape mango kiwi";

        Set<String> set1 = new HashSet<>(Arrays.asList(s1.split(" ")));
        Set<String> set2 = new HashSet<>(Arrays.asList(s2.split(" ")));

        StringBuilder sb = new StringBuilder();

        for (String word : set1) {
            if (!set2.contains(word)) {
                sb.append(word).append(" ");
            }
        }

        for (String word : set2) {
            if (!set1.contains(word)) {
                sb.append(word).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
