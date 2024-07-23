/* Bạn hãy viết chương trình nhập vào từ bàn phím số nguyên n. Sau đó kiểm tra xem nếu n là số chẵn thì hiển thị ra:

n is an even number
Ngược lại, nếu n là số lẻ thì hiển thị ra:

n is an odd number*/

package If_else;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0) {
            System.out.println("n is an even number");
        }else {
            System.out.println("n is an odd number");
        }
    }

}
