package CM2;

public class Pembeli {
    String noHp, namaPembeli;
    int noAntrian;

    public Pembeli(int noAntrian, String namaPembeli, String noHp) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    public static class PembeliNode {
        Pembeli data;
        PembeliNode prev, next;

        public PembeliNode(Pembeli pembeli) {
            this.data = pembeli;
        }
    }
}
