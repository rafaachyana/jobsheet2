package Jobsheet2;
public class Dosen22 {
    
}
class dosen { 
   String idDosen;
   String nama;
   boolean statusAktif;
   int tahunBergabung;
   String bidangKeahlian;

    void tampilInformasi(){
       System.out.println("ID Dosen: " + idDosen);
       System.out.println("Nama: " + nama);
       System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
       System.out.println("Tahun Bergabung: " + tahunBergabung);
       System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    void ubahStatusAktif(boolean statusSaatIni) {
        statusAktif = statusSaatIni;
    }
    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }
    void ubahKeahlian(String bidangKeahlianBaru) {
        bidangKeahlian = bidangKeahlianBaru;
    }
    public dosen() {
    }
    public dosen(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

}
