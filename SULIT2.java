import java.util.Scanner;

public class SULIT2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int Array = s.nextInt();

        // Input elemen array
        int[] array = new int[Array];
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < Array; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = s.nextInt();
        }

        // Tampilkan array
        System.out.print("Array: ");
        for (int angka : array) {
            System.out.print(angka + " ");
        }
        System.out.println("\n");

        // Cek duplikat
        cekDuplikat(array);

        s.close();
    }

    // Fungsi untuk memeriksa apakah ada elemen duplikat dalam array
    public static void cekDuplikat(int[] array) {
        System.out.print("Elemen duplikat: ");
        int jumlahDuplikat = 0; // Digunakan untuk mencatat jumlah elemen duplikat

        // Perulangan untuk membandingkan setiap elemen dengan elemen lainnya
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    jumlahDuplikat++;
                    break; // Hindari pencetakan elemen yang sama berulang kali
                }
            }
        }

        // Menentukan hasil akhir
        if (jumlahDuplikat == 0) {
            System.out.println("Tidak ada elemen duplikat.");
        } else {
            System.out.println("\nArray memiliki elemen duplikat.");
        }
    }
}
