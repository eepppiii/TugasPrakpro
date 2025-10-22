import java.util.Scanner;

public class SiakadFor23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            // Menentukan nilai tertinggi dan terendah
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            // Menghitung jumlah mahasiswa yang lulus dan tidak lulus
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        // Menampilkan hasil akhir
        System.out.println("\n===============================");
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah  : " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus     : " + lulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus : " + tidakLulus);
        System.out.println("===============================");
        
        sc.close();
    }
}