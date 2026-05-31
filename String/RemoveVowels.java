public class Removevowel {
    public static String vowel(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' &&
               ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U'
            ){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="All is well";
        System.out.print(vowel(str)); 
    }
}
