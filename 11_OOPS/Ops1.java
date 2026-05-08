public class Ops1 {
    //static = access specifier , public = acess modifier
    //main function needs to be public as well as static
    public static void main(String args[]){
        //to create object 👇
        //classname objectname = new classname();
        Pen p1 = new Pen(); // with the help of new keyword we create space in the memory so as to store the properties
        //here we have created a pen object called p1 👆
        p1.setColor("Blue");
        //or
        p1.color="yellow";
        System.out.println(p1.color); // . operator is used to access a properties
        p1.setTip(5);
        System.out.println(p1.tip);

        //for class student 
        Student s1 = new Student();
        s1.name = "Shivangi";
        s1.age = 23;
        s1.calculatepercentage(78,43,89);
        System.out.println("Name is:"+s1.name+" age is:"+s1.age+"percentage is:"+s1.percentage);

        //for Bankaccount
        BankAccount myacc = new BankAccount();
        myacc.Username ="shivii";
        //myacc.password="ased"; // here we cannot acces the pasword as it is private
        myacc.setPassword("aser");
    }
}

class BankAccount{
   public  String Username ;
   private String password; // here password has become private which means we cannot access it outside the class
   public void setPassword(String pwd){
        password = pwd; // this password is accessible as we accessing it inside the class only 
   }
}



class Pen{
    //properties 
    String color;
    int tip;
    
    
    //function
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name ;
    int age;
    int percentage; 

    void calculatepercentage(int phy, int chem, int maths){
        percentage= (phy+chem+maths)/3;
    }
    //System.out.println("Name is "+name+" age is "+age+"percentage is "+percentage);
}


