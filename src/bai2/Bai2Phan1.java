package bai2;

import java.util.Scanner;
public class Bai2Phan1 {

    public class Delete {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nhập số lượng phần tử n: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("arr[" + i + "] = ");
                arr[i] = sc.nextInt();
            }

            System.out.print("Nhập vị tri cần xóa: ");
            int k = sc.nextInt();

            if (k < 0 || k >= n) {
                System.out.println("Vị trí không hợp lệ!");
            } else {
                for (int i = k; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }

                n--;
                System.out.println("Mảng sau khi xóa:");
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i]);
                }
            }
        }
    }
}