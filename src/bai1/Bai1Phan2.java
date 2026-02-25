package bai1;

import java.util.Scanner;

public class Bai1Phan2 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập tên:");
                String input = sc.nextLine();
                StringBuilder cleanStr = new StringBuilder();
                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    if (Character.isLetter(ch) || ch == ' ') {
                        cleanStr.append(ch);
                    }
                }

                String[] words = cleanStr.toString().trim().split("\\s+");
                StringBuilder result = new StringBuilder();
                for (String word : words) {
                    if (!word.isEmpty()) {
                        String firstChar = word.substring(0, 1).toUpperCase();
                        String remain = word.substring(1).toLowerCase();
                        result.append(firstChar).append(remain);
                    }
                }
                System.out.println("Kết quả:" + result.toString());
            }
        }
