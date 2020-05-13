package seventh.task;
import java.util.Scanner;

public class TaskNumberSeven {
    public static void main(String[] args) {
        String original = "";
        String reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide the sequence of symbols as a parameter to the program:");
        original = in.nextLine();
        int length = original.length();

        for (int i = length - 1; i >= 0; i-- ){
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}

