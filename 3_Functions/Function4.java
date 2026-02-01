public class Function4 {
    public static void factorial(int n){
        int fact = 1;
        while(n>0){
            fact = fact *n;
            n--;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        int n = 4;
        factorial(n);
    }
}
