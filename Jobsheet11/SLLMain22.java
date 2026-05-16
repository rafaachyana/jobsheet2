package Jobsheet11;

public class SLLMain22 {

    public static void main(String[] args) {
        SingleLinkedList22 sll = new SingleLinkedList22();
        Mahasiswa22 mhs1 = new Mahasiswa22("21212203", "Dirga", "4D", 3.6);
        Mahasiswa22 mhs2 = new Mahasiswa22("22212202", "Cintia", "3C", 3.5);
        Mahasiswa22 mhs3 = new Mahasiswa22("23212201", "Bimon", "2B", 3.8);
        Mahasiswa22 mhs4 = new Mahasiswa22("24212200", "Alvaro", "1A", 4.0);

        sll.addFirst(mhs4);
        sll.addLast(mhs1);
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}

