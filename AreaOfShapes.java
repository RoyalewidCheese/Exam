//Rathul Krishnan R
//S3 CSE
//46


import java.util.Scanner;

class Shape {
    double ar;
    void area (float length, float breadth)
    {
        ar = length * breadth;
        System.out.println("Area = "+ar);
    }
}

class Circle extends Shape {
    void area (float radius) 
    {
        ar = 3.14 * radius * radius;
        System.out.println("Area of circle = "+ar);
    }
}

class Rectangle extends Shape {
    void area (float length, float breadth) 
    {
        ar = length * breadth;
        System.out.println("Area of rectangle = "+ar);
    }
}

class Triangle extends Shape {
    void area (float base, float height) 
    {
        double ar = 0.5 * base * height;
        System.out.println("Area of triangle = "+ar);
    }
}

class AreaOfShapes {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        float length, breadth, radius, base, height;
        String shape;
        while (true) {
            System.out.println("\nThe choices are : \t'RECTANGLE' \t'CIRCLE' \t'TRIANGLE' \t 'EXIT'");
            System.out.println("Enter your choice");
            shape = sc.nextLine();
            switch (shape) {
                case "CIRCLE":
                    System.out.println("Enter the radius : ");
                    radius = sc.nextFloat();
                    Circle c = new Circle();
                    c.area(radius);
                    break;
                case "RECTANGLE":
                    System.out.println("Enter the length : ");
                    length = sc.nextFloat();
                    System.out.println("Enter the breadth : ");
                    breadth = sc.nextFloat();
                    Shape r = new Rectangle();
                    r.area(length,breadth);
                    break;
                case "TRIANGLE":
                    System.out.println("Enter the base : ");
                    base = sc.nextFloat();
                    System.out.println("Enter the height : ");
                    height = sc.nextFloat();
                    Shape t = new Triangle();
                    t.area(base,height);
                    break;
                case "EXIT":
                    sc.close();
                    System.exit(0);
            }
        }
    }
}