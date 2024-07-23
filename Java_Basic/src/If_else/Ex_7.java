/* Viết chương trình nhập từ bàn phím số nguyên a. Bạn hãy kiểm tra xem a có nằm trong đoạn [10, 100] không, nếu có thì hiển thị ra màn hình:

{P} is in the range [10, 100]
Ngược lại hiển thị ra màn hình:

{P} is not in the range [10, 100]
Với {P} là giá trị của biến a.

Lưu ý: nếu bạn đã quên khái niệm về đoạn thì [10, 100] chính là đoạn bao gồm các số lớn hơn hoặc bằng 10 và nhỏ hơn hoặc bằng 100.

Ví dụ nếu bạn nhập:

55
Thì màn hình sẽ hiển thị ra:

55 is in the range [10, 100]*/

package If_else;

import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a >= 10 && a <= 100){
            System.out.println(a + " is in the range [10, 100]");
        }else{
            System.out.println(a + " is not in the range [10, 100]");
        }
    }
}
