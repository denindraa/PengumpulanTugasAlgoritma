package MINGGUKE6;
    import java.util.ArrayList;

public class ArrayLoop {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();
        mahasiswa.add("Ilham");
        mahasiswa.add("Ibnu");
        mahasiswa.add("Rafi");
        mahasiswa.add("Yuda");

        for(String mhs : mahasiswa) {
            System.out.println(mhs);
        }
        System.out.println("================================================");
        for(int i = 0; i <mahasiswa.size(); i++) {
            System.out.println(mahasiswa.get(i));
        }
    }
}
    

