public class String4 {
    public static void main(String args[]){
        String s1= "Tony";
        String s2 ="Tony"; //String without a new keyword pointout to the old string
        String s3 = new String("Tony"); // A NEW string is formed named Tonny
        if(s1==s2){ // == check if the values are same at object level
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }
        if(s1==s3){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){ //euals() function checks the values
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }
    }
}
