import java.util.Arrays;

class Syndicate {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int x = 2;

        Arrays.sort(arr);

        int count = 0;

        for (int i = 0; i <= arr.length - k; i++) {

            int min = arr[i];
            int max = arr[i + k - 1];

            if (max - min <= x) {
                count++;
            }
        }

        System.out.println("Number of valid groups = " + count);
    }
}


public class TacticalSyndicate {

    public static int maximumSyndicates(int[] skills, int k, int x) {

        Arrays.sort(skills);

        int count = 0;
        int i = 0;

        while (i <= skills.length - k) {

            int min = skills[i];
            int max = skills[i + k - 1];

            if (max - min <= x) {
                count++;
                i = i + k;      // use these soldiers
            } else {
                i++;            // try next possible group
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] skills = {6, 3, 8, 1, 2, 7};

        int k = 3;
        int x = 2;

        int ans = maximumSyndicates(skills, k, x);

        System.out.println("Maximum Syndicates = " + ans);
    }
}
