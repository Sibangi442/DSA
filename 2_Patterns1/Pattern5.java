public class Pattern5 {
    public static void pattern(int n){
        int num = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(5);
    }
}
