import java.util.Scanner;

public class faktorialSEDANG1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // untuk membaca input dari pengguna 

        // Input bilangan dari pengguna
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = s.nextInt();

       //Tujuan: Memastikan bilangan yang dimasukkan pengguna tidak negatif 
       //Jika bilangan negatif, program mencetak pesan error dan tidak melanjutkan perhitungan
        if (bilangan < 0) {
            System.out.println("Eror"); 
        } else {
            // Panggil fungsi hitungFaktorial untuk mendapatkan hasil faktorial
            long hasilFaktorial = hitungFaktorial(bilangan);

            // Hasil
            System.out.println("Faktorial dari " + bilangan + " adalah: " + hasilFaktorial);
        }
    }

    // Fungsi untuk menghitung faktorial
    public static long hitungFaktorial(int bilangan) {
        long faktorial = 1;
        for (int i = 1; i <= bilangan; i++) {
            faktorial *= i; // Mengalikan faktorial dengan i
        }
        return faktorial; // Mengembalikan hasil faktorial
    }
}
