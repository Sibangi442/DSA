public class Bit7 {
    public static int clearithbits(int n, int i){
        int bitmask = (~0)<<i;
        return n&bitmask;
    }
    public static void main(String args[]){
        System.out.println(clearithbits(15,2));
    }
}
