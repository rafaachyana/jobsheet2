package Jobsheet2;
public class Mahasiswa22 {
    
}
class Mahasiswa {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }
    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }
    void updateIpk(double ipkBaru){
        ipk = ipkBaru;
    }
    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Baik";
        } else if (ipk >= 2.5) {
            return "Cukup";
        } else {
            return "Kurang";
        }
    }
    public Mahasiswa(){    
    }
    public Mahasiswa(String nm, String nim, double ipk, String kelas) {
        nama = nm;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }
}