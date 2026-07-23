public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int star=0;
        int hash=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='*'){
                star++;
            }
            else if(ch=='#'){
                hash++;
            }
        }

        int total=star-hash;
        System.out.print("No of strings needed : "+total);
}



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of balloons
        int N = sc.nextInt();

        // Array to store balloon colors
        String[] B = new String[N];

        // HashMap to store frequency
        HashMap<String, Integer> map = new HashMap<>();

        // Read balloon colors and count frequency
        for (int i = 0; i < N; i++) {
            B[i] = sc.next();

            if (map.containsKey(B[i])) {
                map.put(B[i], map.get(B[i]) + 1);
            } else {
                map.put(B[i], 1);
            }
        }

        // Find the first color with odd frequency
        boolean found = false;

        for (int i = 0; i < N; i++) {
            if (map.get(B[i]) % 2 != 0) {
                System.out.println(B[i]);
                found = true;
                break;
            }
        }

        // If no odd frequency found
        if (!found) {
            System.out.println("All are even");
        }
    }
}
