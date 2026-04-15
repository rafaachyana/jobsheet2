package CM1;

public class Buku22 {
    String kodeBuku, judul;
    int tahunTerbit;
    Buku22(String kode, String judul, int tahun){
        this.kodeBuku=kode;
        this.judul=judul;
        this.tahunTerbit=tahun;
    }
    void tampilBuku(){
        System.out.println("Kode: "+kodeBuku+" | Judul: "+judul+" | Tahun: "+tahunTerbit);
    }
}
