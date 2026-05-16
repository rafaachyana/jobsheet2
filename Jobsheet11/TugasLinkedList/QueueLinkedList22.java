package Jobsheet11.TugasLinkedList;

public class QueueLinkedList22 {
    NodeQueue22 front, rear;
    int size;

    public QueueLinkedList22() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void enqueue(Mahasiswa22 mhs) {
        NodeQueue22 newNode = new NodeQueue22(mhs, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa masuk antrian: " + mhs.nama);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa memanggil.");
        } else {
            System.out.print("Mahasiswa dipanggil: ");
            front.data.tampilInformasi();
            front = front.next;
            size--;
            if (front == null) rear = null;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terdepan: ");
            front.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terakhir: ");
            rear.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Isi Antrian:");
            NodeQueue22 tmp = front;
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
