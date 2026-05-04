public class String5 {
    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i = si;i<ei;i++){
            substr+= str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        //SSubstring
       String str ="Hello World";
       //with inbuilt substring function 👇
       System.out.println(str.substring(0,5));

       
       //System.out.println(substring(str,0,4));
    }
}
