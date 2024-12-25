package MINGGUKE4;

public class BubleShort {

    

    public static void main(String[] args) {
        int[] array = {
            4,3,5,2,6,1,7,8
        };
        int n = array.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = 0;j < n -1; j++){
                if (array[j] > array [j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;     
                }
            }
        }

        for(int value : array){
            System.out.println(value + "");
     
            }
        }
    }
      
