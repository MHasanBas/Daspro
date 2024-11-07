import java.util.Scanner;
public class cobacoba1 { 
    public static void main(String[] args) {
        String[] days = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        String[] types = {"Reguler", "Dolby Atmos", "IMAX", "Premiere"};
        int[][] prices = {
            {15, 7, 16, 7, 9, 20, 16},
            {8, 10, 14, 9, 12, 16, 14},
            {9, 4, 13, 11, 8, 9, 29},
            {8, 14, 10, 6, 15, 12, 10}
        };
        int[] weekdayPrices = {30, 50, 50, 60};
        int[] weekendPrices = {40, 50, 75, 150};

        Scanner scanner = new Scanner(System.in);

        int[][] ticketSales = new int[types.length][days.length];
        int totalRevenue = 0;

        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < days.length; j++) {
                System.out.println("Masukkan jumlah tiket terjual untuk tipe studio " + types[i] + " pada hari " + days[j] + ":");
                ticketSales[i][j] = scanner.nextInt();
            }
        }

        int totalTicketsSold = 0;
        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < days.length; j++) {
                totalTicketsSold += ticketSales[i][j];
            }
        }

        double averageSales = (double) totalTicketsSold / 7;

        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < days.length; j++) {
                totalRevenue += ticketSales[i][j] * prices[i][j] * (days[j].equalsIgnoreCase("Sabtu") || days[j].equalsIgnoreCase("Minggu") ? weekendPrices[i] : weekdayPrices[i]);
            }
        }

        int maxTicketsSold = 0;
        String maxTicketType = "";
        String maxTicketDay = "";

        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < days.length; j++) {
                if (ticketSales[i][j] > maxTicketsSold) {
                    maxTicketsSold = ticketSales[i][j];
                    maxTicketType = types[i];
                    maxTicketDay = days[j];
                }
            }
        }

        System.out.println("a. Banyaknya tiket terjual pada setiap cabang:");
        for (int i = 0; i < types.length; i++) {
            System.out.print(types[i] + ": ");
            for (int j = 0; j < days.length; j++) {
                System.out.print(ticketSales[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("b. Rata-rata penjualan tiket dalam satu hari: " + averageSales);

        System.out.println("c. Total pemasukan bioskop selama seminggu: " + totalRevenue + "k");

        System.out.println("d. Tipe studio dan nama hari dengan penjualan tiket tertinggi:");
        System.out.println("Tipe Studio: " + maxTicketType);
        System.out.println("Hari: " + maxTicketDay);
        }
        }

