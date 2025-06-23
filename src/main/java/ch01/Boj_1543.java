package ch01;

import java.io.IOException;
import java.util.Scanner;

public class Boj_1543 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        String replaced = doc.replace(word, "");
        int len = doc.length() - replaced.length();
        int count = len / doc.length();
        System.out.println(count);

    }
}
