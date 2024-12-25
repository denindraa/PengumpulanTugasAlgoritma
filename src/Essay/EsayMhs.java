package Essay;
import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa12 {
    String nama;
    int SKS;
    String Nilai;
    int bobot;

    public Mahasiswa12(String nama, int SKS, String Nilai){
        this.nama = nama;
        this.SKS = SKS;
        this.Nilai = Nilai;
        this.bobot = konversiNilai(Nilai); }

        int konversiNilai (String Nilai) {
            switch (Nilai.toUpperCase()) {
                case "A" :
                return 4;
                case "B" :
                return 3;
                case "C" :
                return 2;
                case "E" :
                return 0;
            default : return 0;
        }
    }
}

    public class Mahasiswa12 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nama Mahasiswa : ");
                String namaMahasiswa = scanner.nextLine();

                System.out.print ("Semester : ");
                int semester = scanner.nextInt();
                scanner.nextLine();

                ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();
                System.out.println("Daftr Mata Kuliah : ");
                while (true) {
                    System.out.print("Nama Mata Kuliah : (ketik selesai Jika ingin stop) ");
                    String namaMataKuliah = scanner.nextLine();

                    if (namaMataKuliah.equalsIgnoreCase ("selesai")){
                        break;
                    }

                    System.out.print("SKS : ");
                    int SKS = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nilai (A, B, C, D, atau E) : ");
                    String Nilai = scanner.nextLine();

                    daftarMataKuliah.add(new MataKuliah(namaMataKuliah, SKS, Nilai));
                }
                int totalSKS = 0;
                double totalNilai = 0;
                System.out.println("Nama Mahasiswa : " + namaMahasiswa);
                System.out.println("Semester : " + semester);
                System.out.println("==================================================");
                System.out.printf("%-20s %-5s %-7s %-5s\n", "Mata Kuliah ", "SKS", "Nilai",  "bobot");
                System.out.println("--------------------------------");
                for (MataKuliah mk : daftarMataKuliah ) {
                    System.out.printf("%-20s %-5d %-7s %5d\n", mk.nama, mk.SKS, mk.Nilai, mk.bobot);
                    totalSKS += mk.SKS;
                    totalNilai += mk.SKS * mk.bobot;   
                }
                double nilaiRataRata = totalNilai / totalSKS ;
                System.out.println("--------------------------------");
                System.out.println("Total SKS yang diambil : " + totalSKS);
                System.out.printf("Nilai rata - rata : %.2f\n", nilaiRataRata);
                System.out.println("==================================================");
                scanner.close();
     }
                  
}
