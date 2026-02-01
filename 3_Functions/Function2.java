public class Function2 {
    public static void swap(int a, int b){
        int temp =a;
        a= b;
        b = temp;
        System.out.println("The value of a = "+a);
        System.out.println("The valjue of b = "+b);
    }
    public static void main(String[] args) {
        //SWAP 
        int a = 5;
        int b = 10;
        swap(a, b);
    }
}
