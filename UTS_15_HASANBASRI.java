import java.util.Scanner;
public class UTS_15_HASANBASRI {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int biayaMotor_15 = 2000;
            int biayaMobil_15 = 5000;
            int diskon_15 = 50;
            int pajak_15 = 1;
            int jumlahMotor_15 = 0;
            int jumlahMobil_15 = 0;
            int totalBiaya_15 = 0;
            int totalPajak_15 = 0;
            String jenisKendaraan_15 = "";
            String platNomor_15 = "";
    
            while (true) {
                System.out.print("Masukkan jenis kendaraan (2/4): ");
                jenisKendaraan_15 = input.nextLine();
                System.out.print("Masukkan plat nomor : ");
                platNomor_15 = input.nextLine();
    
                if (jenisKendaraan_15.equals("2")) {
                    totalBiaya_15 += biayaMotor_15;
                    jumlahMotor_15++;
                } else if (jenisKendaraan_15.equals("4")) {
                    totalBiaya_15 += biayaMobil_15;
                    jumlahMobil_15++;
                }
    
                if (platNomor_15.startsWith("N5")) {
                    int diskonBiaya_15 = totalBiaya_15 * diskon_15 / 100;
                    totalBiaya_15 -= diskonBiaya_15;
                }
    
                System.out.print("Apakah ada kendaraan lagi? (y/n): ");
                String jawaban_15 = input.nextLine();
    
                if (jawaban_15.equalsIgnoreCase("n")) {
                    break;
                }
            }
    
            totalPajak_15 = totalBiaya_15 * pajak_15 / 100;
            int totalPendapatan_15 = totalBiaya_15 - totalPajak_15;
    
            System.out.println("Jumlah kendaraan roda 2 adalah " + jumlahMotor_15);
            System.out.println("Jumlah kendaraan roda 4 adalah " + jumlahMobil_15);
            System.out.println("Total pendapatan sebelum pajak : " + totalBiaya_15);
            System.out.println("Total pajak: " + totalPajak_15);
            System.out.println("Total pendapatan setelah pajak : " + totalPendapatan_15);
        }
    }
    