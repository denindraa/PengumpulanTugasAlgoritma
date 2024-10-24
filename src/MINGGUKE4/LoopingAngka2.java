package MINGGUKE4;

public class LoopingAngka2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 20;

        for (int i = 0; i < 1; i++) { 
            for (int j = 0; j < 5; j++) {
                System.out.print(a + " ");
                a++; 
            }
            System.out.println(); 
        }

        for (int i = 0; i < 1; i++) { 
            for (int j = 0; j < 5; j++) {
                System.out.print(b + " "); 
                b--; 
            }
            System.out.println();
        }

        for (int i = 0; i < 1; i++) { 
            for (int j = 0; j < 5; j++) {
                System.out.print(a + " ");
                a++; 
            }
            System.out.println(); 
        }

        for (int i = 0; i < 1; i++) { 
            for (int j = 0; j < 5; j++) {
                System.out.print(b + " "); 
                b--; 
            }
            System.out.println();
        }
        
        System.out.println("==========");
    }
}

