/*Bạn hãy viết chương trình nhập từ bàn phím hai số nguyên dương a và b. Sau đó hiển thị ra màn hình kết quả của ab.

Ví dụ nếu nhập a = 2, b = 3 thì chương trình sẽ hiển thị ra màn hình:

8
Giải thích: 2 * 2 * 2 = 8.

Nếu bạn chưa làm được bài này thì có thể xem hướng dẫn ở bên dưới.*/

package do_whilee;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 1;
        while (b > 0) {
            answer = answer * a;
            b--;
        }
        System.out.print(answer);
    }
}
