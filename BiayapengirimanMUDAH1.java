import java.util.Scanner;

public class BiayapengirimanMUDAH1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan berat paket (kg): ");
        double berat = s.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = s.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = s.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = s.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = s.nextDouble();

        // volume paket
        double volume = panjang * lebar * tinggi;

        // biaya pengiriman berdasarkan berat dan jarak
        double biayaBerat;
        if (jarak <= 10) {
            biayaBerat = berat * 4250;
        } else {
            biayaBerat = berat * 6000;
        }

        //biaya tambahan berdasarkan volume
        double biayaVolume = 0;  

        if (volume > 100) {
        biayaVolume = 50000; 
        } 
        else {
            biayaVolume = 0;
        }

        //total biaya
        double totalBiaya = biayaBerat + biayaVolume;

        //hasil
        System.out.println("--- Rincian Biaya Pengiriman ---");
        System.out.println("Berat paket: " + berat + " kg");
        System.out.println("Jarak tempuh: " + jarak + " km");
        System.out.println("Volume paket: " + volume + " cm^3");
        System.out.println("Biaya berdasarkan berat: Rp " + biayaBerat);
        System.out.println("Biaya tambahan volume: Rp " + biayaVolume);
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);
    }
}
