public class Main15 {
    public static void main(String[] args) {
        int[] a = {15, 10, 7, 22, 5};
       
        Sort urut = new Sort(a, a.length);
       
        System.out.println("data sebelum urut");
         urut.tampilData();
        System.out.println("data sesudah urut Buble sort (Asc)");
         urut.bubbleSort();
         urut.tampilData();
    }
}
