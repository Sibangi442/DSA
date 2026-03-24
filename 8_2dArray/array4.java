public class array4 {
    public static int diagonalSum(int matrix[][]){
        int sum = 0; // TC = O(N2)
        // for(int i = 0;i<matrix.length;i++){ //for row
        //     for(int j = 0;j<matrix[0].length;j++){ //for column
        //         if(i == j){ // for primary diagonal
        //             sum = sum+matrix[i][j];
        //         }
        //         if(i+j == matrix.length-1){ // for secondary diagonal
        //             sum = sum+matrix[i][j];
        //         }
        //     } 
        // }



        //MODIFIED APPROACH - TC(O(N))
        for(int i = 0;i<matrix.length;i++){
            //PD 
            sum +=matrix[i][i];
            //SD
            if(i!=matrix.length-1-i)
               sum +=matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static void main(String args[]){ 
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8,},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println(diagonalSum(matrix));
    }
}
