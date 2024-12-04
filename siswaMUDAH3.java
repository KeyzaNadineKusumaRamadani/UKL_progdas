public class siswaMUDAH3 {
    public static void main(String[] args) {
        // Memanggil fungsi cetakPesan untuk setiap nilai dari 50 hingga 1
        for (int i = 50; i >1; i--) {
            cetakpesan(i);
        }
        // Menangani angka 1 secara khusus
        System.out.println("1. saya senang");
    }

    // Fungsi untuk mencetak pesan sesuai dengan kondisi
    public static void cetakpesan(int angka) {
        if (angka % 3 == 0) {
            System.out.println(angka + ". saya angkatan 33");
        } else if (angka % 2  == 0) {
            System.out.println(angka + ". saya anak moklet");
        } else {
            System.out.println(angka + ". saya anak wikusama");
        }
    }
}
