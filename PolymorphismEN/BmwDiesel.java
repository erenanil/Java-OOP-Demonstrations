package PolymorphismEN;

public class BmwDiesel extends Bmw {
    public void engine() {
        System.out.println("I am the diesel engine method in the child class");
    }

    public void fuel() {
        System.out.println("I am the diesel fuel method in the child class");
    }

    public void fuel(String color) {
        System.out.println("I am the diesel fuel method in the child class, and I take a string");
    }
}
