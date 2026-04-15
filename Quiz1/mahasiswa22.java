package Quiz1;
public class mahasiswa22 {
    String nim;
    String nama;
    buku22[] bukuDipinjam=new buku22[2];
    int jumlahDipinjam=0;
    public mahasiswa22(String nim, String nama){
        this.nim=nim;
        this.nama=nama;
    }
    public void tampilkanDataMahasiswa(){
        System.out.println("NIM : "+nim);
        System.out.println("Nama : "+nama);
    }
}

