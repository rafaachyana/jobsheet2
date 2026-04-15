package Quiz1;
import java.util.Scanner;
public class Perpustakaan22 {
    buku22[] daftarBuku;
    mahasiswa22[] daftarMahasiswa;
    int jumlahBuku=0;
    int jumlahMahasiswa=0;
    public Perpustakaan22(int kapasitasBuku, int kapasitasMahasiswa) {
        daftarBuku = new buku22[kapasitasBuku];
        daftarMahasiswa = new mahasiswa22[kapasitasMahasiswa];
    }
    void inputTambahBuku(Scanner sc) {
        System.out.print("Kode Buku: ");
        String kode = sc.nextLine();
        System.out.print("Judul Buku: ");
        String judul = sc.nextLine();
        System.out.print("Penulis: ");
        String penulis = sc.nextLine();
        daftarBuku[jumlahBuku++] = new buku22(kode, judul, penulis);
        System.out.println("Buku berhasil ditambahkan.");
    }
    void inputTambahMahasiswa(Scanner sc) {
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        daftarMahasiswa[jumlahMahasiswa++] = new mahasiswa22(nim, nama);
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }
    void inputPinjamBuku(Scanner sc) {
        System.out.print("NIM Mahasiswa: ");
        String nim = sc.nextLine();
        System.out.print("Kode Buku: ");
        String kode = sc.nextLine();
        mahasiswa22 mhs = cariMahasiswa(nim);
        buku22 bk = cariBuku(kode);
        if (mhs != null && bk != null) {
            pinjamBuku(mhs, bk);
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
    void inputKembalikanBuku(Scanner sc) {
        System.out.print("NIM Mahasiswa: ");
        String nim = sc.nextLine();
        System.out.print("Kode Buku: ");
        String kode = sc.nextLine();
        mahasiswa22 mhs = cariMahasiswa(nim);
        buku22 bk = cariBuku(kode);
        if (mhs != null && bk != null) {
            kembalikanBuku(mhs, bk);
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
    void pinjamBuku(mahasiswa22 mhs, buku22 bk) {
        if (!bk.statusBuku) {
            System.out.println("Maaf, buku " + bk.judulbuku + " sedang dipinjam.");
            return;
        }
        if (mhs.jumlahDipinjam>=2) {
            System.out.println("Maaf, "+mhs.nama+" sudah meminjam maksimal 2 buku.");
            return;
        }
        mhs.bukuDipinjam[mhs.jumlahDipinjam++] = bk;
        bk.statusBuku = false;
        System.out.println(mhs.nama+" meminjam buku "+bk.judulbuku);
    }
    void kembalikanBuku(mahasiswa22 mhs, buku22 bk) {
        for (int i=0;i<mhs.jumlahDipinjam;i++) {
            if (mhs.bukuDipinjam[i]==bk) {
                for (int j=i;j<mhs.jumlahDipinjam-1;j++) {
                    mhs.bukuDipinjam[j] = mhs.bukuDipinjam[j+1];
                }
                mhs.bukuDipinjam[mhs.jumlahDipinjam-1] = null;
                mhs.jumlahDipinjam--;
                bk.statusBuku = true;
                System.out.println(mhs.nama+" mengembalikan buku "+bk.judulbuku);
                return;
            }
        }
        System.out.println("Buku tidak ditemukan di daftar pinjaman "+mhs.nama);
    }
    void tampilkanDaftarPeminjaman() {
        for (int i=0;i<jumlahMahasiswa;i++) {
            mahasiswa22 mhs = daftarMahasiswa[i];
            System.out.println("Mahasiswa: "+mhs.nama);
            if (mhs.jumlahDipinjam == 0) {
                System.out.println("Tidak ada buku yang dipinjam.");
            } else {
                for (int j=0;j<mhs.jumlahDipinjam;j++) {
                    System.out.println("-"+mhs.bukuDipinjam[j].judulbuku);
                }
            }
        }
    }
    mahasiswa22 cariMahasiswa(String nim) {
        for (int i=0;i<jumlahMahasiswa;i++) {
            if (daftarMahasiswa[i].nim.equals(nim)) return daftarMahasiswa[i];
        }
        return null;
    }
    buku22 cariBuku(String kode) {
        for (int i=0;i<jumlahBuku;i++) {
            if (daftarBuku[i].kodebuku.equals(kode)) return daftarBuku[i];
        }
        return null;
    }
}
