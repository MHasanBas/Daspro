import java.util.Scanner;

public class forKelipatan1D_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, jumlah = 0, counter = 0;

        System.out.print("Masukkan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                System.out.print(i + " ");
                jumlah += i;
                counter++;
            }
        }

        double rataRata = (double) jumlah / counter;
        System.out.println("\nBanyaknya bilangan kelipatan " + kelipatan + ": " + counter);
        System.out.println("Total bilangan kelipatan " + kelipatan + ": " + jumlah);
        System.out.println("Rata-rata bilangan kelipatan " + kelipatan + ": " + rataRata);
    }
}
