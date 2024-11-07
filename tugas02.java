public class tugas02 {
    public static void main(String[] args) {
        int hargaAnak = 50000;
        int hargaDewasa = 100000;
        int jumlahAnak = 5;
        int jumlahDewasa = 5;
        int totalPemasukan = 0;
        
        for (int tanggal = 1; tanggal <= 31; tanggal++) {
            if (tanggal % 7 == 0) {
                continue;
            }
            
            int pemasukanAnak = jumlahAnak * hargaAnak;
            int pemasukanDewasa = jumlahDewasa * hargaDewasa;
            int pemasukanHariIni = pemasukanAnak + pemasukanDewasa;
            totalPemasukan += pemasukanHariIni;
            
            System.out.println("Pemasukan hari ke-" + tanggal + ": Rp " + pemasukanHariIni);
        }
        
        System.out.println("Total pemasukan bulan Agustus 2022: Rp " + totalPemasukan);
    }
}

