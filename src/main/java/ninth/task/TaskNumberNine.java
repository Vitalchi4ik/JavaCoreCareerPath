/**
 * Task 9
 * The user provides the length of the array as an input parameter. The program should create an array of that length, fill it with random numbers and print an array and all numbers divided by 3 to the console.
 *
 * ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
 * */

package ninth.task;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TaskNumberNine {

    public static ArrayList<Integer> createRandArr(int arrLen){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arrLen; i++) {
            list.add(ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE));
        }
        return list;
    }

    public static void printIsPossibleToMakeDivisible(ArrayList<Integer> arrList) {
        for (int i = 0; i < arrList.size(); i++) {
            if ((arrList.get(i) % 3) == 0) {
                System.out.println(arrList.get(i) + " number divided by 3");
            } else {
                System.out.println(arrList.get(i) + " number not divided by 3");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int arrLen = scanner.nextInt();
        ArrayList<Integer> workList = createRandArr(arrLen);
        printIsPossibleToMakeDivisible(workList);
    }
}
