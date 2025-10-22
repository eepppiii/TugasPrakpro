import java.util.Scanner;

public class KafeDoWhile23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaPelanggan;
        int kopi, teh, roti, totalHarga;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000; // harga tetap

        do {
            System.out.print("Masukkan Nama Pelanggan (ketik 'batal' untuk keluar):");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah Kopi: ");
            kopi = sc.nextInt();

            System.out.print("Jumlah Teh: ");
            teh = sc.nextInt();

            System.out.print("Jumlah Roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);

            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            System.out.println("Terima kasih, " + namaPelanggan + "!");

            sc.nextLine(); // bersihkan buffer sebelum nextLine lagi

        } while (true); // ulangi sampai user ketik "batal"

        System.out.println("Semua Transaksi Selesai.");
        sc.close();
    }
}
