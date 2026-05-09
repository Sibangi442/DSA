public class Oops2 {
        public static void main(String args[]){
        Pen p1 = new Pen(); 
        p1.setColor("Blue"); //HERE WE HAVE ALREADY USED THE set function as - setcolor()
        //p1.color="yellow";
        p1.setColor("yellow");
        //System.out.println(p1.color);
        System.out.println(p1.getcolor()); // since the color and tip has became private in the class pen therefore we cannot normally access it and we have to use the get and set function , get - for  getting the color or tip , and set - for changing the values
        p1.setTip(5);
        //System.out.println(p1.tip);
         System.out.println(p1.getTip());


    }
}
class Pen{
    //properties 
    private String color;
    private int tip;
    String getcolor(){
        return this.color; //here this refers to the current object
                           //this keyword is mostly useful when the keywords have same name
    }

    int getTip(){
        return this.tip;
    }
    
    //function
    void setColor(String newColor){
        //color = newColor;
        this.color = newColor;
    }

    void setTip(int newTip){
        //tip = newTip;
        this.tip = newTip;
    }
}

