package bai1;

import java.util.Scanner;

public class Bai1Phan1 {

    public class FirstUniqueChar {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập vào một chuỗi:");
            String input = sc.nextLine();

            int[] counts = new int[256];

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                counts[ch]++;
            }

            boolean found = false;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (counts[ch] == 1) {
                    System.out.println("Ký tự đầu tiên không lặp lại là:" + ch);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Không tìm thấy ký tự nào");
            }
        }
    }
}