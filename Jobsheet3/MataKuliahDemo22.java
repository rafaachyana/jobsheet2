package Jobsheet3;
import java.util.Scanner;
public class MataKuliahDemo22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        MataKuliah22[] arrayOfMataKuliah=new MataKuliah22[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i=0; i<jumlah; i++){
            System.out.println("Masukkan Data Matakuliah ke-"+(i+1));
            System.out.print("Kode     : ");
            kode = sc.nextLine();
            System.out.print("Nama     : ");
            nama = sc.nextLine();
            System.out.print("SKS      : ");
            dummy=sc.nextLine();
            sks=Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy=sc.nextLine();
            jumlahJam=Integer.parseInt(dummy);
            System.out.println("---------------------------------------");
            arrayOfMataKuliah[i]=new MataKuliah22(kode, nama, sks, jumlahJam);
            arrayOfMataKuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        for (int i=0; i<3; i++){
            System.out.println("Data Matakuliah ke-"+(i+1));
            System.out.println("Kode     : "+arrayOfMataKuliah[i].kode);
            System.out.println("Nama     : "+arrayOfMataKuliah[i].nama);
            System.out.println("SKS      : "+arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam : "+arrayOfMataKuliah[i].jumlahJam);
            System.out.println("---------------------------------------");
        }
        
        for (int i = 0; i < jumlah; i++){
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
        }
        sc.close();
    } 
}
