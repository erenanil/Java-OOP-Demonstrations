package Shape;

class Shape{
    protected int length;
    protected int breadth;

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area(){
        System.out.println(length+""+breadth);
    }
}

class Rectangle extends Shape{
    public Rectangle(int length,int breadth){
        super(length, breadth);
    }
    public void area(){
        int area= length * breadth;
        System.out.println(area);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(10, 5);
        shape.area(); 

        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.area();
    }
}