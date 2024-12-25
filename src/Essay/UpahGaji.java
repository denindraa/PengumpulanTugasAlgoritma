package Essay;
import java.util.Scanner;

public class UpahGaji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan gaji bulanan");
        double gajiBulanan = scanner.nextDouble();

        System.out.println("Masukan jam lembur");
        int jamLembur = scanner.nextInt();

        double upahLemburPerJam = gajiBulanan / 150;
        double totalUpahLembur;

        if (jamLembur > 5) {
            totalUpahLembur = (5 * upahLemburPerJam) + ((jamLembur - 5) * 5 * upahLemburPerJam);

        }else {

            totalUpahLembur = jamLembur * upahLemburPerJam;
        }

        double totalGaji = (gajiBulanan + totalUpahLembur);
        System.out.println("upahLemburPerJam: " + (int) upahLemburPerJam);
        System.out.println("totalGaji: " + (int) totalGaji );
        scanner.close();
    }
}  
    
        
    
    
    

