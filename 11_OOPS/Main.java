// import java .util.*;
// public class Main{
//     public static boolean isEven(int n){
//         if(n%2==0){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(isEven(n));
//     }
// }

import java .util.*;
public class Main{
    public static void evenOdd(int n){
        if(n%2==0){
            System.out.println("even");;
        } else{
            System.out.println("Odd");
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenOdd(n);
    }
}
