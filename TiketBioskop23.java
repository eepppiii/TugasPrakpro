import java.util.Scanner;

public class TiketBioskop23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int hargaTiket = 50000;
        double totalSemua = 0;       
        int jumlahTiket;
        char lanjut = 'y';            

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (masukkan -1 untuk batal transaksi hari ini): ");

            while (!sc.hasNextInt()) {
                System.out.println("Input tidak valid. Masukkan angka!");
                sc.next(); 
            }
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == -1) { 
                System.out.println("Selesai input transaksi hari ini.");
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif. Silakan input lagi!");
                sc.nextLine(); 
                continue; 
            }

            int totalHarga = jumlahTiket * hargaTiket;
            double diskon = 0.0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalBayar = totalHarga - (totalHarga * diskon);
            totalSemua += totalBayar;

            System.out.println("-----------------------------");
            System.out.println("Jumlah tiket : " + jumlahTiket);
            System.out.println("Harga normal : Rp " + totalHarga);
            System.out.println("Diskon       : " + (int)(diskon * 100) + "%");
            System.out.println("Total bayar  : Rp " + totalBayar);
            System.out.println("-----------------------------");

            sc.nextLine(); 
            System.out.print("Apakah ingin input pelanggan berikutnya? (y/n): ");
            String tmp = sc.nextLine();
            if (tmp.length() > 0) {
                lanjut = tmp.charAt(0);
            } else {
                lanjut = 'n'; 
            }

        } while (lanjut == 'y' || lanjut == 'Y');

        System.out.println("\n=============================");
        System.out.println("Total penjualan hari ini: Rp " + totalSemua);
        System.out.println("=============================");
        sc.close();
    }
}
