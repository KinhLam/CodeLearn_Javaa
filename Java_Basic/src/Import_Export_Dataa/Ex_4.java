/*
* Bạn hãy viết chương trình nhập từ bàn phím chiều dài và chiều rộng của một hình chữ nhật (chiều dài và chiều rộng của hình chữ nhật này là một số nguyên) sau đó hiển thị ra màn hình:

Area = {P}
Với {P} là diện tích của hình chữ nhật.

Nếu bạn chưa làm được bài này thì hãy xem hướng dẫn bên dưới:*/

package Import_Export_Dataa;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int chieuDai = sc.nextInt();
        int chieuRong = sc.nextInt();

        System.out.println("Area = " + (chieuDai * chieuRong));
    }
}
