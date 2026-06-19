import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s1 = "apple banana mango orange";
        String s2 = "banana grape mango kiwi";

        Set<String> set1 = new LinkedHashSet<>(Arrays.asList(s1.split(" ")));
        Set<String> set2 = new HashSet<>(Arrays.asList(s2.split(" ")));

        set1.removeAll(set2);

        for (String word : set1) {
            System.out.print(word + " ");
        }
    }
}
