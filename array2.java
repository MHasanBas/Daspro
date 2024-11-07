public class array2 {
  public static void main (String []args){
   // Mendeklarasikan array 2 dimensi dengan ukuran 3x3
   int[][] array2D = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

   // Mengakses dan mencetak elemen-elemen dalam array 2 dimensi
   System.out.println("Isi array 2 dimensi:");
   for (int i = 0; i < array2D.length; i++) {
       for (int j = 0; j < array2D[i].length; j++) {
           System.out.print(array2D[i][j] + " ");
       }
     
   }
   
   // Mengakses elemen individu dalam array 2 dimensi
   int nilai5 = array2D[1][1];
   System.out.println("Elemen pada indeks baris 1 dan indeks kolom 1: " + nilai5);
}
}   