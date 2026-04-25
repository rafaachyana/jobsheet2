package Jobsheet9;

public class StackSurat22 {
    Surat22[] stack;
    int size;
    int top;
    public StackSurat22(int size){
        this.size=size;
        stack=new Surat22[size];
        top=-1;
    }
    public boolean isFull(){
        return top==size-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(Surat22 surat) {
        if (!isFull()) {
            top++;
            stack[top]=surat;
        }else{
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }
    public Surat22 pop(){
        if (!isEmpty()){
            Surat22 s=stack[top];
            top--;
            return s;
        }else{
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }
    public Surat22 peek() {
        if (!isEmpty()){
            return stack[top];
        }else{
            System.out.println("Stack kosong! Tidak ada surat yang masuk.");
            return null;
        }
    }
    public int count(){
        return top+1;
    }
    public void cariSurat(String namaMahasiswa){
        boolean found=false;
        for (int i=0; i<=top; i++){
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)){
                if (!found){
                    System.out.println("Surat ditemukan atas nama: "+namaMahasiswa);
                    found=true;
                }
                String jenis = (stack[i].jenisIzin=='S'||stack[i].jenisIzin=='s')?"Sakit":"Izin";
                System.out.println("ID Surat: "+stack[i].idSurat);
                System.out.println("Nama: "+stack[i].namaMahasiswa);
                System.out.println("Kelas: "+stack[i].kelas);
                System.out.println("Jenis Izin: "+jenis);
                System.out.println("Durasi: "+stack[i].durasi+" hari");
                System.out.println("----------------------------");
            }
        }
        if (!found){
            System.out.println("Surat atas nama \""+namaMahasiswa+"\" tidak ditemukan.");
        }
    }
    public void print(){
        if (isEmpty()){
            System.out.println("Tidak ada surat dalam stack.");
            return;
        }
        System.out.println("Daftar Surat Izin:");
        System.out.println("----------------------------");
        for (int i=top; i>=0; i--) {
            String jenis = (stack[i].jenisIzin=='S'||stack[i].jenisIzin=='s')?"Sakit":"Izin";
            System.out.println("ID Surat: "+stack[i].idSurat);
            System.out.println("Nama: "+stack[i].namaMahasiswa);
            System.out.println("Kelas: "+stack[i].kelas);
            System.out.println("Jenis Izin: "+jenis);
            System.out.println("Durasi: "+stack[i].durasi+" hari");
            System.out.println("----------------------------");
        }
    }
}