package homeworkweek_3;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a Java program to sum values of an array.
 */
public class Programme18 {
    public void smu(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the required size of the array : ");
        int size = sc1.nextInt();
        int myArray[] = new int [size];
        int sum = 0;
        System.out.println("Enter the elements of the array one by one ");

        for(int i=0; i<size; i++){
            myArray[i] = sc1.nextInt();
            sum = sum + myArray[i];
        }
        System.out.println("Elements of the array are: "+ Arrays.toString(myArray));
        System.out.println("Sum of the elements of the array ::"+sum);
    }
    public static void main(String args[]){
        Programme18 obj = new Programme18();
        obj.smu();
    }
}


