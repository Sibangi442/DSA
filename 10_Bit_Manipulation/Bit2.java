public class Bit2 {
    public static void oddeven(int n){
        int bitmask = 1;
        if((n & bitmask)==0){
            //even number
            System.out.println("even");
        }else{ //when ==1
            System.out.println("odd");
        }
    }
    public static void main(String args[]){
        oddeven(5);
        oddeven(6);

    }
}
