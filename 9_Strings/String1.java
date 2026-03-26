import java.util.*;
public class String1 {

    //FUNCTION TO PRINT EVERY LETTER OR ALPHABET 👇
    public static void printLetters(String str){
        for(int i = 0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // char arr[]={'a','b','c'};
        // String str ="abcd";
        // String str2 = new String("xyz");

        //Strings are Immutable (Not Changable)

        //FOR INPUT 👇
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();  // .next() used to input only one word

        // String name = sc.nextLine(); //.nextLine() used to take sentences as an input also
        // System.out.println(name);

        // Length function 👇

        // String fullname = "Tony Stark";
        // System.out.println(fullname.length());


        //CONCATENATION - TO ADD 2 OR MORE STRING 👇

        // String firstname = "sibangi";
        // String lastname = "Padhi";
        // String fullname = firstname +" "+lastname;
        // System.out.println(fullname +" is this");

        
        // USING .charAt() Function 👇

        String firstname = "sibangi";
        String lastname = "Padhi";
        String fullname = firstname +" "+lastname;
        //System.out.println(fullname.charAt(1));
        printLetters(fullname);

        
    }
}
