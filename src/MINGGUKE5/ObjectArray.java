package MINGGUKE5;

    class Mahasiswa {
        String nim;
        String nama;
        double nilai;
        public Mahasiswa (String nim, String nama, double nilai){
            this.nim = nim;
            this.nama = nama;
            this.nilai = nilai;
        }
    
        public static void main(String[] args) {
            Mahasiswa mhs[] = new Mahasiswa[3];
            mhs[0] = new Mahasiswa(
                "20240040199", 
                "Dani", 
                100.0);
            mhs[1] = new Mahasiswa(
                "20240719967",
                "Wawan",
                90.0);
            mhs[2] = new Mahasiswa(
                "2024004163",
                "Jahseh",
                95.0);
            System.out.println("NIM\t\tNama\t\tNilai\t");
            System.out.println("=======================================");
            for(Mahasiswa m : mhs){
                System.out.println(m.nim+"\t"+m.nama+"\t"+m.nilai);
            }
        }
    }

