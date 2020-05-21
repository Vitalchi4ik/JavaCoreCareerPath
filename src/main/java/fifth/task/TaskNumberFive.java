/***
 * Task 5
 * Create a program that gets the number of type long as a parameter and calculates the lowest and biggest digit in its number. Print results in a console.
 *
 * E.g. for 15875 => lowest is 1, biggest is 8
 */
package fifth.task;

public class TaskNumberFive {
    static void Numbers(int n){
        int biggest = 0;
        int lowest = 9;

        while(n != 0){
            int i = n % 10;

            lowest = Math.min(i, lowest);
            biggest = Math.max(i, biggest);
            n = n/10;
        }
        System.out.println("Lowest is " + lowest + ", Biggest is " + biggest);
    }

    public static void main(String[] args) {
        int num = 15875;
        Numbers(num);
    }
}
