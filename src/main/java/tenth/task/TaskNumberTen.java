/**
 * Task 10
 * The program prompts name, surname, mobile phone number, email from the user and performs validation of the parameters using regular expressions.
 *
 * Name, Surname - only English letters, - and space.
 *
 * Phone - country code (UA|RO) and 7 any digits
 *
 * email - English letters, numeric, -, underscore, @.
 *
 * Print invalid data to the console.
 * */
package tenth.task;

import java.util.Scanner;

public class TaskNumberTen {
    public static boolean isStringOnlyAlphabet(String str)
    {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[a-zA-Z]+(\\s[a-zA-Z]+)?$")));
    }

    public static boolean isNumberPhoneOnlyRoUa(String str)
    {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^\\+?3?8?(0\\d{9})$"))
                ||(str.matches("^\\+?4?(0\\d{10})$")));
    }

    public static boolean isEmailValid(String str)
    {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")));
    }

    public static void main(String[] args) {
        String nameSurname;
        String numberPhone;
        String emailString;

        Scanner name = new Scanner(System.in);
        System.out.println("Please enter your name and surname:");
        nameSurname = name.nextLine();
        System.out.println("Name and Surname " + nameSurname + " is " + (isStringOnlyAlphabet(nameSurname)  ? "valid" : "invalid"));

        Scanner phone = new Scanner(System.in);
        System.out.println("Please enter number phone:");
        numberPhone = phone.nextLine();
        System.out.println("Phone number " + numberPhone + " is " + (isNumberPhoneOnlyRoUa(numberPhone) ? "valid" : "invalid"));

        Scanner email = new Scanner(System.in);
        System.out.println("Please enter your email:");
        emailString = email.nextLine();
        System.out.println("Email " + emailString + " is " + (isEmailValid(emailString) ? "valid" : "invalid"));
    }
}
