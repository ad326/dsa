public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();

        shark.eat(); // Call parent's class method
    }
}

//Base class / Parent class
class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

//Derived Class/ Child class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}
