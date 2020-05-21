/**
 * Task 8
 * The user enters the string. The program should split the string by words, turn each word "upside-down", make a new string and print it to the console.
 *
 * String[] words = “Sadfsdfs sdfsdf sdfsdf”.split(“ ”);
 * */
package eighth.task;

import java.util.Scanner;

public class TaskNumberEight {
    public static void main(String[] args) {
        String normal = "abcdefghijklmnopqrstuvwxyz_,;.?!/\\'";
        String split  = "ɐqɔpǝɟbɥıظʞןɯuodbɹsʇnʌʍxʎz‾'؛˙¿¡/\\,";

        normal += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        split  += "∀qϽᗡƎℲƃHIſʞ˥WNOԀὉᴚS⊥∩ΛMXʎZ";

        normal += "0123456789";
        split  += "0ƖᄅƐㄣϛ9ㄥ86";

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the string:");
        String str = in.nextLine();

        String newstr = "";
        char letter;
        for (int i=0; i< str.length(); i++) {
            letter = str.charAt(i);
            int a = normal.indexOf(letter);
            newstr += (a != -1) ? split.charAt(a) : letter;
        }

        String[] words = newstr.split(" ");
        for ( String ss : words) {
            System.out.println(ss);
        }
    }
}
