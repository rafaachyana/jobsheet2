package Quiz1;
public class buku22 {
    String kodebuku;
    String judulbuku;
    String penulis;
    boolean statusBuku;
    public buku22(String kode, String nama, String penulis) {
        this.kodebuku=kode;
        this.judulbuku=nama;
        this.penulis=penulis;
        this.statusBuku=true;
    }
    public void tampilanDataBuku(){
        System.out.println("kode : "+kodebuku);
        System.out.println("judul buku : "+judulbuku);
        System.out.println("nama penulis : "+penulis);
        System.out.println("Status : "+(statusBuku? "tersedia" : "dipinjam"));
    }
}
