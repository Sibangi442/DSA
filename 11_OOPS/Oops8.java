public class Oops8 {
    public static void main(String args[]){
        Fish shark = new Fish(); // here we are creating object for child class , and it acess all the properties and methods of parent class
        shark.eat();  // properties and methods of parent class
        shark.breathe();  // properties and methods of parent class
        shark.swims(); // properties and methods of child class
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

//derives or child class or subclass
class Fish extends Animal{ // here we are using the extends keeyword to inherist all the properties of Parent to child class
    int fins;
    void swims(){
        System.out.println("Fish is swimming");
    }
}