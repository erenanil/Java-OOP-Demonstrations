package OverrideEN;
    public class Main {
        public static void main(String[] args) {
           /* 
            Birds birds = new Birds();
            // In these two examples, since the reproduction and respiration methods are directly defined 
            // in the Birds class, they can be used without any issues.
            birds.reproduce();
            birds.respire();
    
            // However, in this example, Java first checks the Birds class for the movement method. 
            // Since it doesn't find it there, it moves up to the parent class connected via "extends" 
            // and executes the method from there.
            birds.move();
            
            // In this example, we are creating an object of the Animals class, but since we have chosen 
            // the constructor from the PredatorBirds class, Java first looks in the PredatorBirds class 
            // and uses the feed method defined there. If it couldn’t find it, Java would continue searching 
            // through the parent classes until it found the method (e.g., line 22).
            Animals animal = new PredatorBirds();
            animal.feed();
            animal.respire(); // The PredatorBirds class doesn't have a respiration method, so it moves to the parent class.
    
            
            // IMPORTANT !!!
            // This section is intentionally left to produce an error.
            // If you want to create an object from a child class, you must follow the hierarchy properly!!!
            // For example, an object created from the Birds class must adhere to the rules of the Birds class,
            // not the parent class!
            //Birds birds2 = new Animals();
            //birds2.reproduce();
            
            // Without exception, the most specific (latest in hierarchy) child classes always take precedence.
            Animals predatorBirds = new PredatorBirds();
            predatorBirds.move();
           */
            
            
    
        }
    }
    

