public class Array6 {
    public static void Reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;
            while(first<=last){
            //swap
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;

        }
    }
    public static void main(String args[]){
        int number[]={2,4,6,8,10};
        Reverse(number);
        for(int i = 0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
}
