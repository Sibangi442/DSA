public class Array2 {
    public static void update(int marks[], int nonchangeable){
        nonchangeable = 10;
        for(int i = 0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        int nonchangeable = 5;
        update(marks,nonchangeable);
        System.out.println(nonchangeable);
        
        //to print the marks
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
    }
}
