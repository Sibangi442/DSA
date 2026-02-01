public class Patterns2 {
    public static void Inverted_halfpyramid(int n){
        // for(int i = 1;i<=n;i++){
        //     for(int j =1;j<=n;j++){
        //         if(i+j>=n+1){
        //             System.out.print("*");
        //         } else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        for(int i = 1;i<=n;i++){
            //space
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Inverted_halfpyramid(4);
    }
}
