package fourth.task;
import java.util.Scanner;

public class TaskNumberFour {

    static String stars = "********************************";
    static String text1 = "Course: Java core";
    static String text2 = "Student";
    static String space = " ";

    static int lengthOfStars = stars.length();
    static int lengthOfText1 = text1.length();
    static int lengthOfText2 = text2.length();

    public static void printCourseText(){
        int count = (lengthOfStars-lengthOfText1)/2;
        while(count!=0){
            System.out.print(space);
            count--;
        }
        System.out.println(text1);
    }

    public static void printStudentText(){
        int count = (lengthOfStars-lengthOfText2)/2;
        while(count!=0){
            System.out.print(space);
            count--;
        }
        System.out.println(text2);
    }

    public static void printNameText(String name, String surname){
        String text3 = name + " " + surname;
        int lengthOfText3 = text3.length();
        int count = (lengthOfStars-lengthOfText3)/2;
        if((lengthOfStars-lengthOfText3)>0){
            while (count != 0) {
                System.out.print(space);
                count--;
            }
        }
        System.out.println(text3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your surname:");
        String surname = scanner.nextLine();
        System.out.println(stars);
        System.out.println();
        printCourseText();
        System.out.println();
        printStudentText();
        System.out.println();
        printNameText(name, surname);
        System.out.println();
        System.out.println(stars);
    }
}
