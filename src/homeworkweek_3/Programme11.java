package homeworkweek_3;

/*
Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.
 */
public class Programme11 {
    public static void main(String[] args) {
        Programme11 obj = new Programme11();
        obj.exercise();
    }

    public void exercise() {
        System.out.println("Divided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
        System.out.println("Divided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}


