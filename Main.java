class Circle {
    double radius = 5.0;
    void Area() {
        double area = 3.14159 * radius * radius;
        System.out.println("Circle (default radius)");
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
        System.out.println();
    }
    void Area(double radius) {
        double area = 3.14159 * radius * radius;
        System.out.println("Circle (parameterized)");
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
        System.out.println();
    }
}

class Triangle {
    void Area(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("Triangle");
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area of the triangle: " + area);
        System.out.println();
    }
}

class Arithmetic {
    void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
    }

    void subtract(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
    }

    void multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
    }

    void divide(int a, int b) {
        if (b != 0) {
            double result = (double) a / b;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
     
        Circle circle = new Circle();
        circle.Area();         
        circle.Area(2.5);      

        Triangle triangle = new Triangle();
        triangle.Area(10.0, 5.0);
        Arithmetic calc = new Arithmetic();
        int x = 20, y = 5;
        calc.add(x, y);
        calc.subtract(x, y);
        calc.multiply(x, y);
        calc.divide(x, y);
    }
}

