/*Bạn hãy điền code vào dấu ... để màn hình hiển thị ra các số từ 1 tới 50.
* Bài này bạn sẽ học được cách sử dụng câu lệnh break.*/

package do_whilee;

public class Ex_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 51) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
