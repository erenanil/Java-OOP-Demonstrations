package OverrideEN;

public class PredatorBirds extends Birds {
    public boolean hasClaws;
    public void move(){
        System.out.println("Predator birds walk and fly.");
    }
    public void feed(){
        System.out.println("Predator birds primarily feed on meat.");
    }
}
