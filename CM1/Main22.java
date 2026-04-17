package CM1;
import java.util.Scanner;

import Quiz1.buku22;
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
            System.out.println("6. Tambah Data Peminjam Baru");
            System.out.println("7. Tampilkan Statistik");
            System.out.println("0. Keluar");
            System.out.print("pilih: ");
            pilih=sc.nextInt();
            sc.nextLine();

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
                case 6:
                    System.out.print("Masukkan NIM: ");
                    String nim=sc.nextLine().trim();
                    Mahasiswa22 mhsBaru=null;
                    for(Mahasiswa22 m:mhs){
                        if(m.nim.equals(nim)){
                            mhsBaru=m;
                            break;
                        }
                    }
                    if(mhsBaru==null){
                        System.out.println("NIM tidak ditemukan!");
                        break;
                    }
                    System.out.print("Masukkan Kode Buku: ");
                    String kodeInput=sc.nextLine();
                    Buku22 bukuBaru=null;
                    for(Buku22 b:buku){
                        if(b.kodeBuku.equals(kodeInput)){
                            bukuBaru=b;
                            break;
                        }
                    }
                    if(bukuBaru==null){
                        System.out.println("Kode buku tidak ditemukan!");
                        break;
                    }
                    System.out.print("Masukkan Lama Peminjaman: ");
                    int lama=sc.nextInt();
                    Peminjaman22[] pinjamBaru=new Peminjaman22[pinjam.length+1];
                    for(int i=0;i<pinjam.length;i++){
                        pinjamBaru[i]=pinjam[i];
                    }
                    pinjamBaru[pinjam.length]=new Peminjaman22(mhsBaru, bukuBaru, lama);
                    pinjam=pinjamBaru;
                    System.out.println("Data Berhasil Ditambahkan!");
                    break;
                case 7:
                    int totalDenda=0, terlambat=0, tepatWaktu=0;
                    for(Peminjaman22 p:pinjam){
                        totalDenda+=p.denda;
                        if(p.terlambat>0)terlambat++;
                        else tepatWaktu++;
                    }
                    System.out.println("=== STATISTIK PEMINJAMAN ===");
                    System.out.println("Total Denda Keseluruhan: Rp "+totalDenda);
                    System.out.println("Jumlah Peminjaman Terlambat: "+terlambat);
                    System.out.println("Jumlah Peminjaman Tepat Waktu: "+tepatWaktu);
            }
        }while(pilih!=0);
        sc.close();
    }
}
