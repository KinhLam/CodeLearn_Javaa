/*Bạn hãy viết phương thức trả về số lớn nhất trong 3 số được nhập và từ bàn phím.

Ví dụ

Nếu bạn nhập a = 6, b = 2, c = 8 thì màn hình sẽ hiển thị ra 8.
Nếu bạn nhập a = 4, b = 4, c = 4 thì màn hình sẽ hiển thị ra 4.*/

package Method;

import java.util.Scanner;

public class Ex_4 {
    public static int max3(int a, int b, int c) {
        if(a >= b && a >= c){
            return a;
        }
        if(b >= a && b >= c){
            return b;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(max3(a,b,c));
    }
}
