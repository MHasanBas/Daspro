public class FilmMain {
    public static void main(String[] args) {
        Film film1 = new Film();

        film1.judul = "Quantummania Mancing";
        film1.genre = "Action Comedy";
        film1.rate = "Remaja";
        film1.jumlahTiket = 3000;
        film1.hargaTiket = 40000;

        film1.tambahTiket(1);
        film1.kurangTiket(3);
        film1.tampilFilm();

        int income = film1.totalRevenue(4);

        System.out.println("Total penjualan 4 tiket: " + income);

        System.out.println("===========\n");

        Film film2= new Film (" Maniaquantum", "Horor", "Dewasa ", 2000, 40000);
        film2.tampilFilm();

        Film film3= new Film (" Fast X", "Action", "Dewasa ", 2000, 40000);
        film3.tampilFilm();
    }
}
