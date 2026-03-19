import java.util.*;
public class array2 {

    //fiinding the largest and smallest element
    public static void largest_And_Smallest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]>largest){
                    largest = matrix[i][j];
                }
                if(matrix[i][j]<smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest element is: "+smallest);
        System.out.println("Largest element is: "+largest);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][]= new int[3][4];
    //input
        for(int i = 0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        //Output
        for(int i = 0;i<matrix.length;i++){
            for(int j= 0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        largest_And_Smallest(matrix);
    }
}
