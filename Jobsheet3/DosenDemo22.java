package Jobsheet3;
import java.util.Scanner;
public class DosenDemo22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Dosen22[] arrayofDosen22=new Dosen22[3];
        String kode,nama;
        boolean jenisKelamin;
        int usia;
        for(int i=0;i<3;i++){
            System.out.println("Masukkan data dosen ke-"+(i+1));
            System.out.print("Kode Dosen : ");
            kode=sc.nextLine();
            System.out.print("Nama Dosen : ");
            nama=sc.nextLine();
            System.out.print("Jenis Kelamin ( true= laki-laki, false= perempuan): ");
            jenisKelamin=sc.nextBoolean();
            System.out.print("Usia Dosen : ");
            usia=sc.nextInt();
            sc.nextLine(); // consume newline
            arrayofDosen22[i]=new Dosen22(kode,nama,jenisKelamin,usia);
        }
        System.out.println("\nData Dosen yang telah dimasukkan:");
        for(int i=0;i<3;i++){
            System.out.println("Kode Dosen: "+arrayofDosen22[i].kode);
            System.out.println("Nama Dosen: "+arrayofDosen22[i].nama);
            System.out.println("Jenis Kelamin: "+(arrayofDosen22[i].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia Dosen: "+arrayofDosen22[i].usia);
            System.out.println("---------------------------------------");
        }
        System.out.println("\nDATA SEMUA DOSEN:");
        DataDosen22.dataSemuaDosen(arrayofDosen22);
        System.out.println("\nJUMLAH DOSEN PER JENIS KELAMIN:");
        DataDosen22.jumlahDosenPerJenisKelamin(arrayofDosen22);
        System.out.println("\nRATA-RATA USIA DOSEN PER JENIS KELAMIN:");
        DataDosen22.rerataUsiaDosenPerJenisKelamin(arrayofDosen22);
        System.out.println("\nINFO DOSEN PALING TUA:");
        DataDosen22.infoDosenPalingTua(arrayofDosen22);
        System.out.println("\nINFO DOSEN PALING MUDA:");
        DataDosen22.infoDosenPalingMuda(arrayofDosen22);
        sc.close();
    }
    
}
