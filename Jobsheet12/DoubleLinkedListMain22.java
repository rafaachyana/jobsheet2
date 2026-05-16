package Jobsheet12;
import java.util.Scanner;
public class DoubleLinkedListMain22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList22 list = new DoubleLinkedList22();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data di awal:");
                    list.addFirst(inputMahasiswa22(scan));
                    break;
                case 2:
                    System.out.println("Masukkan data di akhir:");
                    list.addLast(inputMahasiswa22(scan));
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    list.insertAfter(keyNim, inputMahasiswa22(scan));
                    break;
                case 4:
                    System.out.println("Fungsi removeFirst() belum diimplementasikan di Percobaan 1.");
                    break;
                case 5:
                    System.out.println("Fungsi removeLast() belum diimplementasikan di Percobaan 1.");
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        scan.close();
    }

    public static Mahasiswa22 inputMahasiswa22(Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new Mahasiswa22(nim, nama, kelas, ipk);
    }
}