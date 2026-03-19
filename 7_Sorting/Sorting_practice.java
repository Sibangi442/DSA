public class Sorting_practice {

    // ASCENDING ORDER BUBBLE SORT 

    // public static void bubbleSort(int arr[]) {
    //     for (int i = 0; i <= arr.length - 2; i++) {
    //         for (int j = i + 1; j <= arr.length - 1; j++) {
    //             if (arr[i] > arr[j]) {
    //                 int temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    // }
//DESCENDING ORDER BUBBLE SORT
    public static void bubbleSort(int arr[]){
        for(int i= 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    // ASCENDING ORDER SELECTION SORT
    // public static void selectionSort(int arr[]){
    //     for(int i = 0;i<arr.length-1;i++){
    //         int minpos = i;
    //         for(int j= i+1;j<arr.length;j++){
    //             if(arr[minpos]>arr[j]){
    //                 minpos =j;
    //             }
    //         }
    //         //swap
    //         int temp = arr[i];
    //         arr[i]=arr[minpos];
    //         arr[minpos]=temp;
    //     }
    // }
 

    // DESCENDING ORDER FOR SELECTION SORT
    public static void selectionSort(int arr[]){
        for(int i = 0;i<arr.length;i++){
            int minpos = i;
            for(int j= i+1;j<arr.length;j++){
                if(arr[minpos]<arr[j]){
                    minpos = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }
    }


    // INSERTION SORT 

    // public static void insertionSort(int arr[]){
    //     for(int i =1;i<arr.length;i++){
    //         int curr = arr[i];
    //         int prev = i-1;
    //         while(prev>=0 && arr[prev]>curr){
    //             arr[prev+1]= arr[prev];
    //             prev --;
    //         }
    //         arr[prev+1]=curr;
    //     }
    // }

    //INSERTION SORT - DESCENDING ORDER
    public static void insertionSort(int arr[]){
        for(int i =1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]= arr[prev];
                prev --;
            }
            arr[prev+1]=curr;
        }
    }


    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {2,6,9,1,0, 67, 23, 45, 99, 10, 3};
        // bubbleSort(arr);
        //selectionSort(arr);
        insertionSort(arr);
        printArr(arr);
    }
}