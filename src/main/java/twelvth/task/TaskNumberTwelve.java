package twelvth.task;

import java.util.Scanner;

public class TaskNumberTwelve {

    public static void main(String[] args) {
        Triangle [] triangles = new Triangle[100000];
        for (int i = 0; i < triangles.length; i++) {
            triangles[i] = new Triangle();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of triangle: ");
        int arrLen = scanner.nextInt()-1;
        if(arrLen>100000){
            System.out.println("Sorry, wrong number of triangle");
        }
        else{
            if(triangles[arrLen].type().equals("triangle is not valid")){
                System.out.println(triangles[arrLen].type());
            }
            else{
                System.out.println("Perimeter of triangle: " + triangles[arrLen].perimeter());
                System.out.println("Area of triangle: " + triangles[arrLen].square());
                System.out.println("Type of triangle: " + triangles[arrLen].type());
            }
        }
    }
}
