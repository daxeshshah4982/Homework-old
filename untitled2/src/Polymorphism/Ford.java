//Method overloading
//this need just 1 class to overloading
package Polymorphism;

public class Ford {
    int speed;
    String name;
    boolean type;

    public Ford() {

    }

    public Ford(int speed) {
        this.speed = speed;
    }

    public Ford(String name, int speed) {
        this.name = name;
    }

    public Ford(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public Ford(String name, boolean type) {
        this.name = name;
        this.type = type;
    }

    public Ford(int speed, String name, boolean type) {
        this.speed = speed;
        this.name = name;
        this.type = type;
    }
}

