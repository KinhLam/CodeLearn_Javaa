/*Bạn hãy viết chương trình nhập vào từ bàn phím số nguyên n và hiển thị ra các số từ 1 tới n, mỗi số cách nhau bởi 1 khoảng trắng.

Ví dụ nếu nhập n = 10 thì chương trình sẽ hiển thị ra:

1 2 3 4 5 6 7 8 9 10 */

package for_java;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }
    }
}
