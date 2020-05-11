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
