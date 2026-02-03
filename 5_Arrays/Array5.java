public class Array5 {
    public static int binarysearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            //comapre mid
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]>key){
                end = mid -1; //left
            } else{
                start = mid+1; // right                                                                                                                                                                               
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14,16};
        int key =0;
        int result = binarysearch(numbers, key);
        if(result == -1){
            System.out.println("Key not found");
        } else{
            System.out.println("Key found at index "+result);
        }
    }
}
