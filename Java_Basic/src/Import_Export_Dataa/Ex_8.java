/* Cho 2 biến kiểu số nguyên a và b được nhập từ bàn phím, bạn hãy viết chương trình hoán đổi giá trị của biến a và biến b. Sau đó hiển thị ra màn hình:

after swapping, a = {P1}, b = {P2}
Với {P1} và {P2} lần lượt là giá trị của a và b sau khi đã hoán đổi.

Ví dụ nếu bạn nhập a = 3, b = 4 như bên dưới:

3 4
Thì chương trình sẽ hiển thị ra:

after swapping, a = 4, b = 3
Nếu bạn chưa giải được bài này thì có thể xem hướng dẫn ở bên dưới.*/

package Import_Export_Dataa;

import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;

        System.out.println("after swapping, a = " + a + ", b = " + b);
    }
}
