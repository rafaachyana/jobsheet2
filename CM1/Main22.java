package CM1;
import java.util.Scanner;
public class Main22 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Mahasiswa22[] mhs={
            new Mahasiswa22("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa22("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa22("22003", "Citra", "Sistem Informasi Bisnis")
        };
        Buku22[] buku={
            new Buku22("B001", "Algoritma", 2020),
            new Buku22("B002", "Basis Data", 2019),
            new Buku22("B003", "Pemrograman", 2021),
            new Buku22("B004", "Fisika", 2024),
        };
        Peminjaman22[] pinjam={
            new Peminjaman22(mhs[0], buku[0], 7),
            new Peminjaman22(mhs[1], buku[1], 3),
            new Peminjaman22(mhs[2], buku[2], 10),
            new Peminjaman22(mhs[2], buku[3], 6),
            new Peminjaman22(mhs[0], buku[1], 4),
        };

        int pilih;
        do{
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("pilih: ");
            pilih=sc.nextInt();

            switch(pilih){
                case 1:
                    System.out.println("Daftar Mahasiswa: ");
                    for(Mahasiswa22 m:mhs)m.tampilMahasiswa();
                    break;
                case 2:
                    System.out.println("Daftar Buku: ");
                    for(Buku22 b:buku)b.tampilBuku();
                    break;
                case 3:
                    System.out.println("Daftar Peminjaman: ");
                    for(Peminjaman22 p:pinjam)p.tampilPeminjaman();
                    break;       
                case 4:
                    for(int i=1;i<pinjam.length;i++){
                        Peminjaman22 key=pinjam[i];
                        int j=i-1;
                        while(j>=0 && pinjam[j].denda<key.denda){
                            pinjam[j+1]=pinjam[j]; 
                            j--;
                        }
                        pinjam[j+1]=key;
                    }
                    System.out.println("Setelah diurutkan(Denda terbesar): ");      
                    for(Peminjaman22 p:pinjam)p.tampilPeminjaman(); 
                    break;
                case 5:
                    System.out.println("Masukkan NIM: ");
                    String cariNIM=sc.next();
                    int left=0, right=pinjam.length-1;
                    boolean ketemu=false;
                    while(left<=right){
                        int mid=(left+right)/2;
                        if(pinjam[mid].mhs.nim.equals(cariNIM)){
                            pinjam[mid].tampilPeminjaman();
                            ketemu=true;
                            break;
                        }else if(pinjam[mid].mhs.nim.compareTo(cariNIM)<0){
                            left=mid+1;
                        }else{ 
                            right=mid-1;
                        }
                    }
                    if(!ketemu)System.out.println("Data tidak ditemukan.");
                    break;      
            }
        }while(pilih!=0);
        sc.close();
    }
}
