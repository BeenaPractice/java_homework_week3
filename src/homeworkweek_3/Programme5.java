package homeworkweek_3;

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {
        Programme5 obj = new Programme5();
        obj.wap();
    }

    public void wap(){
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter employee id");
        int id = sc.nextInt();
        System.out.println("Enter Employee name");
        String name = sc.next();
        System.out.println("Enter basic Salary");
        int sal = sc.nextInt();
        double hra = sal*0.10;
        double da = sal*0.08;
        double ta = sal*0.09;
        double pf = sal*0.20;
        double gs = sal+hra+da+ta+pf;
        System.out.println("-------------------------------");
        System.out.println("|       Salary Slip            |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id :" + id + "      |");
        System.out.println("| Employee Name :" + name + "  |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary : "+sal+ "      |");
        System.out.println("| HRA 10% : " +hra+ "          |");
        System.out.println("| TA 8% : "+ ta +             "|");
        System.out.println("| TA 8% : "+ da +" |");
        System.out.println("| PF - 20& :"+ pf +" |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary : "+ gs+" |");
        System.out.println("|===========================|");

    }
}
