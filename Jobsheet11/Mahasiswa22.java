package Jobsheet11;

public class Mahasiswa22 {
    String nim, nama, kelas;
    double ipk;
    public Mahasiswa22(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.kelas = kelas;
    }

    public void tampilInformasi() {
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + ipk);
    }
}
