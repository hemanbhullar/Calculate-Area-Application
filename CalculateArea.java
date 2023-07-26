package CalculateAreaWithOOPS;
//Using oops concept
import java.util.Scanner;

abstract class Shape{
    float area;

    abstract void acceptInput();
    abstract void compute();
    public void disp(){
        System.out.println("The area is: "+ area);
    }
};

class Square extends Shape{
    private float length;

    public void acceptInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of square: ");
        length = in.nextFloat();
    }
    public void compute(){
       area = length*length;  
    }
};

class Rectangle extends Shape{
    private float length;
    private float breadth;

    public void acceptInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        length = in.nextFloat();
        System.out.println("Enter the breadth of rectangle: ");
        breadth = in.nextFloat();
    }
    public void compute(){
       area = length*breadth;  
    }
}

class Circle extends Shape{
    private float radius;

    public void acceptInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        radius = in.nextFloat();
    }
    public void compute(){
       area = 3.141f*radius*radius;  
    }
}

class Geometry
{
    public void permit(Shape ref){
        ref.acceptInput();
        ref.compute();
        ref.disp();
    }
}

public class CalculateArea {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        Geometry g = new Geometry();

        g.permit(s);
        g.permit(r);
        g.permit(c);
    }
}
