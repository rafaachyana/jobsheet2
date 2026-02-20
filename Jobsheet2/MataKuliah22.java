package Jobsheet2;
public class MataKuliah22 {
    
}
class MataKuliah {
    String nama;
    String kodeMatkul;
    int sks;
    int jumlahJam;

    void tampilkanInformasi(){
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Kode Mata Kuliah: " + kodeMatkul);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }
    void tambahJam(int jam){
        jumlahJam += jam;
    }
    void kurangiJam(int jam){
        jumlahJam -= jam;
    }
    public MataKuliah(){
    }
    public MataKuliah(String nm, String KodeMK, int sks, int jumlahJam) {
        nama=nm;
        kodeMatkul=KodeMK;
        this.sks=sks;
        this.jumlahJam=jumlahJam;
    }
}
