import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selamat datang di sistem pembelian tiket kereta api!");
        System.out.println("PG - Jakarta-Malang Eksekutif");
        System.out.println("SG - Jakarta-Malang Bisnis");
        System.out.println("MG - Jakarta-Malang Luxury");
        System.out.println("Silakan pilih kode keberangkatan:");
        String kode = scanner.next();
        
        double harga;
        String tipeKelas;
        if (kode.equals("PG")) {
            harga = 1250000;
            tipeKelas = "Eksekutif";
        } else if (kode.equals("SG")) {
            harga = 1375000;
            tipeKelas = "Bisnis";
        } else if (kode.equals("MG")) {
            harga = 2500000;
            tipeKelas = "Luxury";
        } else {
            System.out.println("Kode keberangkatan salah!");
            return;
        }
        
        double biayaAdmin = 50000;
        double totalBiaya = harga + biayaAdmin;
        
        System.out.println("Kode keberangkatan: " + kode);
        System.out.println("Tipe kelas kereta yang dibeli: " + tipeKelas);
        System.out.println("Biaya Tiket: " + harga);
        System.out.println("Total Bayar beserta administrasi: " + totalBiaya);
    }
}


