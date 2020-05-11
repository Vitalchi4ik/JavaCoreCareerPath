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
