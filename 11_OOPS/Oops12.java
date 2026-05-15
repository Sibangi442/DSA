public class Oops12 {
    public static void main(String args[]){
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)3.4,(float)2.1));
        System.out.println(calc.sum(1,2,3));
    }
}

class Calculator{
    int sum(int a , int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}