package InheritanceEN;

public class ReadMe {

    /*
    ***NOTE***: It will be beneficial for you to work on this from here and then move on to examples.

     *                          INHERITANCE Topic Explanation
     

     * It is the concept that allows one class to automatically inherit the properties (variables, methods, etc.) of another class.
     

     * The `extends` keyword is used.
     

     * The child chooses its parent.
     

     * Java allows single inheritance. (As an analogy, you can think of it as a child having a family.)
      That is, B ---> A


     * However, a class can be inherited by more than one class.
      That is, B ----> A <---- C
      Here, classes C and B are child classes and have chosen class A as their parent.
      This is called **Hierarchical inheritance**, where multiple child classes select the same parent class.


     * If we want to inherit properties from multiple classes, we can use Multi-Level inheritance to use the properties of all of them.
     We should create a structure like this:
      A <-------- B <-------- C
     C first selects B as its parent, and then B selects A as its parent, so C has the properties of both B and A.


     * Private class members are not inherited.

     * Members defined with the default access modifier can only be accessed by classes within the same package.

     * Public members are accessible by everyone.

     * Protected members are accessible only by subclasses (child classes) and classes within the same package.


     *                      Benefits of Inheritance
     * With inheritance, we can write less code, thus making software maintenance and updates easier. Especially in large projects, changes in a parent class are automatically reflected in all child classes, significantly reducing maintenance time.
     
      
    
     *                      How to Structure It?
     * We can collect frequently used variables and methods in a base (or parent) class and structure all the classes we create to inherit from this base class.
     * We can structure object groups that share common features using inheritance, doing the required operations with fewer variables and less code.
     */


}
