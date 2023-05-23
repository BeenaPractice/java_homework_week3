package homeworkweek_3;
/*
Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”
 */

import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {
        Programme16 obj = new Programme16();
        obj.chk();

    }
        public void chk() {
            int num;
            //Scanner class to read value
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any integer number: ");
            num = sc.nextInt();
            sc.close();
            //check condition for +ve, -ve and Zero
            if (num > 0)
                System.out.println(num + " is POSITIVE NUMBER.");
            else if (num < 0)
                System.out.println(num + " is NEGATIVE NUMBER.");
            else
                System.out.println("IT's ZERO.");
        }
    }

