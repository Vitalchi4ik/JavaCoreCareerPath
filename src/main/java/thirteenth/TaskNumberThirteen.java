package thirteenth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskNumberThirteen {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter command with operands, like X + Y: ");
            String str = br.readLine();

            ArrayList<String> stringList = new ArrayList<String>();
            for(String parserStrings : str.split(" "))
            {
                stringList.add(parserStrings);
            }
            if(stringList.size()>3){
                System.out.println("Too much symbols");
            }
            else{
                int x = Integer.parseInt(stringList.get(0));
                int y = Integer.parseInt(stringList.get(2));
                String operator = stringList.get(1);
                int result;
                if (operator.equals("+")) {
                    result = x + y;
            } else if (operator.equals("-")){
                    result = x - y;
            } else if (operator.equals("*")){
                    result = x * y;
            } else if (operator.equals("/")){
                    result = x/y;
            } else{
                throw new java.lang.Error("Operator not recognized");
            }
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
