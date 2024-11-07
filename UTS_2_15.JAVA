import java.util.Scanner;
    public class UTS_2_15{
        public static void main (String{}args){
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan panjang garis A: ");
            double a = input.nextDouble();
    
            System.out.print("Masukkan panjang garis B: ");
            double b = input.nextDouble();
    
            System.out.print("Masukkan panjang garis C: ");
            double c = input.nextDouble();
    
            if (a + b > c && b + c > a && c + a > b) {
                System.out.println("SEGITIGA");
    
                int pilihan = 0;
    
                do {
                    System.out.println("Pilih salah satu:");
                    System.out.println("1. Hitung luas segitiga");
                    System.out.println("2. Hitung keliling segitiga");
                    System.out.println("3. Keluar");
    
                    pilihan = input.nextInt();
    
                    if (pilihan == 1) {
                        double s = (a + b + c) / 2;
                        double luas = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    
                        if (luas > 50) {
                            System.out.println("Luas segitiga: " + luas);
                            System.out.println("Segitiga Sangat Luas");
                        } else {
                            System.out.println("Luas segitiga: " + luas);
                            System.out.println("Segitiga tidak Luas");
                        }
                    } else if (pilihan == 2) {
                        double keliling = a + b + c;
                        System.out.println("Keliling segitiga: " + keliling);
                    } else if (pilihan != 3) {
                        System.out.println("Pilihan tidak valid");
                    }
                } while (pilihan != 3);
    
            } else {
                System.out.println("BUKAN SEGITIGA");
        }
    }
}