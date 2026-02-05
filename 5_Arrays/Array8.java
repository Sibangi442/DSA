public class Array8 {
    public static void subarrays(int numbers[]){
        int ts = 0;
        int sum = 0;
        for(int i = 0;i<numbers.length;i++){
            int start = i;
            for(int j = i;j<numbers.length;j++){
                int end = j;
                for(int k = start;k<=end;k++){ //only for printing
                    System.out.print(numbers[k]+" ");
                    sum = sum +numbers[k];
                }
                ts++;
            System.out.println();
            }
        System.out.println("The sum is "+sum);
        System.out.println();
        sum = 0;
        }
        System.out.println("total subarray "+ts);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subarrays(numbers);
    }
}
