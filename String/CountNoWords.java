import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "Hello world welcome to Java";

        int count = str.trim().split("\\s+").length;

        System.out.println("Number of words: " + count);
    }
}
