import java.util.Scanner;
public class UTS_15_HASAN {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in); 
        int roda2_15 = 0, roda4_15 = 0;
        double totalPendapatan_15 = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (roda 2/4): ");
            int jenisKendaraan_15 = input.nextInt();

            System.out.print("Masukkan plat nomor kendaraan: ");
            String platNomor_15 = input.next();

            double biayaParkir_15 = 0;
            if (jenisKendaraan_15 == 2) {
                biayaParkir_15 = 2000;
                roda2_15++;
            } else if (jenisKendaraan_15 == 4) {
                biayaParkir_15 = 5000;
                roda4_15++;
            } else {
                System.out.println("Jenis kendaraan tidak valid!");
                continue;
            }

            if (platNomor_15.startsWith("N5")) {
                biayaParkir_15 *= 0.5;
            }

            totalPendapatan_15 += biayaParkir_15;
            System.out.println("Biaya parkir: " + biayaParkir_15);
            
            System.out.print("Masukkan kendaraan lagi? (y/n) ");
        } while (input.next().equalsIgnoreCase("y"));


        
        System.out.println("Jumlah kendaraan roda 2= " + roda2_15);
        System.out.println("Jumlah kendaraan roda 4= " + roda4_15);

        double pajak_15 = totalPendapatan_15 * 0.01;
        double totalPendapatanSetelahPajak_15 = totalPendapatan_15 - pajak_15;
        System.out.println("Total pendapatan sebelum pajak: " + totalPendapatan_15);
        System.out.println("Total pajak: " + pajak_15);
        System.out.println("Total pendapatan setelah pajak: " + totalPendapatanSetelahPajak_15);

    }
}

