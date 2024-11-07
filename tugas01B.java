import java.util.Scanner;
public class tugas01B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas angka: ");
        int batas = input.nextInt();
        int kelipatan = 9;
        int i = 1;
        
        while (i <= batas) {
            if (i % kelipatan != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}

