package ClassesAndObject;

class Student_Ex3 {
    String name;
    int age;

    public Student_Ex3() {
        name = "Tuan";
        age = 24;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Student_Ex3 s = new Student_Ex3();
        s.display();
    }
}
