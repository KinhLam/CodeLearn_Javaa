/*Cho số nguyên dương n được nhập từ bàn phím, bạn hãy viết phương thức đệ quy trả về n! (n giai thừa).

Ví dụ nếu bạn nhập n = 5 thì chương trình sẽ hiển thị lên màn hình 120.*/

package Method;

import java.util.Scanner;

public class Ex_6 {
    public static int factoria(int n){
        if(n == 1) return 1;
        return n * factoria(n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factoria(n));
    }
}
