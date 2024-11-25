package PolymorphismEN;

public class BmwGasoline extends Bmw {
    public void fuel(double maxConsumption) {
        System.out.println("I am the gasoline fuel method in the child class, and I take a double");
    }

    public void fuel() {
        System.out.println("I am the gasoline fuel method in the child class");
    }

    public void engine() {
        System.out.println("I am the gasoline engine method in the child class");
    }
}
