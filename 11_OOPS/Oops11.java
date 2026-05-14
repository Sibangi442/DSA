public class Oops11 {
    public static void main(String[] args){
        peacock birdy = new peacock();
        birdy.dance();
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
class Dog extends Mammal{
    void breed(){
        System.out.println("Breed");
    }
}
class Cat extends Mammal{
    void Meow(){
        System.out.println("Meows");
    }
}
class Human extends Mammal{
    void work(){
        System.out.println("Works");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}
class Tuna extends Fish{
    void catches(){
        System.out.println("Catches");
    }
}

class Shark extends Fish{
    void hunt(){
        System.out.println("Hunts");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}

class peacock extends Bird{
    void dance(){
        System.out.println("Dances");
    }
}