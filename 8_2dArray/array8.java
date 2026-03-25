public class array8 {
    public static void Transpose(int matrix[][]){
        int transpose[][] = new int[matrix[0].length][matrix.length]; //[col][row]
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
         for(int i = 0;i<transpose.length;i++){
            for(int j =0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][]={{1,3,5},{6,8,7}};
        Transpose(matrix);
    }
}
