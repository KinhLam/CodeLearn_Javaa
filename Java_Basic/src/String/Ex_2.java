/*Cho xâu s và ký tự c được nhập từ bàn phím. Bạn hãy viết chương trình in ra số lần xuất hiện của ký tự c trong xâu s.

Ví dụ nếu bạn nhập s = "Codelearn", c = 'e' như bên dưới:

Codelearn
e
Thì màn hình sẽ hiển thị ra:

2
Giải thích: ký tự thứ 'e' xuất hiện 2 lần trong xâu "Codelearn"*/

package String;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
