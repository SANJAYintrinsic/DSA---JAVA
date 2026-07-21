String binaryString = "1101";
int number = Integer.parseInt(binaryString, 2);

System.out.println(number); // Output: 13


int number = 13;
String binaryString = Integer.toBinaryString(number);

System.out.println(binaryString); // Output: 1101



public class SwapNibbles {
    public static void main(String[] args) {

        int num = 178;   // 10110010

        int result = ((num & 0x0F) << 4) | ((num & 0xF0) >> 4);

        System.out.println("Original : " +
                String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0'));

        System.out.println("Swapped  : " +
                String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0'));

        System.out.println("Decimal : " + result);
    }
}


int num=178;
        String binary = Integer.toBinaryString(num);
        String result = "";

        for (int i = 0; i < binary.length(); i++) {

            if (binary.charAt(i) == '0') {
                result = result + "1";
            } else {
                result = result + "0";
            }

        }

        System.out.println("Original : " + binary);
        System.out.println("Flipped  : " + result);


