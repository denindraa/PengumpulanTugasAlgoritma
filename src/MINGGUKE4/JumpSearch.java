package MINGGUKE4;

public class JumpSearch {
        public static int jumpSearch(int[] arr, int x) {
          int n = arr.length;

          int step = (int)Math.sqrt(n);

          int  prev = 0;
          while (arr[Math.min(step, n)-1] < x) {
            prev = step;
            step += (int)Math.sqrt(n);
            if (prev >= n) {
                return -1;
                
            }
          }

          while (arr[prev] < x) {
            prev++;
            if (prev == Math.min(step, n)) {
                return -1;
                
            }
          }

          if (arr[prev] == x) {
            return prev;
          }

          return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 5;

        int index = jumpSearch(arr, x);

        if (index != -1) {
          System.out.println("Elemen ditemukan pada index " + index);
        } else {
          System.out.println("Elemen tidak di temukan");
        }
        }
        }

    