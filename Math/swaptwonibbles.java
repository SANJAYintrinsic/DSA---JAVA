import java.util.Scanner;

class swap {
    
    static int swaps(int x) {
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
    }

    // Helper method to format binary with leading zeros (8 bits)
    static String toBinary(int x) {
        return String.format("%8s", Integer.toBinaryString(x)).replace(' ', '0');
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (0-255): ");
        int x = sc.nextInt();

        System.out.println("Original Number: " + x);
        System.out.println("Original in Binary: " + toBinary(x));

        int swapped = swaps(x);

        System.out.println("Swapped Number: " + swapped);
        System.out.println("Swapped in Binary: " + toBinary(swapped));

        sc.close();
    }
}
