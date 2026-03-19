public class array3 {

    public static void printSprial(int matrix[][]){
        int startrow = 0;
        int endrow = matrix.length-1;
        int startcol = 0;
        int endcol = matrix[0].length-1;

        while(startrow<=endrow && startcol<=endcol){
            //top boundary -- row is constant but column will move from first to last
            for(int j = startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            // Right boundary - column is constant but row will move from first to last
            for(int i = startrow+1; i<=endrow;i++){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][endcol]+" ");
            }
            //Bottom row - row is constant but column will change
            for(int k = endcol -1;k>=startcol;k--){
                if(startrow==endrow){ // as here row will be same 
                    break;
                }
                System.out.print(matrix[endrow][k]+" ");
            } 
            //Left boundary  -column is constant and row will change
            for(int l = endrow-1;l>=startrow+1;l--){
                if(startcol==endcol){ // as here col will be same
                    break;
                }
                System.out.print(matrix[l][startcol]+" ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printSprial(matrix);
    }
}
