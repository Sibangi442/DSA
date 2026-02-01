public class Function3 {
    public static int product(int a, int b){
        int product = a*b;
    //     System.out.println("The product of a and b is "+product);
     return product;
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int mul = product(a,b);
        System.out.println(mul);
    }
}
