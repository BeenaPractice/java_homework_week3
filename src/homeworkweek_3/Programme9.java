package homeworkweek_3;

import java.util.Scanner;

/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */
public class Programme9 {
    public static void main(String[] args) {
        Scanner alphabet = new Scanner(System.in);
        System.out.println("Enter alphabet  A to F:");
        String a1 = alphabet.next();
        city(a1);
    }
    public static void city(String a1){
        switch(a1){
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Bombay");
                break;
            case "C":
                System.out.println("Calcutta");
                break;
            case "D":
                System.out.println("Delhi");
                break;
            case "E":
                System.out.println("Ernakulam");
                break;
            case "F":
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
