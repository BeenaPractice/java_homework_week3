package homeworkweek_3;
/*
17. Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;
import java.util.Scanner;


public class Programme17 {
    public static void main(String[] args) {
        Programme17 obj = new Programme17();
        obj.numarray();

    }

    public void numarray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int numsize = scanner.nextInt();
        int[] numericArray = new int[numsize];
        System.out.println("Enter the elements of the numeric array:");
        for (int i = 0; i < numsize; i++) {
            numericArray[i] = scanner.nextInt();
        }

        //   Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the string array:");
        int strsize = scanner.nextInt();
        String[] stringArray = new String[strsize];
        System.out.println("Enter the elements of the string array:");
        for (int i = 0; i < strsize; i++) {
            stringArray[i] = scanner.next();
        }
        scanner.close();
       // sortNumericArray(numericArray);
       // sortStringArray(stringArray);
        System.out.println("sorted numeric Array");
        for (int num : numericArray) {
            System.out.println(num + " ");
        }
        System.out.println();
        System.out.println("sorted String Array");
        for (String str : stringArray) {
            System.out.println(str + " ");
        }
        System.out.println();
       // public static void sortStringArray(String[]array){
            Arrays.sort(stringArray);
        }

        public static void sortNumericArray ( int[] array){
    //        Arrays.sort(numericArray);
        }
    }

