package ClassesAndObject;

class Customer_Ex5 {
    String name;

    // Báo lỗi do không tìm thấy constructor trong lớp Customer_Ex5
    public Customer_Ex5() {
    }

    public Customer_Ex5(String name) {
        this.name = name;
    }
}

public class Ex5 {
    public static void main(String[] args) {
        Customer_Ex5 customer = new Customer_Ex5();
        System.out.println("Welcome to Codelearn!");
    }
}
