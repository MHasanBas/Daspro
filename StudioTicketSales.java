public class StudioTicketSales {
    public static void main(String[] args) {
        int[][] ticketSales = {
                {15, 7, 16, 7, 9, 20, 16},
                {8, 10, 14, 9, 12, 16, 14},
                {9, 4, 13, 11, 8, 9, 29},
                {8, 14, 10, 6, 15, 12, 10}
        };

        int[][] ticketPrices = {
                {30000, 40000},
                {50000, 50000},
                {50000, 75000},
                {60000, 150000}
        };

        String[] studioTypes = {"Reguler", "Dolby Atmos", "IMAX", "Premiere"};
        String[] daysOfWeek = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        System.out.println("Banyaknya tiket terjual pada setiap cabang:");
        for (int i = 0; i < ticketSales.length; i++) {
            int totalTickets = 0;
            for (int j = 0; j < ticketSales[i].length; j++) {
                totalTickets += ticketSales[i][j];
            }
            System.out.println(studioTypes[i] + ": " + totalTickets + " tiket");
        }

        int employeeId = 15;
        int dayIndex = employeeId % 7;
        String dayOfWeek = daysOfWeek[dayIndex];
        double totalSales = 0;
        int totalDays = 0;

        for (int i = 0; i < ticketSales.length; i++) {
            totalSales += ticketSales[i][dayIndex] * ticketPrices[i][dayIndex % 2];
            totalDays += 1;
        }

        double averageSales = totalSales / totalDays;
        System.out.println("\nRata-rata penjualan tiket dalam satu hari (Hari " + dayOfWeek + "): " + averageSales);

        int totalIncome = 0;
        for (int i = 0; i < ticketSales.length; i++) {
            for (int j = 0; j < ticketSales[i].length; j++) {
                totalIncome += ticketSales[i][j] * ticketPrices[i][j % 2];
            }
        }
        System.out.println("\nTotal pemasukan bioskop selama seminggu: " + totalIncome);

        int maxTickets = 0;
        String maxTicketStudio = "";
        String maxTicketDay = "";

        for (int i = 0; i < ticketSales.length; i++) {
            for (int j = 0; j < ticketSales[i].length; j++) {
                if (ticketSales[i][j] > maxTickets) {
                    maxTickets = ticketSales[i][j];
                    maxTicketStudio = studioTypes[i];
                    maxTicketDay = daysOfWeek[j];
                }
            }
        }
        System.out.println("\nTipe studio dan nama hari dengan penjualan tiket tertinggi:");
        System.out.println("Tipe Studio: " + maxTicketStudio);
        System.out.println("Hari: " + maxTicketDay);
        }
        }
