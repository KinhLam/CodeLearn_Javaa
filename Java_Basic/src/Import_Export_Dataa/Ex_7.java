/*
* Bạn hãy viết chương trình nhập vào từ bàn phím tên, tuổi của một người. Sau đó hiển thị ra màn hình:

In 15 years, age of {P1} will be {P2}
Với {P1} là tên của người đó, {P2} là tuổi của người đó sau 15 năm.

Ví dụ nếu bạn nhập:

Tuan 23
Thì màn hình sẽ hiển thị lên:

In 15 years, age of Tuan will be 38
Nếu bạn chưa giải được thì có thể xem hướng dẫn ở bên dưới*/

package Import_Export_Dataa;

import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();

        System.out.print("In 15 years, age of " + name + " will be " + (age + 15));
    }
}
