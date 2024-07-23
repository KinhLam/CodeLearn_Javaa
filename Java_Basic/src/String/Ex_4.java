/*Cho hai xâu ký tự s1 và s2 được nhập vào từ bàn phím, bạn hãy viết chương trình hiển thị ra vị trí đầu tiên mà s2 xuất hiện trong s1 (không phân biệt hoa thường).

Ví dụ

Nếu bạn nhập s1 = "Codelearn", s2 = "LEARN" thì màn hình sẽ hiển thị ra 4.
Giải thích: xâu "LEARN" xuất hiện tại vị trí thứ 4 trong xâu "Codelearn" (không phân biệt hoa thường nên "LEARN" hay "learn" đều được coi là như nhau).
Nếu bạn nhập s1 = "blackcat", s2 = "lack" thì màn hình sẽ hiển thị ra 1.*/

package String;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        System.out.print(s1.indexOf(s2));
    }
}
