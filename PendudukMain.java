import java.util.Scanner;

public class PendudukMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah penduduk: ");
        int jumlahPenduduk = sc.nextInt();

        Penduduk[] pendudukArr = new Penduduk[jumlahPenduduk];

        for (int i = 0; i < jumlahPenduduk; i++) {
            System.out.println("Penduduk ke-" + (i + 1));
            sc.nextLine(); // Membersihkan newline di buffer

            System.out.print("NIK: ");
            String nik = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Alamat: ");
            String alamat = sc.nextLine();

            System.out.print("Jenis Kelamin: ");
            String jenisKelamin = sc.nextLine();

            pendudukArr[i] = new Penduduk(nik, nama, alamat, jenisKelamin);
        }

        // Menampilkan data penduduk
        for (int i = 0; i < jumlahPenduduk; i++) {
            System.out.println("Penduduk ke-" + (i + 1));
            System.out.println("NIK: " + pendudukArr[i].getNik());
            System.out.println("Nama: " + pendudukArr[i].getNama());
            System.out.println("Alamat: " + pendudukArr[i].getAlamat());
            System.out.println("Jenis Kelamin: " + pendudukArr[i].getJenisKelamin());
            System.out.println();
        }
    }
}
