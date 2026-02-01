import java.util.*;
public class Function11 {
    public static void avgerage(int a, int b, int c){
        int sum = a+b+c;
        int avg = sum/3;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        avgerage(n, b, c);
    }
}
