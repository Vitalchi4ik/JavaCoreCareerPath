/**
 * Task 2
 * Create a program, which decomposes 5-digit number to separate digits, from right to left. The number is provided as a parameter to the method. Each digit should be printed to console on a separate line.
 *
 * E.g. 45685 =>
 *
 * 4
 *
 * 5
 *
 * 6
 *
 * 8
 *
 * 5
 * */
package second.task;

public class TaskNumberTwo {
    static int num = 45685;
    public static void decompose(int n){
        String number = String.valueOf(num);
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            System.out.println(j);
        }
    }
    public static void main(String[] args) {
        TaskNumberTwo.decompose(num);
    }
}
