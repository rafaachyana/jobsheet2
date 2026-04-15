package Jobsheet5;
public class DataDosen22 {
    Dosen22[] dataDosen = new Dosen22[10];
    int idx;
    void tambah(Dosen22 dsn) {
        if (idx<dataDosen.length) {
            dataDosen[idx]=dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil() {
        for (Dosen22 d:dataDosen) {
            if (d!=null) {
                d.tampil();
                System.out.println("-------------------");
            }
        }
    }
    void sortingASC() {
        for (int i=0; i<idx-1; i++) {
            for (int j=1; j<idx-i; j++) {
                if (dataDosen[j-1].usia>dataDosen[j].usia) {
                    Dosen22 tmp=dataDosen[j];
                    dataDosen[j]=dataDosen[j-1];
                    dataDosen[j-1]=tmp;
                }
            }
        }
    }
    void sortingDSC() {
        for (int i=0; i<idx-1; i++) {
            int maxIdx=i;
            for (int j=i+1; j<idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen22 tmp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }
    void insertionSort() {
        for (int i=1; i<idx; i++) {
            Dosen22 key = dataDosen[i];
            int j =i-1;
            while (j>=0 && dataDosen[j].usia>key.usia) {
                dataDosen[j+1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = key;
        }
    }
}
