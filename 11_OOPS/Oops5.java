public class Oops5 {
    public static void main(String args[]){
        Student s1 = new Student();

        Student s2 = new Student("sibangi");
        System.out.println(s2.name); // student() object is made using the constructor

        Student s3 = new Student(150);
        System.out.println(s3.roll);

        Student s4 = new Student("Shivangi" , 149);
        System.out.println(s4.name+"  "+ s4.roll);
    }
}

class   Student{
    String name ;
    int roll;
    // without parameter
    Student(){
        System.out.println("Constructor is called. . .");
    }
    
    // with parameter - but only 1 variable at a time
    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this. roll = roll;
    }

    Student(String name , int roll){
        this. name =name;
        this.roll = roll;
    }
}
