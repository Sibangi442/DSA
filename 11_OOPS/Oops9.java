public class Oops9 {
    public static void main(String args[]){
       Dog dobby = new Dog();
       dobby.eat();
       dobby.legs = 4;
       System.out.println(dobby.legs); 
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
    int legs;
}

class Dog extends Mammal{
    String breed;
}