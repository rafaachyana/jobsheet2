package Quiz1;
import java.util.Scanner;
public class Main22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Perpustakaan22 perpustakaan = new Perpustakaan22(10, 10);
        int pilihan;
        do {
            System.out.println("\nMenu Perpustakaan: ");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Tampilkan Peminjam");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1: perpustakaan.inputTambahBuku(sc); break;
                case 2: perpustakaan.inputTambahMahasiswa(sc); break;
                case 3: perpustakaan.inputPinjamBuku(sc); break;
                case 4: perpustakaan.inputKembalikanBuku(sc); break;
                case 5: perpustakaan.tampilkanDaftarPeminjaman(); break;
                case 6: System.out.println("Terima kasih telah menggunakan sistem perpustakaan"); break;
                default: System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 6);
        sc.close();
    }
}
