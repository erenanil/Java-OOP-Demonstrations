/*
    Override (Method Overriding) Explanation:

    Method Overriding is when a subclass redefines a method that is already defined in its superclass according to its own needs.
    This allows the subclass to change the method it inherited from the superclass with its own custom implementation.
    In Java, method overriding is used with **runtime polymorphism**.

    It works with inheritance (Inheritance), allowing a subclass to modify a method from its superclass.

    --------------------------------------------
    Method Overriding Rules:
    --------------------------------------------

    - The method in the subclass must have the same name and parameter list as the method in the superclass.
    - The method in the subclass must have the same return type as the method in the superclass.
    - If the method in the superclass is `final`, `static`, or `private`, it cannot be overridden by the subclass.
    - The overridden method must have the same or more accessible access modifiers as the method in the superclass (for example, you can override a `protected` method as `public`, but you cannot override a `private` method).

    --------------------------------------------
    Benefits of Method Overriding:
    --------------------------------------------
    - Allows the subclass to customize the method inherited from the superclass.
    - Increases the flexibility of the program; the same method can behave differently in different classes.
    - Enables the creation of a more dynamic and flexible structure with polymorphism.

    --------------------------------------------
    Example of Method Overriding:
    --------------------------------------------
    In Java, method overriding is typically done as follows:

    1. The superclass defines a method.
    2. The subclass defines a method with the same name and parameter list.
    3. The subclass method overrides the superclass method.

    Example:

class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal is making a sound.
        
        Cat cat = new Cat();
        cat.makeSound(); // Output: Meow!
    }
}
*/
