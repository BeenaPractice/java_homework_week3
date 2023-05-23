package homeworkweek_3;

import java.util.Scanner;

/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */
public class Programme8 {
    public static void main(String[] args) {
        Scanner alphabet = new Scanner(System.in);
        System.out.println("Enter alphabet  A to F:");
        String a1 = alphabet.next();
        city(a1);
    }
    public static void city(String a1) {
        if (a1.equals("A")) {
            System.out.println("Ahmedabad");
        } else if (a1.equals("B")){
            System.out.println("Bombay");
        } else if (a1.equals("C")) {
            System.out.println("Calcutta");
        } else if (a1.equals("D")){
            System.out.println("Delhi");
        } else if (a1.equals("E")){
            System.out.println("Ernakulam");
        } else if (a1.equals("F")) {
            System.out.println("Faridabad");
        } else {
                System.out.println("Invalid Entry");
        }
    }
}


