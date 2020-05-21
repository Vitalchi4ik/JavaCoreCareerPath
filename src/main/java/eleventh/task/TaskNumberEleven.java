/**
 * Task 11 (hard)
 * Create a program, that fills an array of length NxN according to the following algorithm
 *
 * 1 3 4 10 11
 *
 * 2 5 9 12 19
 *
 * 6 8 13 18 20
 *
 * 7 14 17 21 24
 *
 * 15 16 22 23 25
 By diagonal,from up till down,left to right zig-zag.
 */
package eleventh.task;

public class TaskNumberEleven {
    public static int[][] Zig_Zag(int size) {
        int[][] data = new int[size][size];
        int i = 1;
        int j = 1;
        for (int element = 1; element <= size * size; element++) {
            data[i - 1][j - 1] = element;
            if ((i + j) % 2 == 1) {
                // Even stripes
                if (j < size)
                    j++;
                else
                    i += 2;
                if (i > 1)
                    i--;
            } else {
                // Odd stripes
                if (i < size)
                    i++;
                else
                    j += 2;
                if (j > 1)
                    j--;
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int [][] arr = Zig_Zag(5);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
