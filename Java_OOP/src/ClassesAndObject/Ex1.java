package ClassesAndObject;

import java.util.Scanner;

class Student {
    String name;
    int age;

    public void getInfomation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getInfomation();
        s1.display();
    }

}
