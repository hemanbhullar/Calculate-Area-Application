package CalculateAreaWithoutOOPS;
//without using oops concept
import java.util.*;

class Square{
    float length;
    float area;

    public void acceptInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Length of the square: ");
        length = in.nextFloat();
    }

    public void compute(){
        area = length*length;
    }

    public void disp(){
        System.out.println("The area of square is: " + area);
    }
}

class Rectangle{
    float length;
    float breadth;
    float area;

    public void acceptInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Length of the rectangle: ");
        length = in.nextFloat();
        System.out.println("Enter the Breadth of the rectangle: ");
        breadth = in.nextFloat();
    }

    public void compute(){
        area = length*breadth;
    }

    public void disp(){
        System.out.println("The area of Rectangle is: " + area);
    }
}

class Circle{
    float radius;
    float area;

    public void acceptInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radius of the circle: ");
        radius = in.nextFloat();
    }

    public void compute(){
        area = 3.141f*radius*radius;
    }

    public void disp(){
        System.out.println("The area of circle is: " + area);
    }
}

public class CalculateShape {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        s.acceptInput();
        s.compute();
        s.disp();

        r.acceptInput();
        r.compute();
        r.disp();

        c.acceptInput();
        c.compute();
        c.disp();
    }
    
}

