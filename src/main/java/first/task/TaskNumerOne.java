package first.task;

public class TaskNumerOne {

    static int x = 29;
    static int y = 452;
    static int z = 212;
    static int n = 1;

    public static long longEquation(int x, int y, int z, int n){
        long Equation = (long)(x - (y + 123) / z * n);
        return Equation;
    }

    public static int intEquation(int x, int y, int z, int n){
        int Equation = ((x + (50 - y * z) / n) - x);
        return Equation;
    }

    public static float floatEquation(int x, int y, int z, int n){
        float Equation = (float)(x / (y * (z - 1) - 564) + n);
        return Equation;
    }

    public static double doubleEquation(int x, int y, int z, int n){
        double Equation = (double)(-x / -y + z / (n + 15));
        return Equation;
    }

    public static void main(String[] args) {
        System.out.println("Long eqution is " + longEquation(TaskNumerOne.x, TaskNumerOne.y, TaskNumerOne.z, TaskNumerOne.n) + "L");
        System.out.println("Int equation is " + intEquation(TaskNumerOne.x, TaskNumerOne.y, TaskNumerOne.z, TaskNumerOne.n));
        System.out.println("Float equation is " + floatEquation(TaskNumerOne.x, TaskNumerOne.y, TaskNumerOne.z, TaskNumerOne.n) + "f");
        System.out.println("Double equation is " + doubleEquation(TaskNumerOne.x, TaskNumerOne.y, TaskNumerOne.z, TaskNumerOne.n));
    }
}
