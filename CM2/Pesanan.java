package CM2;

public class Pesanan {
    String namaPesanan, namaPembeli;
    int kodePesanan, harga;

    public Pesanan(int kodePesanan, String namaPesanan, int harga, String namaPembeli) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.namaPembeli = namaPembeli;
    }

    public static class PesananNode {
        Pesanan data;
        PesananNode prev, next;

        public PesananNode(Pesanan pesanan) {
            this.data = pesanan;
        }
    }
}
