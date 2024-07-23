/* Viết chương trình nhập từ bàn phím 3 số nguyên. Sau đó hiển thị lên màn hình số lớn nhất trong 3 số này.

Ví dụ nếu bạn nhập:

4 7 3
thì màn hình sẽ hiển thị ra:

7
Nếu bạn nhập:

4 4 4
thì màn hình sẽ hiển thị ra:

4
Nếu bạn chưa làm được bài này thì có thể xem hướng dẫn ở bên dưới.*/

package If_else;

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a >= b && a >= c ){
            System.out.println(a);
        } else if (b >= c) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
