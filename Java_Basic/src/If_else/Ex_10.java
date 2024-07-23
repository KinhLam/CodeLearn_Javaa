/* Cho biến x và y kiểu số nguyên được nhập vào từ bàn phím (cả x và y đều khác 0). Bạn hãy xác định điểm có tọa độ (x, y) đó nằm ở góc phần tư nào.

 */

package If_else;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x == 0 && y == 0){
            System.out.println("Error");
        } else if (x > 0 && y > 0) {
            System.out.println("This point lies in the First quadrant");
        }else if (x < 0 && y > 0) {
            System.out.println("This point lies in the Second quadrant");
        }else if (x < 0 && y < 0) {
            System.out.println("This point lies in the Third quadrant");
        }else if (x > 0 && y < 0) {
            System.out.println("This point lies in the Fourth quadrant");
        }
    }
}
