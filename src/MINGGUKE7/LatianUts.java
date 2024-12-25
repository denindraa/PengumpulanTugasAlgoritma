package MINGGUKE7;

import java.util.Scanner;

public class LatianUts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan gaji bulanan: ");
        double gajiBulanan = scanner.nextDouble();

        System.out.print("Masukkan jam lembur: ");
        int jamLembur = scanner.nextInt();

        double upahLemburPerJam = (gajiBulanan / 173) / 1000 * 1000;
        double totalUpahLembur;

        if (jamLembur > 4) {
            totalUpahLembur = (4 * upahLemburPerJam) + ((jamLembur - 4) * 2 * upahLemburPerJam);
        } else {
            totalUpahLembur = jamLembur * upahLemburPerJam;
        }

        double totalGaji = Math.round((gajiBulanan + totalUpahLembur) / 1000) * 1000;

        System.out.println("Upah lembur per jam: " + (int)upahLemburPerJam);
        System.out.println("Total gaji: " + (int)totalGaji);
        scanner.close();
    }
}

