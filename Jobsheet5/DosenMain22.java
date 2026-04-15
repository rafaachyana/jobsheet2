package Jobsheet5;
import java.util.Scanner;
public class DosenMain22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen22 daftar = new DataDosen22();
        int pilihan;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.next();
                    System.out.print("Nama: ");
                    String nm = sc.next();
                    System.out.print("Jenis Kelamin (true=laki, false=perempuan): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int age = sc.nextInt();
                    daftar.tambah(new Dosen22(kd, nm, jk, age));
                    break;
                case 2:
                    daftar.tampil();
                    break;
                case 3:
                    daftar.sortingASC();
                    System.out.println("Data setelah sorting ASC:");
                    daftar.tampil();
                    break;
                case 4:
                    daftar.sortingDSC();
                    System.out.println("Data setelah sorting DSC:");
                    daftar.tampil();
                    break;
                case 5:
                    System.out.println("Keluar program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan!=5);
        sc.close();
    }
}
