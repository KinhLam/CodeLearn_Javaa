/*Cho xâu s và số nguyên k được nhập từ bàn phím. Bạn hãy viết chương trình in ra màn hình ký tự thứ k trong xâu s.

Ví dụ nếu bạn nhập s = "Codelearn", k = 2 như bên dưới:

Codelearn
2
Thì màn hình sẽ hiển thị ra:

o
Giải thích: ký tự thứ 2 trong xâu Codelearn là ký tự o*/

package String;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.print(s.charAt(k - 1));
    }
}
