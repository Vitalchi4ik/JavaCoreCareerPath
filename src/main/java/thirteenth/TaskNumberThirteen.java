package thirteenth;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskNumberThirteen {


    public static int add(int a, int b){
        int sumNum = a + b;
        return sumNum;
    }

    public static int subtract(int a, int b){
        int subtractNum = a - b;
        return subtractNum;
    }

    public static int multiplication(int a, int b){
        int multiplicationNum = a * b;
        return multiplicationNum;
    }

    public static int division(int a, int b){
        int divisionNum = a / b;
        return divisionNum;
    }

    public static int pow(int a, int b){
        int powNum = a ^ b;
        return powNum;
    }

    public static int log (int a){
        int logNum = (int) Math.log(a);
        return logNum;
    }

    public static int sqrt (int a){
        int sqrtNum = (int) Math.sqrt(a);
        return sqrtNum;
    }

    public  void consoleCalculator() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter command with operands, like X + Y or for \"log\" or \"sqt\" like X sqrt: ");
        String str = br.readLine();

        ArrayList<String> stringList = new ArrayList<String>();
        for(String parserStrings : str.split(" "))
        {
            stringList.add(parserStrings);
        }

        if(stringList.size()>3){
            System.out.println("Too much symbols");
        }
        else if (stringList.size()==2){
            int z = Integer.parseInt(stringList.get(0));
            String mathOperator = stringList.get(1);
            int mathRezultForLogSqrt = 0;
            if (mathOperator.equals("log")){
                mathRezultForLogSqrt = log(z);
            }
            else if(mathOperator.equals("sqrt")){
                mathRezultForLogSqrt = sqrt(z);
            }
            System.out.println(mathRezultForLogSqrt);
        }
        else{
            int x = Integer.parseInt(stringList.get(0));
            int y = Integer.parseInt(stringList.get(2));
            String operator = stringList.get(1);
            int result;
            if (operator.equals("+")) {
                result = add(x,y);
            } else if (operator.equals("-")){
                result = subtract(x, y);
            } else if (operator.equals("*")){
                result = multiplication(x, y);
            } else if (operator.equals("/")){
                result = division(x, y);
            } else if (operator.equals("pow")){
                result = pow(x, y);
            } else{
                throw new java.lang.Error("Operator not recognized");
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) throws IOException{
        TaskNumberThirteen taskNumberThirteen = new TaskNumberThirteen();
        taskNumberThirteen.consoleCalculator();
    }
}
