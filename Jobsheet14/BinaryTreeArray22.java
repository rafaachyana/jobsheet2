package Jobsheet14;

public class BinaryTreeArray22 {
    Mahasiswa22[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray22() {
        this.dataMahasiswa = new Mahasiswa22[10];
    }

    void populateData(Mahasiswa22 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);                
                dataMahasiswa[idxStart].tampilInformasi();                
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}