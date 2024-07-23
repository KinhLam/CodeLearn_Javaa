/*Cho xâu s được nhập và từ bàn phím, bạn hãy viết chương trình đảo ngược xâu s và hiển thị ra màn hình.

Ví dụ

Nếu bạn nhập s = "Codelearn" thì màn hình sẽ hiển thị ra "nraeledoC"
Nếu bạn nhập s = "ABC" thì màn hình sẽ hiển thị ra "CBA"*/

package String;

import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String answer = "";
        for (int i = s.length() - 1; i >= 0; i--){
            answer += s.charAt(i);
        }

        System.out.println(answer);
    }
}
