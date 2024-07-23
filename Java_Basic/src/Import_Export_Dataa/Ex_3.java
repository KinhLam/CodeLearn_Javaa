/* Bạn hãy viết chương trình tạo ra 2 biến kiểu số nguyên a và b. Sau đó nhập giá trị cho biến a và b từ bàn phím và hiển thị ra màn hình:

a + b = {P}
Với {P} là tổng của a và b.*/

package Import_Export_Dataa;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a + b = " + (a + b));
    }
}
