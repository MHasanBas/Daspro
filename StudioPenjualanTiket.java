public class StudioPenjualanTiket {
    public static void main(String[] args) {
        int[][] penjualanTiket = {
                {15, 7, 16, 7, 9, 20, 16},
                {8, 10, 14, 9, 12, 16, 14},
                {9, 4, 13, 11, 8, 9, 29},
                {8, 14, 10, 6, 15, 12, 10}
        };

        int[][] hargaTiket = {
                {30000, 40000},
                {50000, 50000},
                {50000, 75000},
                {60000, 150000}
        };

        String[] jenisStudio = {"Reguler", "Dolby Atmos", "IMAX", "Premiere"};
        String[] hariPekan = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        System.out.println("Banyaknya tiket terjual pada setiap cabang:");
        for (int i = 0; i < penjualanTiket.length; i++) {
            int totalTiket = 0;
            for (int j = 0; j < penjualanTiket[i].length; j++) {
                totalTiket += penjualanTiket[i][j];
            }
            System.out.println(jenisStudio[i] + ": " + totalTiket + " tiket");
        }

        int nomorAbsen = 15;
        int indeksHari = nomorAbsen % 7;
        String hari = hariPekan[indeksHari];
        double totalPenjualan = 0;
        int totalHari = 0;

        for (int i = 0; i < penjualanTiket.length; i++) {
            totalPenjualan += penjualanTiket[i][indeksHari] * hargaTiket[i][indeksHari % 2];
            totalHari += 1;
        }

        double rataPenjualan15 = totalPenjualan15 / totalHari15;
        System.out.println("\nRata-rata penjualan tiket dalam satu hari (Hari " + hari15 + "): " + rataPenjualan15);

        int totalPemasukan = 0;
        for (int i = 0; i < penjualanTiket.length; i++) {
            for (int j = 0; j < penjualanTiket[i].length; j++) {
                totalPemasukan += penjualanTiket[i][j] * hargaTiket[i][j % 2];
            }
        }
        System.out.println("\nTotal pemasukan bioskop selama seminggu: " + totalPemasukan);

        int tiketTertinggi = 0;
        String studioTiketTertinggi = "";
        String hariTiketTertinggi = "";

        for (int i = 0; i < penjualanTiket.length; i++) {
            for (int j = 0; j < penjualanTiket[i].length; j++) {
            if (penjualanTiket[i][j] > tiketTertinggi) {
            tiketTertinggi = penjualanTiket[i][j];
            studioTiketTertinggi = jenisStudio[i];
            hariTiketTertinggi = hariPekan[j];
            }
            }
            }
            System.out.println("\nJenis studio dan nama hari dengan penjualan tiket tertinggi:");
            System.out.println("Jenis Studio: " + studioTiketTertinggi);
            System.out.println("Hari: " + hariTiketTertinggi);
            }
            }
