package PolymorphismEN;

public class CarSeller {
    public static void main(String[] args) {
        // Method overloading with polymorphism
        /*
        CarSeller obj1 = new CarSeller();
        obj1.engine();
        obj1.fuel();
        obj1.fuel(2024);
        obj1.fuel(1.68);
        obj1.fuel(2024, 1.678);
        obj1.fuel(1.97, 2024);
        */

        // Polymorphism with overriding
        Bmw obj2 = new Bmw();
        obj2.fuel(); // The parent class's fuel method is called.

        Bmw obj3 = new BmwGasoline();
        obj3.fuel(); // The gasoline method is called.

        Bmw obj4 = new BmwElectric();
        obj4.fuel(); // The electric method is called.

        Bmw obj5 = new BmwDiesel();
        obj5.fuel(); // The diesel method is called.
    }

    public void engine() {
        System.out.println("I am the engine method in the independent class");
    }

    public void fuel() {
        System.out.println("I am the fuel method in the independent class");
    }

    public void fuel(double maxConsumption) {
        System.out.println("I am the fuel method in the independent class, and I take consumption");
    }

    public void fuel(int year) {
        System.out.println("I am the fuel method in the independent class, and I take a year");
    }

    public void fuel(int year, double maxConsumption) {
        System.out.println("I am the fuel method in the independent class, and I take year + consumption");
    }

    public void fuel(double maxConsumption, int year) {
        System.out.println("I am the fuel method in the independent class, and I take consumption + year");
    }
}