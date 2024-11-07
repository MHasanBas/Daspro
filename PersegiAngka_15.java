import java.util.Scanner;

public class PersegiAngka_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Masukkan nilai N (minimal 5): ");
            n = input.nextInt();
        } while (n < 5);

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }
        System.out.println();

        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = n; j >= 1; j--) {
                    System.out.print(j);
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
        }
        System.out.println();
    }
}
