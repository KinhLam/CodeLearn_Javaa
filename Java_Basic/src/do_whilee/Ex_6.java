/*Bạn hãy điền code vào dấu ... để màn hình hiển thị ra các số lẻ từ 1 tới 100.
* Bài này bạn sẽ học được cách sử dụng câu lệnh continue.*/

package do_whilee;

public class Ex_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Dấu % là chia lấy dư
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
