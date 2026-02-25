public class Arrays_Parctice {

    // BRUTE FORCE APPROACH
    public static void maxSubarraySum(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                currsum = 0;
                for(int k = i ;k<=j;k++){
                    currsum = currsum +arr[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("The maximum sum is "+ maxsum);
    }
//BETTER THEM BRUTE FORCE LESS THAN OPTIMISED ONE -- PREFIX SUM 

    public static void prefixSum(int arr[]){
        int maxsum  = Integer.MIN_VALUE;
        int currsum = 0;
        int prefix[]=new int[arr.length];
        prefix[0]= arr[0];
        for(int i = 1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
            
        }
        for(int i =  0;i<arr.length;i++){
            for(int j =i;j<arr.length;j++){
                currsum = i ==0 ? prefix[j]: prefix[j]-prefix[i-1];
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("The maximum sum is "+ maxsum);
    }

    // MOST OPTIMISED ONE KADANES ALGORITHM
    public static void Kadanes(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0;i<arr.length;i++){
            currsum = currsum + arr[i];
            if(currsum<0){
                currsum = 0;
            }
            if(maxsum<currsum){
                maxsum = currsum;
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        // int arr[]={1,-2,6,-1,3};
        // // maxSubarraySum(arr);
        // prefixSum(arr);

        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        Kadanes(arr);

    }
}
