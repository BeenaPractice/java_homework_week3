package homeworkweek_3;

import java.util.Scanner;

/*
Write a java program that tells us that Input number is odd or even
 */
public class Programme1 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter a number here");
        int number = input1.nextInt();
        input1.close();
        String result = m1(number);
        System.out.println(number + "The number is " + result);
    }
    public static String m1(int number) {return (number % 2 == 0) ? "even" : "odd";

    }
}
