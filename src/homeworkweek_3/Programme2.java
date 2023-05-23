package homeworkweek_3;

import java.util.Scanner;

/*
Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */
public class Programme2 {
    public static void main(String[] args) {
        System.out.println("Enter year here");
        m1();
    }

    public static void m1() {
        Scanner year = new Scanner(System.in);
        int num = year.nextInt();
        if (((num % 4 == 0) && (num % 100 != 0)) || (num % 400 == 0)) {
            System.out.println(num + " is a leap year");
        } else {
            System.out.println(num + "is not a leap year");
        }
    }
}


