public class String9 {
    public static String compress(String str){
        String newstr ="";
        for(int i= 0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){ //it will work till and unless string is less than length and current value and nest value are equal
                count++;
                i++;
            }
            newstr+= str.charAt(i); //the string value gets added to the newstring 
            if(count>1){ //when count value is greater than 1 then only count gets added to the newstring   
                newstr +=count.toString(); //add the count to the string like = a3
            }
        }
        return newstr;
    }
    public static void main(String args[]){
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}
