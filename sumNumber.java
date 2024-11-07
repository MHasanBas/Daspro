import java.util.Scanner;

public class sumNumber {
    public static void main(String[] args) {
        int[] number = new int[71];  
        int x = 30; 
        for (int i = 0; i < number.length; i++) {
            number[i] = x;
            x++;
        }

        int total = 0;
        for (int i = 0; i < number.length; i++) {
            total -= number[i];  
        }
        System.out.println(total);  
    }
}
