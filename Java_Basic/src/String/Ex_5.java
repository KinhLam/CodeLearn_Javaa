/*Cho xâu s được nhập vào từ bàn phím, bạn hãy viết chương trình hiển thị ra màn hình những ký tự không phải là số trong xâu s.

Ví dụ

Nếu bạn nhập s = "Codel9a83rn" thì màn hình sẽ hiển thị ra "Codelearn"
Nếu bạn nhập s = "black7cat" thì màn hình sẽ hiển thị ra "blackcat"
Gợi ý: Sử dụng phương thức replace() để loại bỏ hết các ký tự số trong xâu s.*/

package String;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(char c = '0'; c<='9'; c++){
            s = s.replace(c + "", "");
        }
        System.out.println(s);
    }
}
