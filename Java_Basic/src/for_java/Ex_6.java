/*Bạn hãy viết chương trình nhập vào từ bàn phím số nguyên a và b. Sau đó hiển thị ra màn hình các số chia hết cho 3 từ a tới b:

Ví dụ nếu nhập a = 1, b = 20 thì chương trình sẽ hiển thị ra màn hình:

3 6 9 12 15 18
Nếu bạn chưa làm được bài này thì có thể xem hướng dẫn ở bên dưới.*/

package for_java;

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a; i <= b; i++){
            if(i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
