package CM2;

public class RoyalDelishSystem {
    Pembeli.PembeliNode headAntrian = null, tailAntrian = null;
    Pesanan.PesananNode headPesanan = null, tailPesanan = null;
    int counterAntrian = 1;

    public void tambahAntrian(String nama, String noHp) {
        Pembeli baru = new Pembeli(counterAntrian, nama, noHp);
        Pembeli.PembeliNode nodeBaru = new Pembeli.PembeliNode(baru);

        if (headAntrian == null) {
            headAntrian = tailAntrian = nodeBaru;
        } else {
            tailAntrian.next = nodeBaru;
            nodeBaru.prev = tailAntrian;
            tailAntrian = nodeBaru;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counterAntrian);
        counterAntrian++;
    }

    public void cetakAntrian() {
        System.out.println("=========================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=========================================");
        System.out.printf("%-15s %-15s %-15s\n", "No Antrian", "Nama", "No HP");

        if (headAntrian == null) {
            System.out.println("(Antrian kosong)");
            return;
        }
        Pembeli.PembeliNode temp = headAntrian;
        while (temp != null) {
            System.out.printf("%-15d %-15s %-15s\n", temp.data.noAntrian, temp.data.namaPembeli, temp.data.noHp);
            temp = temp.next;
        }
    }

    public void hapusAntrianDanPesan(int kode, String menu, int harga) {
        if (headAntrian == null) {
            System.out.println("Gagal! Antrian kosong, tidak ada pembeli yang bisa dilayani.");
            return;
        }
        Pembeli orangDepan = headAntrian.data;
        System.out.println(orangDepan.namaPembeli + " telah memesan " + menu);
        headAntrian = headAntrian.next;
        if (headAntrian != null) {
            headAntrian.prev = null;
        } else {
            tailAntrian = null;
        }
        Pesanan pesananBaru = new Pesanan(kode, menu, harga, orangDepan.namaPembeli);
        Pesanan.PesananNode nodePesanan = new Pesanan.PesananNode(pesananBaru);

        if (headPesanan == null) {
            headPesanan = tailPesanan = nodePesanan;
        } else {
            tailPesanan.next = nodePesanan;
            nodePesanan.prev = tailPesanan;
            tailPesanan = nodePesanan;
        }
    }

    public void laporanPesanan() {
        if (headPesanan == null) {
            System.out.println("=========================================");
            System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
            System.out.println("=========================================");
            System.out.println("(Belum ada pesanan yang direkap)");
            return;
        }
        int size = 0;
        Pesanan.PesananNode temp = headPesanan;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        Pesanan.PesananNode[] arr = new Pesanan.PesananNode[size];
        temp = headPesanan;
        for (int i = 0; i < size; i++) {
            arr[i] = temp;
            temp = temp.next;
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j].data.namaPesanan.compareToIgnoreCase(arr[j + 1].data.namaPesanan) > 0) {
                    Pesanan.PesananNode tukar = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tukar;
                }
            }
        }
        System.out.println("=========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("=========================================");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");

        for (Pesanan.PesananNode node : arr) {
            System.out.printf("%-15d %-20s %-10d\n", node.data.kodePesanan, node.data.namaPesanan, node.data.harga);
        }
    }
}