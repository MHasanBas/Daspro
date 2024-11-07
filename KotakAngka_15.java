import java.util.Scanner;

public class KotakAngka_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Masukkan nilai N (minimal 3): ");
            n = input.nextInt();
        } while (n < 3);
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print(n + " ");
                } 
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
