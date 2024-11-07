import java.util.Scanner;

public class Pemilihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas (0-100): ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan nilai UTS (0-100): ");
        double nilaiUTS = scanner.nextDouble();

        System.out.print("Masukkan nilai UAS (0-100): ");
        double nilaiUAS = scanner.nextDouble();

        double nilaiAkhir = 0.2 * nilaiTugas + 0.35 * nilaiUTS + 0.45 * nilaiUAS;

        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
 
        String keterangan = (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) ? "TIDAK LULUS" : "LULUS";

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);

        scanner.close();
    }
}
