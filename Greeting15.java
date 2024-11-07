public class Greeting15 {
    static void berisalam(){
        System.out.println("Halo! Selamat Pagi");
    }
    static void beriUcapan (String ucapan){
        System.out.println(ucapan);
    }
    public static void main(String[] args){
        berisalam();
        String salam = "Selamat datang di pemrograman Java";
        beriUcapan(salam);
    }       
}
