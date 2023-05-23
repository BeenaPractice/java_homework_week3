package homeworkweek_3;

import java.util.Scanner;

/*
Write a Java program to test if an array contains a specific value.
 */
public class Programme20 {
    public static void main(String[] args) {
        Programme20 obj = new Programme20();
        obj.m1();
    }

    public void m1() {
        Scanner input = new Scanner(System.in);
        int i, x;
        System.out.print("Input the size of the array: ");
        int size = input.nextInt();
        int num[] = new int[size];  /* declaration */

        //  System.out.println("Enter "+ size + " values: \n");
        for (i = 0; i < num.length; i++) {
            System.out.println("Enter Number to add at index " + i + " : ");
            x = input.nextInt();
            num[i] = x;
        }
        System.out.print("Enter the search value: ");
        int search = input.nextInt();
        boolean condition = false;
        for (i = 0; i < num.length; i++) {
            if (num[i] == search) {
                condition = true;
                break;
            }
        }
        if (condition == true) {
            System.out.println("Number is in Array!");
        } else {
            System.out.println("Number is not in array");
        }
    }
}
















