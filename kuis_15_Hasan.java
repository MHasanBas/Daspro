public class kuis_15_Hasan {
    public static void main(String[] args) {
        int[][] penjualanTiket15 = {
                {15, 7, 16, 7, 9, 20, 16},
                {8, 10, 14, 9, 12, 16, 14},
                {9, 4, 13, 11, 8, 9, 29},
                {8, 14, 10, 6, 15, 12, 10}
        };

        int[][] hargaTiket15 = {
                {30000, 40000},
                {50000, 50000},
                {50000, 75000},
                {60000, 150000}
        };

        String[] jenisStudio15 = {"Reguler", "Dolby Atmos", "IMAX", "Premiere"};
        String[] hariPekan15 = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        System.out.println("Banyaknya tiket terjual pada setiap cabang secara harian:");
        for (int i = 0; i < penjualanTiket15.length; i++) {
            System.out.println(jenisStudio15[i] + ":");
            for (int j = 0; j < penjualanTiket15[i].length; j++) {
                System.out.println(hariPekan15[j] + ": " + penjualanTiket15[i][j] + " tiket");
            }
            System.out.println();
        }

         
        int totalWeekdays15 = 0;
        int totalWeekend15 = 0;

        for (int i = 0; i < penjualanTiket15.length; i++) {
            for (int j = 0; j < penjualanTiket15[i].length; j++) {
                if (j < 5) {
                    totalWeekdays15 += penjualanTiket15[i][j];
                } else {
                    totalWeekend15 += penjualanTiket15[i][j];
                }
            }
        }

        System.out.println("\nTotal penjualan tiket weekdays: " + totalWeekdays15);
        System.out.println("Total penjualan tiket weekend: " + totalWeekend15);

        int totalPemasukan15 = 0;
        for (int i = 0; i < penjualanTiket15.length; i++) {
            for (int j = 0; j < penjualanTiket15[i].length; j++) {
                totalPemasukan15 += penjualanTiket15[i][j] * hargaTiket15[i][j % 2];
            }
            
        }
        System.out.println("\nTotal pemasukan bioskop selama seminggu: " + totalPemasukan15);

        int tiketTertinggi15 = 0;
        String studioTiketTertinggi15 = "";
        String hariTiketTertinggi15 = "";

                for (int i = 0; i < penjualanTiket15.length; i++) {
            for (int j = 0; j < penjualanTiket15[i].length; j++) {
                if (penjualanTiket15[i][j] > tiketTertinggi15) {
                    tiketTertinggi15 = penjualanTiket15[i][j];
                    studioTiketTertinggi15 = jenisStudio15[i];
                    hariTiketTertinggi15 = hariPekan15[j];
                }
            }
        }
        System.out.println("\nJenis studio dan nama hari dengan penjualan tiket tertinggi:");
        System.out.println("Jenis Studio: " + studioTiketTertinggi15);
        System.out.println("Hari: " + hariTiketTertinggi15);
    }
}
