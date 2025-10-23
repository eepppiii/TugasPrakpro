import java.util.Scanner;

public class ParkirDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenisKendaraan, durasi;
        int totalBayar = 0;
        int tarifMobil = 3000;
        int tarifMotor = 2000;
        int tarifMaks = 12500;

        System.out.println("=== Program Hitung Pembayaran Parkir ===");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("0. Keluar");

        do {
            System.out.print("\nMasukkan jenis kendaraan (1=Mobil, 2=Motor, 0=Keluar): ");
            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                totalBayar = tarifMaks;
            } else if (jenisKendaraan == 1) {
                totalBayar = durasi * tarifMobil;
            } else if (jenisKendaraan == 2) {
                totalBayar = durasi * tarifMotor;
            } else {
                System.out.println("Jenis kendaraan tidak valid!");
                continue;
            }

            System.out.println("Total pembayaran parkir: Rp " + totalBayar);

        } while (true);

        sc.close();
    }
}
