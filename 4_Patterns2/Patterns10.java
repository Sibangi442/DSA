public class Patterns10 {
    public static void hollowrectangle(int n){
        for(int i = 1;i<=n;i++){
            //space
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            // hollow rhombus 
            for(int k = 1;k<=n;k++){
                if(i==1 || i==n || k==1 || k==n ){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollowrectangle(5);
    }
}
