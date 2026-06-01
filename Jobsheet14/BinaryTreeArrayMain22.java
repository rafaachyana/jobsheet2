package Jobsheet14;

public class BinaryTreeArrayMain22 {
    public static void main(String[] args) {
        BinaryTreeArray22 bta = new BinaryTreeArray22();
        Mahasiswa22 mhs1 = new Mahasiswa22("244160121", "Ali", "A", 3.57);
        Mahasiswa22 mhs2 = new Mahasiswa22("244160185", "Candra", "C", 3.41);
        Mahasiswa22 mhs3 = new Mahasiswa22("244160221", "Badar", "B", 3.75);
        Mahasiswa22 mhs4 = new Mahasiswa22("244160220", "Dewi", "B", 3.35);
        Mahasiswa22 mhs5 = new Mahasiswa22("244160131", "Devi", "A", 3.48);
        Mahasiswa22 mhs6 = new Mahasiswa22("244160205", "Ehsan", "D", 3.61);
        Mahasiswa22 mhs7 = new Mahasiswa22("244160170", "Fizi", "B", 3.86);

        Mahasiswa22[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};        
        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
    }
}