package homeworkweek_3;

import java.util.Scanner;

/*
10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
 */
public class Programme10 {

    public static void main(String[] args) {
        Programme10 obj = new Programme10();
        obj.Arith();
    }
        public void Arith(){
        Scanner a1 = new Scanner(System.in);
        System.out.println("enter First Number");
        int num1 = a1.nextInt();
        System.out.println("enter Second Number");
        int num2 = a1.nextInt();
        System.out.println("Enter operation (+,-,*,/) : ");
        String symbol = a1.next();
        a1.close();
        if (symbol.equals("+")) {
             int ans = num1 + num2;
            System.out.println(ans);
        } else if (symbol.equals("-")) {
            int ans = num1 - num2;
            System.out.println(ans);
        } else if (symbol.equals("*")) {
            int ans = num1 * num2;
            System.out.println(ans);
        } else if (symbol.equals("/")) {
            int ans = num1 / num2;
            System.out.println(ans);
        }
    }
}





