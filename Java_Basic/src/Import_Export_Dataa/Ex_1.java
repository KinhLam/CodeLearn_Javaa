/*Bạn hãy viết chương trình nhập vào tên của mình từ bàn phím và thực hiện hiển thị ra màn hình dòng chữ:

        Hello {P}
        Với {P} là tên bạn vừa nhập từ bàn phím.

        Ví dụ nếu bạn nhập tên là Trung thì màn hình sẽ hiển thị lên dòng chữ:

        Hello Trung*/
package Import_Export_Dataa;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name);
    }
}
