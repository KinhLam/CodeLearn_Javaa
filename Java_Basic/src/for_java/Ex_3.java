/*Bạn hãy viết chương trình nhập vào từ bàn phím số nguyên n và thực hiện hiển thị các số từ n về -n.

Ví dụ nếu nhập n = 5 thì chương trình sẽ hiển thị ra màn hình:

5 4 3 2 1 0 -1 -2 -3 -4 -5*/

package for_java;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i >= -n; i--){
            System.out.print(i + " ");
        }
    }
}
