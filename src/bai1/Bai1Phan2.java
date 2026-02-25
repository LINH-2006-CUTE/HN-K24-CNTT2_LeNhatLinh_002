package bai1;

import java.util.Scanner;

public class Bai1Phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap mot chuoi bat ki:");
        String input = sc.next();
        input = input.toLowerCase().replace(" ", "");
        int[] count = new int[1000];
        int max = 0;

        for (char ch : input.toCharArray()) {
            count[ch]++;
            if (count[ch] > max) {
                max = count[ch];
            }
        }
        // ki tu xuat hien nhieu nhat
        for (char ch : input.toCharArray()) {
            if (count[ch] == max) {
                System.out.println(ch + " la ki tu xuat hien nhieu nhat");
                break;
            }
        }
        // tim ra ki tu dau tien khong lap trong chuoi da nhap, neu lap lai in ra thong bao khong tim thay
        for (char ch : input.toCharArray()) {
            if (count[ch] < max) {
//                input.charAt(0);
                System.out.println("output" + ch);
//                break;
            }
            ;

        }
    }
}