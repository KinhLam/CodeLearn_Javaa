/*Cho số nguyên a và b được nhập vào từ bàn phím, bạn hãy viết chương trình hiển thị ra màn hình các số từ a tới b.

Ví dụ nếu nhập a = 5, b = 9 thì chương trình sẽ hiển thị ra màn hình:

5 6 7 8 9
Nếu bạn chưa làm được bài này thì có thể xem hướng dẫn ở bên dưới.*/

package for_java;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i <= b; i++){
            System.out.print(i + " ");
        }
    }
}
