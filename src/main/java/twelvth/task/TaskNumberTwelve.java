/**
 * Task 12
 * Create class Point, which set coordinates in a 2-dimension space.
 * Point {
 * float x;
 * float y;
 * float distance(Point pointTo)*;
 * }
 *
 * Determine the method of calculating the distance from a current point to a given point.
 *
 * You can do it by subtracting from one point another point and calculate the length of vector: (x1 - x2; y1 - y2) => sqrt(x’ ^ 2 + y’ ^ 2)
 *
 * 2. Create a class Triangle, which has points of class Point.
 *
 * Provide the following methods:
 *
 * perimeter
 * square
 * type (isosceles, equilateral, rectangular, arbitrary)
 * Triangle {
 * Point a;
 * Point b;
 * Point c;
 *
 * float perimeter();
 * float square();
 * String type();
 * }
 * 3. Generate an array of random triangles (100 000). Get the type of the desired triangle from the user prompt. Get any triangle of that type and print to the console information about it: perimeter, square, type.
 *
 * If the triangle is not found - print a meaningful message about it to the console.
 * */

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
