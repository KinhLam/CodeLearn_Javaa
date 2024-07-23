/*
* Viết chương trình nhập vào tên của 2 người, bạn hãy kiểm tra xem tên của 2 người này có giống nhau không. Nếu có thì hiển thị ra:

two people have the same name
Ngược lại nếu tên của 2 người này không giống nhau thì hiển thị ra:

two people don't have the same name
Nếu bạn chưa làm được bài này thì có thể xem hướng dẫn ở bên dưới.*/

package If_else;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(a.equals(b)){
            System.out.println("two people have the same name");
        }
        else {
            System.out.println("two people don't have the same name");
        }
    }
}
