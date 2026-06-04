import java.util.*;

class Lexi{
    public static void main(String[] args) {
        String str="All is Well";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch>='a' && ch<='y'){
                sb.append((char)(ch+1));
            }
            else if(ch=='z'){
                sb.append('a');
            }
            else if(ch>='A' && ch<='Y'){
                sb.append((char)(ch+1));
            }
            else if(ch=='Z'){
                sb.append('A');
            }
            else{
                sb.append(ch);
            }
        }

        System.out.print(sb);
    }
}
