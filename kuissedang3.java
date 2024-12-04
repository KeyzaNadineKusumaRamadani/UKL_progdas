import java.util.Random;
import java.util.Scanner;

public class kuissedang3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Selamat datang di Kuis Matematika");
        System.out.println("Ketik 'exit' untuk berhenti kapan saja");

        int bilangan1 = 10; 
        int bilangan2 = 9;   
        String[] operators = {"*", "/", "%"};
        
        while (true) {
        
            String operator = operators[random.nextInt(operators.length)];
            int correctAnswer = 0;

            // Tentukan jawaban yang benar berdasarkan operator
            switch (operator) {
                case "*":
                    correctAnswer = bilangan1 * bilangan2;
                    break;
                case "/":
                    if (bilangan1 % bilangan2 != 0) {
                        bilangan1 = bilangan2 * 2;  
                    }
                    correctAnswer = bilangan1 / bilangan2;
                    break;
                case "%":
                    int hasilmodulus = bilangan1 % bilangan2;  
                    int hasilpembagian = bilangan1 / bilangan2; 
                    System.out.println(bilangan1 + " % " + bilangan2 + " = ?");
                    
                    // Menunggu input dari pengguna untuk jawabannya
                    String input = s.nextLine();

                    // Jika pengguna ingin keluar
                    if (input.equalsIgnoreCase("exit")) {
                        System.out.println("Terima kasih telah bermain!");
                        return;
                    }

                    try {
                        int jawabanPengguna = Integer.parseInt(input); // Mengubah input menjadi angka
                        if (jawabanPengguna == hasilmodulus) {
                            System.out.println("Benar!\n");
                        } else {
                            System.out.println("Salah! Jawaban yang benar adalah " + hasilmodulus+ "\n");
                        }
                    } catch (NumberFormatException exit) {
                        System.out.println("Masukkan angka yang valid atau 'exit' untuk keluar");
                    }

                    // Menampilkan hasil pembagian dan sisa pembagian
                    System.out.println("Hasil pembagian: " + hasilpembagian);
                    System.out.println("Sisa pembagian: " + hasilmodulus);
                    break;
            }

            // soal untuk operator lain (perkalian, pembagian)
            if (operator != "%") {
                System.out.println(bilangan1 + " " + operator + " " + bilangan2 + " = ?");
                String input = s.nextLine();

                // user ingin keluar
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Terima kasih telah bermain!");
                    break;
                }

                //  Memeriksa apakah input pengguna adalah angka yang valid
                try {
                    int jawabanPengguna = Integer.parseInt(input); // Mengubah input menjadi angka
                    if (jawabanPengguna == correctAnswer) {
                        System.out.println("Benar!\n");
                    } else {
                        System.out.println("Salah! Jawaban yang benar adalah " + correctAnswer + "");
                    }
                } catch (NumberFormatException exit) {
                    System.out.println("Masukkan angka yang valid atau 'exit' untuk keluar.");
                }
            }

            // Update nilai bilangan untuk soal berikutnya
            bilangan1++;
            bilangan2++;
        }

        s.close();
    }
}
                
            