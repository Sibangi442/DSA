public class Function10 {
    public static void decimalToBinary(int n){
        int mynum = n;
        int pow = 0;
        int bin =0;
        while(n>0){
            int rem = n%2;
            bin = bin+rem*(int)Math.pow(10,pow);
            pow++;
            n = n/2;
        }
        System.out.println("The "+ mynum + " in Binary is " + bin);
    }
    public static void main(String args[]){
        decimalToBinary(15);
    }
}
