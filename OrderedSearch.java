public class OrderedSearch {
    public double[] arr;

    public OrderedSearch(double arrayNilai[]) {
        arr = new double[arrayNilai.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrayNilai[i];
        }
    }

    public int cari(double keyword) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (keyword == arr[i]) {
                index = i;
                break;
            } else {
                if (keyword < arr[i]) {
                    break;
                }
            }
        }
        return index;
    }

    public void tampilkan() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
