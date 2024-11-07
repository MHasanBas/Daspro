import java.util.Scanner;

public class LingkaranCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();

        double luas = hitungLuasLingkaran(jariJari);

        System.out.println("Luas lingkaran: " + luas);

        scanner.close();
    }

    public static double hitungLuasLingkaran(double jariJari) {
        double luas = Math.PI * Math.pow(jariJari, 2);
        return luas;
    }
}
