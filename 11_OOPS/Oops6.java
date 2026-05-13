public class Oops6 {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name ="sibangi";
        s1.roll=456;
        s1.password ="acd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2]=85;

        Student s2 = new Student(s1); // here we are copying all the properties of s1 to s2
        s2.password ="xyz";
        s1.marks[2]=100; //here after copying the values we are changing the value

        for(int i =0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class  Student{
    String name ;
    int roll;
    String password;
    int marks[];

    Student() {
        marks = new int[3];
    }

    //COPY constructor
    Student(Student s1){ // here the object is passed as parameter to the constructor
        marks = new int[3];
        this.name = s1.name;
        this.roll =s1.roll;
        this.marks = s1.marks; // here not all array elements are copied rather it's reference is copied 
    }

   
}
