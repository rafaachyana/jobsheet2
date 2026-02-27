package Jobsheet3;
public class DataDosen22{
    public static void dataSemuaDosen(Dosen22[] arrayOfDosen){
        for (Dosen22 d:arrayOfDosen){
            String jenisKelamin=d.jenisKelamin?"Pria":"Wanita";
            System.out.println("Kode: " + d.kode);
            System.out.println("Nama: " + d.nama);
            System.out.println("Jenis Kelamin: " + (d.jenisKelamin ? "Pria" : "wanita"));
            System.out.println("Usia: " + d.usia);
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen22[] arrayOfDosen){
        int pria=0, wanita=0;
        for (Dosen22 d:arrayOfDosen){
            if (d.jenisKelamin) pria++;   
            else wanita++;                
        }
        System.out.println("Jumlah Dosen Pria   : "+pria);
        System.out.println("Jumlah Dosen Wanita : "+wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen22[] arrayOfDosen){
        int totalPria=0, jumlahPria=0;
        int totalWanita=0, jumlahWanita=0;

        for (Dosen22 d : arrayOfDosen){
            if (d.jenisKelamin){ 
                totalPria += d.usia;
                jumlahPria++;
            } else{ 
                totalWanita += d.usia;
                jumlahWanita++;
            }
        }
        double rataPria=(jumlahPria>0)?(double) totalPria/jumlahPria:0;
        double rataWanita=(jumlahWanita>0)?(double) totalWanita/jumlahWanita:0;
        System.out.println("Rata-rata Usia Pria   : "+rataPria);
        System.out.println("Rata-rata Usia Wanita : "+rataWanita);
    }
    public static void infoDosenPalingTua(Dosen22[] arrayOfDosen){
        Dosen22 tertua=arrayOfDosen[0];
        for (Dosen22 d:arrayOfDosen){
            if (d.usia>tertua.usia){
                tertua=d;
            }
        }
        String gender=tertua.jenisKelamin?"Pria":"Wanita";
        System.out.println("Dosen Paling Tua: "+tertua.nama+" (" +gender+ "), Usia: "+tertua.usia);
    }
    public static void infoDosenPalingMuda(Dosen22[] arrayOfDosen){
        Dosen22 termuda=arrayOfDosen[0];
        for (Dosen22 d:arrayOfDosen){
            if (d.usia<termuda.usia){
                termuda=d;
            }
        }
        String gender=termuda.jenisKelamin?"Pria":"Wanita";
        System.out.println("Dosen Paling Muda: " +termuda.nama+" (" +gender+ "), Usia: " +termuda.usia);
    }
}
