package execute.here;

import first.task.TaskNumberOne;
import fourth.task.TaskNumberFour;
import second.task.TaskNumberTwo;
import thrid.task.TaskNumberThree;

public class MainMain {
    public static void main(String[] args) {
        System.out.println("Task №1:");
        TaskNumberOne.main(args);
        System.out.println();
        System.out.println("Task №2:");
        TaskNumberTwo.main(args);
        System.out.println("Task №3:");
        TaskNumberThree.main(args);
        System.out.println("Task №4:");
        TaskNumberFour.main(args);
    }
}
