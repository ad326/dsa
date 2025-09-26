public class OOP1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();  //Create object of Pen class

        p1.setColor("Blue");    //Set color by setColor method. Not directly modify
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        Student s1 = new Student();
        s1.name = "tony";
        s1.roll = 6;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); //Shallow copy
        s2.password = "xyz";
        s1.marks[2] = 100;
        for(int i = 0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }
        
    }
}

//Create Pen class (Example of Encapsulation)
class Pen {                    
        private String color;
        private int tip;

        //Getter method
        String getColor() {
            return this.color;
        }

        int getTip() {
            return this.tip;
        }

        //Setter method
        void setColor(String newColor) {
            this.color = newColor;
        }

        void setTip(int tip) {
            this.tip = tip;
        }
}

//Create Student class (Example of Constructor)
class Student {
    String name;
    int roll;
    String password;
    int marks[];


    //Copy constructor (Shallow copy)
    // Student (Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

//Lazy copy is a combination of both of these approaches

    //Copy constructor (Deep copy)
    Student (Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i<3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println("Constructor is called....");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
