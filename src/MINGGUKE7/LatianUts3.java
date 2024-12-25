package MINGGUKE7;

import java.util.ArrayList;
import java.util.Scanner;

class Keterangan {
    String namaProgram;
    int sks;
    double grade;

    Keterangan(String namaProgram, int sks, double grade) {
        this.namaProgram = namaProgram;
        this.sks = sks;
        this.grade = grade;
    }
}

class JenisKeterangan {
    Keterangan keterangan;

    JenisKeterangan(Keterangan keterangan) {
        this.keterangan = keterangan;
    }

    double getGrade() {
        return keterangan.grade;
    }

    int getSKS() {
        return keterangan.sks;
    }

    String getnamaProgram() {
        return keterangan.namaProgram;
    }
}

public class LatianUts3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<JenisKeterangan> pilihan = new ArrayList<>();

        // Input for student's name and semester
        System.out.print("Masukkan nama mahasiswa: ");
        String studentName = scanner.nextLine();

        System.out.print("Masukkan semester: ");
        int semester = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Loop to input courses
        String addMore;
        do {
            System.out.print("Masukkan nama mata kuliah: ");
            String namaProgram = scanner.nextLine();

            System.out.print("Masukkan SKS: ");
            int sks = scanner.nextInt();

            System.out.print("Masukkan nilai: ");
            double grade = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            Keterangan keterangan = new Keterangan(namaProgram, sks, grade);
            pilihan.add(new JenisKeterangan(keterangan));

            System.out.print("Tambahkan mata kuliah lain? (y/n): ");
            addMore = scanner.nextLine();
        } while (addMore.equalsIgnoreCase("y"));

        System.out.println("=======================================================");
        System.out.println("\nNama Mahasiswa: " + studentName);
        System.out.println("Semester: " + semester);
        System.out.println("-------------------------------------------------------");
        System.out.println("Daftar Mata Kuliah:");
        System.out.printf("%-20s %-5s %-5s\n", "Nama Mata Kuliah", "SKS", "Nilai");
        
        for (JenisKeterangan item : pilihan) {
            System.out.printf("%-20s %-5d %-5.2f\n", item.getnamaProgram(), item.getSKS(), item.getGrade());
        }
        System.out.println("=======================================================");

        scanner.close();
    }
}
    

