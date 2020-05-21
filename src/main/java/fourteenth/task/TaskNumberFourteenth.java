package fourteenth.task;

import thirteenth.TaskNumberThirteen;
import java.io.IOException;

public class TaskNumberFourteenth extends TaskNumberThirteen {
    public void consoleCalculator() throws IOException, ArithmeticException{
        super.consoleCalculator();
    }

    public static void main(String[] args)throws IOException {
        TaskNumberFourteenth taskNumberFourteenth = new TaskNumberFourteenth();
        taskNumberFourteenth.consoleCalculator();
    }
}
