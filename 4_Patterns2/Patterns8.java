public class Patterns8 {
    public static void butterfly(int n){
        //1st Half
        for(int i = 1;i<=n;i++){
            //star
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //space 
             for(int k = 1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            //star
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd Half
        for(int i =n;i>0;i--){
            //star
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int k =1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            //star
            for(int l = 1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        butterfly(4);
    }
}
