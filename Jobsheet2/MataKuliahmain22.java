package Jobsheet2;
public class MataKuliahmain22 {
    public static void main(String[] args){
        MataKuliah mk1 = new MataKuliah();
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.kodeMatkul = "ASD10";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(5);
        mk1.tambahJam(4);
        mk1.tampilkanInformasi();

        MataKuliah mk2=new MataKuliah("Basis Data", "BD01", 4, 8);
        mk2.ubahSKS(2);
        mk2.kurangiJam(4);
        mk2.tampilkanInformasi();
    }
    
}
