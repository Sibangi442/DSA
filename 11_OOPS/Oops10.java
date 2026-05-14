public class Oops10 {
    public static void main(String[] args){
        Bird birdy = new Bird();
        birdy.fly();
        birdy.eat();
        birdy.breathe();
        
    }
}
class Animal{ 
    String color;
    void eat(){
        System.out.println("Animal is eating");
    }
    void breathe(){
        System.out.println("Animal is breathing");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
