/*Bạn hãy viết chương trình nhập từ bàn phím số nguyên n và hiển thị ra màn hình n! (n giai thừa).

Ví dụ nếu nhập n = 5 thì chương trình sẽ hiển thị ra màn hình:

120
Giải thích: 1 * 2 * 3 * 4 * 5 = 120.*/

package for_java;

import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 1;
        for(int i = 1; i <= n; i++){
            answer = answer * i;
        }

        System.out.print(answer + " ");
    }
}
