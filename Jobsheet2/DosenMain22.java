package Jobsheet2;
public class DosenMain22 {
    public static void main(String[] args){
        dosen d1 = new dosen();
        d1.idDosen = "WA1";
        d1.nama = "Wosi Asep";
        d1.statusAktif = true;
        d1.tahunBergabung = 2010;
        d1.bidangKeahlian = "Algoritma dan Struktur Data";

        d1.tampilInformasi();
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2024) + " tahun");
        d1.ubahStatusAktif(false);
        d1.ubahKeahlian("Basis Data");
        d1.tampilInformasi();

        dosen d2 = new dosen("S45", "Siuuuuuu", true, 2000, "Pemrograman Objek");
        d2.tampilInformasi();
    }
    
}
