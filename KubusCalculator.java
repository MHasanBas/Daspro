import java.util.Scanner;

public class KubusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        double volume = hitungVolumeKubus(sisi);
        double luasPermukaan = hitungLuasPermukaanKubus(sisi);

        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);

        scanner.close();
    }

    public static double hitungVolumeKubus(double sisi) {
        double volume = Math.pow(sisi, 3);
        return volume;
    }

    public static double hitungLuasPermukaanKubus(double sisi) {
        double luasPermukaan = 6 * Math.pow(sisi, 2);
        return luasPermukaan;
    }
}
