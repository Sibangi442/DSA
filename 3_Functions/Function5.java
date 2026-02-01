public class Function5 {
    public static int factorial(int n){
        int fact = 1;
        while(n>0){
            fact = fact *n;
            n--;
        }
       return fact;
    }
     public static void binomial(int n, int r){
            int nfact = factorial(n);
            int rfact = factorial(r); 
            int n_rfact = factorial(n-r);
            int binomialcoeff =nfact/( rfact *(n_rfact));
            System.out.println("The binomial coefficient is "+binomialcoeff);
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        binomial(n, r);
    }
}
