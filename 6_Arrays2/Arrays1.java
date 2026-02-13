public class Arrays1{
    public static void maxSubarraySum(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j =i; j<arr.length;j++){
                currsum = 0;
                for(int k = i;k<=j;k++){
                    currsum = currsum+ arr[k];
                }
                System.out.println(currsum); // all sum of subarray will get printed
                if(maxsum < currsum){
                    maxsum= currsum;
                }
            }
        }
        System.out.println("Max sum is "+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxSubarraySum(arr);
    }
}