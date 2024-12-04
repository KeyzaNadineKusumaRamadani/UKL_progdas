import java.util.Scanner;

public class FrekuensiArraySULIT3 {
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

        // Menampilkan array
        System.out.print("Array: ");
        for (int angka : array) {
            System.out.print(angka + " ");
        }
        System.out.println("\n");

        // Hitung dan tampilkan frekuensi elemen
        hitungFrekuensi(array);

        s.close(); // Menutup scanner
    }

    public static void hitungFrekuensi(int[] array) {
        // Menampilkan frekuensi setiap elemen
        for (int i = 0; i < array.length; i++) {
            int jumlah = 1;
            // Periksa elemen yang sama dan hitung frekuensinya
            if (array[i] != -1) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        jumlah++;
                        array[j] = -1;
                    }
                }

                System.out.println(array[i] + " muncul " + jumlah + " kali");
            }
        }
    }
}
