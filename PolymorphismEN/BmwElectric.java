package PolymorphismEN;

public class BmwElectric extends Bmw {
    public void fuel() {
        System.out.println("I am the electric fuel method in the child class");
    }

    public void engine() {
        System.out.println("I am the electric engine method in the child class");
    }
}