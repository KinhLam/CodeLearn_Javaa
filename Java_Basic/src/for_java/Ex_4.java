/*Bạn hãy viết chương trình nhập vào từ bàn phím số nguyên a và b. Sau đó hiển thị ra màn hình tổng các số từ a tới b:

Ví dụ nếu nhập a = 5, b = 9 thì chương trình sẽ hiển thị ra màn hình:

35
Giải thích: 5 + 6 + 7 + 8 + 9 = 35*/

package for_java;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 0;

        for(int i = a; i <= b; i++){
            answer = answer + i;
        }

        System.out.print(answer + " ");
    }
}
