package MINGGUKE4;
import java.util.Scanner;

public class Bintang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Perulangan Bintang ===== ");
        System.out.print("Masukan jumlah baris : ");
        int baris = scanner.nextInt();

        for(int i = 0; i < baris; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
