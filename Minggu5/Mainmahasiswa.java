package Minggu5;
public class Mainmahasiswa{
    public static void main(String[] args){
        Mahasiswa[] data={
            new Mahasiswa("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 90),
            new Mahasiswa("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };
        Mainmahasiswa m = new Mainmahasiswa();
        int utsTertinggi = m.cariUTSTertinggi(data, 0, data.length-1);
        int utsTerendah = m.cariUTSTerendah(data, 0, data.length-1);
        double rataUAS = m.rataRataUAS(data);

        System.out.println("Nilai UTS Tertinggi (DC): "+utsTertinggi);
        System.out.println("Nilai UTS Terendah (DC): "+utsTerendah);
        System.out.println("Rata-rata Nilai UAS (BF): "+rataUAS);
    }
    int cariUTSTertinggi(Mahasiswa[] arr, int l, int r) {
        if (l==r) return arr[l].nilaiUTS;
        int mid=(l+r)/2;
        int kiri=cariUTSTertinggi(arr, l, mid);
        int kanan=cariUTSTertinggi(arr, mid+1, r);
        return Math.max(kiri, kanan);
    }
    int cariUTSTerendah(Mahasiswa[] arr, int l, int r) {
        if (l==r) return arr[l].nilaiUTS;
        int mid=(l+r)/2;
        int kiri=cariUTSTerendah(arr, l, mid);
        int kanan=cariUTSTerendah(arr, mid+1, r);
        return Math.min(kiri, kanan);
    }
    double rataRataUAS(Mahasiswa[] arr) {
        double total=0;
        for (Mahasiswa m:arr) {
            total+=m.nilaiUAS;
        }
        return total/arr.length;
    }
}
