package Lab_05WhileLoops;

import java.util.Scanner;

public class Sequence_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int k = 1;

        while (k <= number) {
            System.out.println(k);
            k = 2 * k + 1;
        }
    }
}
