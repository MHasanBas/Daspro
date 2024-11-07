public class Penduduk {
    private String nik;
    private String nama;
    private String alamat;
    private String jenisKelamin;

    public Penduduk(String nik, String nama, String alamat, String jenisKelamin) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }
}
