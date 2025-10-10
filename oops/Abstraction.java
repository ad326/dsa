public class Abstraction {
    public static void main(String[] args) {

        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color);

        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
        c1.changeColor();
        System.out.println(c1.color);

        Mustang m1 = new Mustang();
        
    }

}

abstract class Animale {
    String color;

    Animale(){
        color = "brown";
        System.out.println("Animal Constructor called");
    }
    void eat(){
        System.out.println("Animal eats");
    }

        abstract void walk();
}

class Horse extends Animale {
    Horse() {
        System.out.println("Horse Constructor called");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor called.");
    }
}
class Chicken extends Animale {
    void changeColor() {
        color = "white";
    }
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}