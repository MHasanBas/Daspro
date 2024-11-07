import java.util.Scanner;

public class doWhileCuti1D_15 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int cuti = 5; 
        char konfirmasi;

        do {
            System.out.print("Apakah anda ingin menggunakan jatah cuti 1 hari (y/t)? ");
            konfirmasi = scan.next().charAt(0);
            if (konfirmasi == 'y' || konfirmasi == 'Y') {
                cuti--;
                System.out.printf("Sisa %d hari.\n", cuti);
                if (cuti == 2) {
                    System.out.println("STOP! Jatah cuti tinggal 2 hari.");
                    break;
                }
            } else if (konfirmasi == 't' || konfirmasi == 'T') {
                System.out.println("Anda telah memilih untuk tidak menggunakan jatah cuti.");
                break;
            } else {
                System.out.println("Input tidak valid, silakan masukkan 'y' atau 't'.");
            }
        } while (cuti > 0);

        if (cuti == 0) {
            System.out.println("Anda telah menggunakan seluruh jatah cuti.");
        
        }
    }
}