import java.util.*;
public class Array_Practice {

    //Linear search
    public static int linear(int arr[],int key){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    //Largest Value
    public static int largest(int arr[]){
        // int largest = arr.MIN_VALUE;
        int largest = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    //SMALLEST VALUE
    public static int smallest(int arr[]){
        int small = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
             if(small>arr[i]){
            small = arr[i];
        }
        }
        return small;
    }

    //BINARY SEARCH
    public static int Binary(int arr[], int key){
        int start = 0;
        int end = arr.length- 1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                end = mid -1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }

    //First Occurence of the Binary Search 
    public static int firstOccurrence(int arr[], int key){
        int start = 0, end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                ans = mid;
                end = mid-1;
            }
             else if(arr[mid]> key){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return ans;
    }


    //REVERSE OF AN ARRAY
    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        // while(start<=end){
        //     int temp = arr[end];
        //     arr[end]= arr[start];
        //     arr[start]= temp;

        //     start++;
        //     end--;
        // }

        //USING FOR LOOP
        int n = arr.length;
        for(int i = 0;i<n/2;i++){
            int temp = arr[i]; // temp = start or left
            arr[i] = arr[n-1-i]; // start = end
            arr[n-1-i]=temp; //end = temp
        }
    }


    // Print Pairs in an Array
    public static void printPairs(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }

    // print SUBARAYS - continous array 
    public static void subarrays(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length ;j++){
                for(int k = i;k<=j;k++){
                    System.out.print( arr[k]+" ");
                }
                System.out.println("");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    //     // Operations in an array -Create an Array

    //     // int arr[]= {1,2,3,4,5,6};

    //     int arr[]= new int[10];
    //     for(int i = 0;i<arr.length;i++){
    //         // System.out.println(arr[i]);
    //         arr[i]= sc.nextInt();
    //     }
    //     System.out.println("The array is ");
    //     for(int i = 0;i<arr.length;i++){
    //         System.out.print(arr[i]);
        
    // }

     int arr[]=new int[5];
     for(int i = 0;i<arr.length;i++){
        arr[i]= sc.nextInt();
     }
     int key = sc.nextInt();
     System.out.println("The key is at index "+linear(arr,key));
      System.out.println("The largest value is "+ largest(arr));
       System.out.println("The smalllest value is "+smallest(arr));
    System.out.println("The value is at index "+Binary(arr, key));
    System.out.println("The value is at index "+firstOccurrence(arr, key));
    reverse(arr);
    System.out.println("The Reverse is ");
    for(int i = 0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    printPairs(arr);

    subarrays(arr);
}
}
