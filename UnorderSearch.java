import java.util.Scanner;

public class UnorderSearch {
    static int search(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrInt = {10, 5, 20, 2, 11, 8, 4, 15};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int cari = scanner.nextInt();
        
        int hasil = search(arrInt, cari);
        
        if (hasil == -1)
            System.out.println("Elemen " + cari + " tidak ditemukan");
        else
            System.out.println("Elemen " + cari + " ditemukan pada posisi ke-" + hasil);
    }
}




