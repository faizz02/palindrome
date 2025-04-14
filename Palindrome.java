package week6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String play;
        do {
            System.out.print("Masukkan sebuah kata: ");
            String kata = input.nextLine();
            if (kata.isEmpty()) {  // flush baris kosong jika ada
                kata = input.nextLine();
            }

            TextGame game2 = new FancyTextGame();
            game2.displayResult(kata);

            System.out.print("main lagi y/n: ");
            play = input.nextLine();

        } while (play.equalsIgnoreCase("y"));

        System.out.println("Terimakasih sudah bermain!");
    }
}
