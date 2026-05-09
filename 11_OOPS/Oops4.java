public class Oops4 {
    public static void main(String args[]){
        Pen p1 = new Pen(); 
        p1.setColor("yellow");
        System.out.println(p1.getColor()); 
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

class Pen{
    private String color;
    private int tip ;

    //getter
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    //setter
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}
