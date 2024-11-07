public class Sort {
    public int[] data;
    public int jumData;

    public Sort(int[] data, int jumData) {
        this.data = new int[jumData];
        this.jumData = jumData;
        for (int i = 0; i < jumData; i++) {
            this.data[i] = data[i];
        }
    }

    public void bubbleSort() {
        int temp=0;
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 1; j < jumData - i; j++) {
                if (data[j-1] > data[j]) {
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }

    public void tampilData() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
           
        }
        
        System.out.println();
    }
}
