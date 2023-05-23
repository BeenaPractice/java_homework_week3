package homeworkweek_3;

import java.util.Scanner;

/*
Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6 {

    public int oddeven(int num){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = reader.nextInt();
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
       return(num);
    }
    public static void main(String[] args) {
            Programme6 obj = new Programme6();
            obj.oddeven(8);

    }
}
