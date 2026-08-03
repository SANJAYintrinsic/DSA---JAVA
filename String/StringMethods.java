A String in Java is a sequence of characters used to store text.\

String str = "Hello";

String str = new String("Hello");  //Creates a new object in HEAP MEMORY.

// In Java, single quotes (' ') are used for a char, while double quotes (" ") are used for a String.

char ch = 'A';      // char (single character)
String str = "A";   // String

String s = "Hello";

s.length();      // 5

s.charAt(0);     // 'H'

s.substring(2);      // "llo"
s.substring(1,4);    // "ell"

s.contains("ell");      // true
s.startsWith("He");     // true
s.endsWith("lo");       // true
s.indexOf('l');         // 2
s.lastIndexOf('l');     // 3

s.replace('l','x');         // Hexxo
s.replace("ll","yy");       // Heyyo
s.replaceAll("[aeiou]","*"); // H*ll*

s.toUpperCase();    // HELLO
s.toLowerCase();    // hello

" Hello ".trim();    // "Hello"

String str = "A,B,C";

String[] arr = str.split(",");

char[] ch = s.toCharArray();

"".isEmpty();      // true

s.equals("Hello");              // true
s.equalsIgnoreCase("hello");    // true
s.compareTo("World");           // negative, zero, or positive

