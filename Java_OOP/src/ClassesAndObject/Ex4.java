package ClassesAndObject;

class Student_Ex4 {
    String name;
    int age;

    public Student_Ex4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Student_Ex4 s1 = new Student_Ex4("Long", 24);
        Student_Ex4 s2 = new Student_Ex4("Kien", 29);
        s1.display();
        s2.display();
    }
}
