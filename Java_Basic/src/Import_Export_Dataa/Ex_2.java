/*

Bạn hãy viết chương trình nhập vào tên và địa chỉ của một người sau đó hiển thị ra màn hình:

Name: {P1}
Address: {P2}
Với {P1} và {P2} lần lượt là tên và địa chỉ của người đó.

* */

package Import_Export_Dataa;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String address = sc.next();
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
