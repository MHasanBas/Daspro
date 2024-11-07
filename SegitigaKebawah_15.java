import java.util.Scanner;

public class SegitigaKebawah_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Masukkan nilai N (minimal 5): ");
            n = input.nextInt();
        } while (n < 5);
        
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
