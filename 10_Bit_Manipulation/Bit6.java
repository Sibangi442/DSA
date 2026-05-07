public class Bit6 {
     public static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }
    public static int clearithbit(int n, int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    public static int updateithBit(int n, int i , int newBit){
        if(newBit==0){
            return clearithbit(n,i);
        }else{
            return setIthBit(n,i);
        }

        // ANOTHER METHOD 👇
        // n = clearithbit(n,i);
        // int Bitmask = newBitmask<<i;
        
    }
    public static void main(String[] args) {
        
    }
}
