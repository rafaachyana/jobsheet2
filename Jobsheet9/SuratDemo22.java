package Jobsheet9;
import java.util.Scanner;
public class SuratDemo22 {
    public static void main(String[] args) {
        StackSurat22 stack=new StackSurat22(10);
        Scanner sc=new Scanner(System.in);
        int pilih;
        do{
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Lihat Semua Surat");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            pilih=sc.nextInt();
            sc.nextLine();
            switch(pilih){
                case 1:
                    System.out.print("ID Surat: ");
                    String id=sc.nextLine();
                    System.out.print("Nama: ");
                    String nama=sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas=sc.nextLine();
                    System.out.print("Jenis Izin (S=Sakit/I=Izin): ");
                    char jenis=sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi=sc.nextInt();
                    sc.nextLine();
                    if (jenis != 'S'&&jenis!='I'){
                        System.out.println("Jenis izin tidak valid! Gunakan S atau I.");
                        break;
                    }
                    Surat22 surat=new Surat22(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.printf("Surat izin dari %s berhasil diterima.%n", nama);
                    break;
                case 2:
                    Surat22 diproses=stack.pop();
                    if (diproses!=null){
                        String jenisStr=(diproses.jenisIzin=='S')?"Sakit":"Izin";
                        System.out.println("Memproses surat dari: "+diproses.namaMahasiswa);
                        System.out.println("ID Surat: "+diproses.idSurat);
                        System.out.println("Kelas: "+diproses.kelas);
                        System.out.println("Jenis Izin: "+jenisStr);
                        System.out.println("Durasi: "+diproses.durasi+" hari");
                        System.out.println("Status: Surat berhasil divalidasi.");
                    }
                    break;
                case 3:
                    Surat22 terakhir=stack.peek();
                    if (terakhir!=null){
                        String jenisStr=(terakhir.jenisIzin=='S')?"Sakit":"Izin";
                        System.out.println("Surat terakhir masuk:");
                        System.out.println("ID Surat: "+terakhir.idSurat);
                        System.out.println("Nama: "+terakhir.namaMahasiswa);
                        System.out.println("Kelas: "+terakhir.kelas);
                        System.out.println("Jenis Izin: "+jenisStr);
                        System.out.println("Durasi: "+terakhir.durasi+" hari");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama=sc.nextLine();
                    stack.cariSurat(cariNama);
                    break;
                case 5:
                    System.out.println("Daftar semua surat izin ("+stack.count()+" surat):");
                    stack.print();
                    break;
                case 6:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }while(pilih!=6);
        sc.close();
    }
}