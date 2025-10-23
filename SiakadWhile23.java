import java.util.Scanner;

public class SiakadWhile23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jml, nilai;
        int i = 0;

        System.out.print("Masukkan Jumlah Mahasiswa :");
        jml = sc.nextInt();

        while (i < jml) {
            while (true) { // loop untuk input valid
                System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
                nilai = sc.nextInt();

                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                } else {
                    break; // keluar dari loop jika input valid
                }
            }
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai Mahasiswa ke- " + (i + 1) + " Adalah A" + " Bagus, Pertahankan Nilainya");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai Mahasiswa ke- " + (i + 1) + " Adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai Mahasiswa ke- " + (i + 1) + " Adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai Mahasiswa ke- " + (i + 1) + " Adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai Mahasiswa ke- " + (i + 1) + " Adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai Mahasiswa ke- " + (i + 1) + " Adalah D");
            } else {
                System.out.println("Nilai Mahasiswa ke- " + (i + 1) + " Adalah E");
            }
            i++;

        }
        sc.close();
    }
}
