import java.util.Scanner;
public class tugas01A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas angka: ");
        int batas = input.nextInt();
        int kelipatan = 9;
        int i = 1;
        
        do {
            if (i % kelipatan != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= batas);
    }
}


