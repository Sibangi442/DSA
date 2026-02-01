import java.util.*;
public class Function13 {
    public static boolean palindrome(int n){
        int number = n;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = (rev*10)+rem;
            n = n/10;
        }
        if(number == rev){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(palindrome(n)){
            System.out.println("palindrome");
        } else{
            System.out.println("Not palindrome");
        }
    }
}
