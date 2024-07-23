/* Bạn hãy viết chương trình nhập vào từ bàn phím 2 số nguyên a và b. Sau đó hiển thị ra các phép tính trên 2 số này giống như sau:

a + b = {P1}
a - b = {P2}
a * b = {P3}
a / b = {P4}
a % b = {P5}
Trong đó:

{P1} là tổng của a và b.

{P2} là hiệu của a và b.

{P3} là tích của a và b.

{P4} là thương của a và b (chỉ lấy phần nguyên).

{P5} là phần dư của phép chia a/b.

Ví dụ nếu bạn nhập:

10 5
thì màn hình sẽ hiển thị:

a + b = 15
a - b = 5
a * b = 50
a / b = 2
a % b = 0
*/

package Import_Export_Dataa;

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

    }
}
