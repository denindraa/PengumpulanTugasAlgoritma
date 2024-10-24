package MINGGUKE4;

public class LoopingAngka1 {
    public static void main(String[] args) {
        int start = 1;
            for (int a = 1; a <= 4; a++) {
                int jumlahAngka;
                if (a == 3) {
                    jumlahAngka = 4;
                } else{
                    jumlahAngka = 5;
                }
                for (int b = 1; b <= jumlahAngka; b++) {
                    if (start == 6 || start == 12 || start == 17) {
                        start++;
                    }
                    System.out.print(start + " ");
                    start++;
                }
                System.out.println(); 
            }
        }
    }

