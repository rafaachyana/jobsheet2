package CM2;

import java.util.Scanner;

public class RoyalDelishMain {
    public static void main(String[] args) {
        RoyalDelishSystem system = new RoyalDelishSystem();
        Scanner in = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n=========================================");
            System.out.println("SISTEM ANTREAN ROYAL DELISH");
            System.out.println("=========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");

            while (!in.hasNextInt()) {
                System.out.println("Input harus berupa angka!");
                System.out.print("Pilih menu : ");
                in.next();
            }
            pilihan = in.nextInt();
            in.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = in.nextLine();
                    System.out.print("No HP        : ");
                    String hp = in.nextLine();
                    system.tambahAntrian(nama, hp);
                    break;

                case 2:
                    system.cetakAntrian();
                    break;

                case 3:
                    System.out.print("Kode Pesanan : ");
                    while (!in.hasNextInt()) {
                        System.out.println("Kode pesanan harus berupa angka!");
                        System.out.print("Kode Pesanan : ");
                        in.next();
                    }
                    int kode = in.nextInt();
                    in.nextLine();
                    System.out.print("Nama Pesanan : ");
                    String menuMakanan = in.nextLine();
                    System.out.print("Harga        : ");
                    while (!in.hasNextInt()) {
                        System.out.println("Harga harus berupa angka!");
                        System.out.print("Harga        : ");
                        in.next();
                    }
                    int harga = in.nextInt();
                    in.nextLine();
                    system.hapusAntrianDanPesan(kode, menuMakanan, harga);
                    break;

                case 4:
                    system.laporanPesanan();
                    break;

                case 0:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid! Silakan pilih menu 0-4.");
            }
        } while (pilihan != 0);
        in.close();
    }
}