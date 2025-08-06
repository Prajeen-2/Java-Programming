import java.util.Scanner;
class Square {
    double side;

    Square(double side) {
        this.side = side;
    }

    double area() {
        return side * side;
    }

    double perimeter() {
        return 4 * side;
    }
}

class Rectangle {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double perimeter() {
        return a + b + c;
    }

    double area() {
        double s = (a + b + c) / 2; 
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        Square sq = new Square(side);
        System.out.println("Square Area: " + sq.area());
        System.out.println("Square Perimeter: " + sq.perimeter());

        System.out.print("\nEnter length and width of rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        Rectangle rect = new Rectangle(l, w);
        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Rectangle Perimeter: " + rect.perimeter());

        System.out.print("\nEnter radius of circle: ");
        double r = sc.nextDouble();
        Circle cir = new Circle(r);
        System.out.println("Circle Area: " + cir.area());
        System.out.println("Circle Circumference: " + cir.perimeter());

        System.out.print("\nEnter three sides of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        Triangle tri = new Triangle(a, b, c);
        System.out.println("Triangle Area: " + tri.area());
        System.out.println("Triangle Perimeter: " + tri.perimeter());

        sc.close();
    }
}
