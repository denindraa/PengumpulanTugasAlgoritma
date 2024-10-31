package MINGGUKE6;
import java.util.Scanner;
import java.util.ArrayList;

class arMahasiswa{
    String nama;
    double nilai;
    arMahasiswa(String nama,double nilai){
    this.nama = nama;
    this.nilai = nilai;
    }
    String getStatus(){
        if(nilai >= 70){
            return "Lulus";
        } else{
            return "Tidak Lulus";
        }
    }
    String getGrade(){
        if(nilai >= 85){
            return "A";
        } else if(nilai >= 75){
            return "B";
        } else if(nilai >= 65){
            return "C";  
        } else {
            return "D";
        }
    }
}

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Jumlah Data");
        int jmlData = scanner.nextInt();
        scanner.nextLine();
        ArrayList<arMahasiswa> mahasiswa = new ArrayList<arMahasiswa>();
        for(int i = 0; i < jmlData; i++){
            System.out.println("Mahasiswa ke :" + (i + 1));
            System.out.print("Masukan nama mahasiswa : ");
            String nama = scanner.nextLine();
            System.out.print("Masukan nilai mahasiswa : ");
            double nilai = scanner.nextDouble();
            scanner.nextLine();

            mahasiswa.add(new arMahasiswa(nama, nilai));
            System.out.println("---------------------");
        }
        
        System.out.println("Data Mahasiswa");
        System.out.println("======================");
        System.out.printf("%-3s %-10s %-5s %-3s %-10s", "No", "Nama", "Nilai", "Grade", "Status");
        double totalNilai = 0;
        for(int i = 0; i < mahasiswa.size(); i++){
            arMahasiswa mhs = mahasiswa.get(i);
            System.out.printf("\n%-3d %-10s %-6.1f %-3s %-10s\n", (i + 1), mhs.nama, mhs.nilai, mhs.getGrade(), mhs.getStatus());
            totalNilai += mhs.nilai;
        }
        System.out.println("======================");
        System.out.println("Jumlah + totalNilai"); 
        double rataRata = totalNilai / jmlData; 
        System.out.println("Nilai rata rata :" + rataRata);   
        scanner.close();
    }
}
