import java.util.Scanner;
public class tugas01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas angka: ");
        int batas = input.nextInt();
        int kelipatan = 9;
        
        for (int i = 1; i <= batas; i++) {
            if (i % kelipatan == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
