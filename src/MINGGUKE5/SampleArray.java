package MINGGUKE5;

import java.util.Scanner;

public class SampleArray {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan jumlah data: ");
        int n = inputan.nextInt();
        String[] mahasiswa= new String[n];
        Double[] nilai = new Double[n];

        for(int i=0; i<n; i++) {
            System.out.print("\"Masukan nama mahasiswa: ");
            mahasiswa[i] = inputan.next();
        }

        System.out.print("\"Masukan nilai mahasiswa: ");
        for(int a=0; a<mahasiswa.length; a++) {
            nilai[a] = 100.0;
            System.out.print(mahasiswa[a]+" " +nilai[a]);

        }
        inputan.close();
    }
}



