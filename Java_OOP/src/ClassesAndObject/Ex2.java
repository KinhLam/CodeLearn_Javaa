package ClassesAndObject;

import java.util.Scanner;

class Rectangle {
    double length, width;

    public void getInfomation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getInfomation();
        r.display();
    }

}
