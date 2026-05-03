import java.util.*;
public class String_Practice {
    public static void printLetters(String str){
        for(int i = 0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        // char arr[]={'s','a','c','d'};
        // String str1="abcd";
        // String str2 =new String("xyz");

        // //Strings in java are immutable
        // Scanner sc = new Scanner(System.in);
        // //String name =sc.next(); //next - takes a single word input only
        // String name = sc.nextLine();
        // System.out.println(name);

        //String is a class in java with whomm a special function is associated
        // String fullname = "Tony Stark";
        // System.out.println(fullname.length());

        
        //CONCATENATION - COMBINING 2 STRING WITH '+'
        String firstname = "sibangi";
        String lastname ="Padhi";
        String fullname = firstname + " " +lastname;
        //System.out.println(fullname);

        // to pick each character of a string - .charAt(index)
        //System.out.println(fullname.charAt(3));
        
        printLetters(fullname);
    } 
}
