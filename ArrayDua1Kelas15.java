public class ArrayDua1Kelas15 {
    public static void main(String[] args) {
        
        String[][] pengunjung = new String[4][2];

        pengunjung[0][0] = "Amin"; pengunjung[0][1] = "Bena";
        pengunjung[1][0] = null; pengunjung[1][1] = null; 
        pengunjung[2][0] = "Eka"; pengunjung[2][1] = "Farhan";
        pengunjung[3][0] = null; pengunjung[3][1] = null;

        System.out.printf("%s \t %s\n", pengunjung[0][0], pengunjung[0][1]);
        System.out.printf("%s \t %s\n", pengunjung[1][0], pengunjung[1][1]);
        System.out.printf("%s \t %s\n", pengunjung[2][0], pengunjung[2][1]);
        System.out.printf("%s \t %s\n", pengunjung[3][0], pengunjung[3][1]);
    }
}
