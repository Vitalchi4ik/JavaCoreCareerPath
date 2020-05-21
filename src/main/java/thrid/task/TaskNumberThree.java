/***
 *Task 3
 * Create a program, which for three coordinates of the vector calculates unit vector and prints result to the console.
 *
 * For calculating the unit vector, you should calculate the length of source vector and divide each of the coordinates on that length.
 *
 * The formulate for source vector length: Math.sqrt(X X + Y Y + Z * Z)
 *
 * E.g. unit vectors for the (5,0,0) => (1,0,0)
 */

package thrid.task;
import java.util.Arrays;

public class TaskNumberThree {
    static int[] vector =  new int[] {5, 0, 0};

    public static void calculateUnitVector(int[] someVector){
        someVector = vector;
        int lenghtSourceVector = (int)(Math.sqrt(someVector[0]*someVector[0] + someVector[1]*someVector[1] + someVector[2]*someVector[2]));
        int[] unitVector = new int[3];
        for (int i = 0; i < someVector.length; i++){
            unitVector[i] = someVector[i]/lenghtSourceVector;
        }
        System.out.println("Unit vectors for the " + Arrays.toString(someVector) + " => " + Arrays.toString(unitVector));
    }

    public static void main(String[] args) {
        TaskNumberThree.calculateUnitVector(vector);
    }
}
