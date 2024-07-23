/* Bạn hãy viết chương trình nhập vào một ký tự từ bàn phím và thực hiện hiển thị ký tự tiếp trong bảng bảng chữ cái của ký tự đó ra màn hình.

Ví dụ nếu bạn nhập

c
thì chương trình sẽ hiển thị ra

d
Giải thích: 'd' là ký tự tiếp theo của 'c' trong bảng chữ cái.*/

package Import_Export_Dataa;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = (char)(sc.next().charAt(0) + 1); //Scanner không cung cấp phương thức dữ liệu cho biến char
        System.out.println(c);
    }
}
