import java.util.Scanner;

public class GeometryCalculator {

    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static double volumeOfBall(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double areaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double areaOfEquilateralTriangle(double arm) {
        return (Math.sqrt(3) / 4.0) * Math.pow(arm, 2);
    }

    public static double areaOfTriangleHeron(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.println("Area of triangle: " + areaOfTriangle(10, 5));
        System.out.println("Volume of ball: " + volumeOfBall(3));
        System.out.println("Area of circle: " + areaOfCircle(4));
        System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(25));
        System.out.println("Area of equilateral triangle: " + areaOfEquilateralTriangle(6));
        System.out.println("Area of triangle (Heron's formula): " + areaOfTriangleHeron(3, 4, 5));

        scanner.close();
    }
}
