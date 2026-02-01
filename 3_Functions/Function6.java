public class Function6 {

    // using different parameters

    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // public static int sum(int a, int b, int c){
    //     return a+b+c;
    // }

    //using different Datatypes

    public static int sum(int a, int  b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Ths sum is "+sum(2,3));
        // System.out.println("The sum is "+sum(2,3,1));
         System.out.println("Ths sum is "+sum(2.4f,3.6f));
    }
}
