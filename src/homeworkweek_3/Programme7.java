package homeworkweek_3;
/*
Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        Programme7 obj = new Programme7();
        obj.comm();
    }

    public void comm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sales id");
        int id = sc.nextInt();
        System.out.println("Enter seller's name");
        String name = sc.next();
        System.out.println("Enter basic sale amount");
        double sal = sc.nextDouble();
        double com;
        if (sal >= 50000) {
            System.out.println("commision is " + sal * 0.35);
        } else if (sal >= 35000) {
            System.out.println("commision is " + sal * 0.20);
        } else if (sal >= 20000) {
            System.out.println("Commision is " + sal * 0.10);
        } else if (sal >= 10000) {
            System.out.println("Commission is " + sal * 0.05);
        } else if (sal < 10000) {
            System.out.println("Commission is " + sal * 0.02);
        }
    }
}
