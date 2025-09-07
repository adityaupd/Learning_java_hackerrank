import java.util.Scanner;

public class Java_Output_Formating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String word = sc.next();
            int number = sc.nextInt();
            System.out.printf("%-15s%03d%n", word, number);
        }
        System.out.println("================================");

        sc.close();
    }
}
