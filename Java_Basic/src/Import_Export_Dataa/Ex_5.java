/* Cho 2 biến kiểu số nguyên a và b được nhập từ bàn phím, bạn hãy viết chương trình hiển thị ra màn hình:

a % b = {P}
Với {P} là phần dư của phép chia a/b.

Ví dụ nếu bạn nhập

7 3
thì màn hình sẽ hiển thị lên dòng chữ:

a % b = 1
Giải thích: 7 chia 3 dư 1*/

package Import_Export_Dataa;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a % b = " + (a % b));
    }
}
