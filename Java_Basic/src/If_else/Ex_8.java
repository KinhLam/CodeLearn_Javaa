/* Viết chương trình nhập từ bàn phím điểm của một học sinh. Biết điểm hợp lệ là điểm nằm trong đoạn từ 0 đến 10, bạn hãy kiểm tra xem điểm vừa nhập có hợp lệ không, nếu có thì hiển thị ra màn hình:

The score is valid
Ngược lại nếu điểm không hợp lệ thì hiển thị:

The score is not valid*/

package If_else;

import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        if(a >= 0 && a <= 10) {
            System.out.println("The score is valid");
        }else{
            System.out.println("The score is not valid");
        }
    }
}
