public class Oops3 {
    public static void main(String args[]){
        Pen p1 = new Pen();
        // // in direct accessing we are not using the set methods👇
        p1.color ="yellow";
        System.out.println(p1.color);
        p1.tip =5;
        System.out.println(p1.tip);

        
        // p1.setColor("yellow");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);

    }
}


class Pen{
    String color;
    int tip;

    void setColor(String newcolor){
        color = newcolor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}