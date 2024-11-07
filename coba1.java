import java.util.Scanner;

public class Main coba1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas angka: ");
        int batas = input.nextInt();
        int kelipatan = 6; // Ubah nilai kelipatan sesuai digit terakhir NIM Anda
        
        for (int i = 1; i <= batas; i++) {
            if (i % kelipatan == 0) {
                continue; // Lewati angka kelipatan
            }
            System.out.print(i + " ");
        }
    }
}
