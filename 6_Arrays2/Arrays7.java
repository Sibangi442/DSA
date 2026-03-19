public class Arrays7 {
    public static int roatatedarray(int arr[], int target){
        int n= arr.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start +(end - start)/2;
            if(arr[mid]== target){
                return mid;
            }
            if(arr[start]<=arr[mid]){ // to check if left part is sorted or not
                if(arr[start]<=target && target<=arr[mid]){ // condition for check if left is sorted or not
                    end = mid-1; //if left part is sorted then search in left part
                } else{
                    start = mid+1; // if left is not sorted then update the start to search in right part
                }
            } else{ // since left is not sorted , then right must be sorted 
                if(arr[mid]<=target && target<=arr[end]){ // condition to check if right is sorted or not
                    start = mid+1; // if right is sorted the update start value
                } else{
                    end = mid-1; // if right not sorted then update the end value to search in left part
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={6,7,0,1,2,3,4,5};
        int target = 0;
        System.out.println(roatatedarray(arr, target));
    }
}
