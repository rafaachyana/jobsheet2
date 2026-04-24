package Jobsheet9;

public class StackTugasMahasiswa22 {
    Mahasiswa22[] stack;
    int top;
    int size;
    public StackTugasMahasiswa22(int size){
        this.size=size;
        stack= new Mahasiswa22[size];
        top=-1;
    }
    public boolean isFull(){
        if(top==size-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpthy(){
        if(top==size-1){
            return true;
        }else{
            return false;
        }
    }
    public void push(Mahasiswa22 mhs){
        if(isFull()){
            top++;
            stack[top]=mhs;
        }else{
            System.out.println("Stacl penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    public Mahasiswa22 pop(){
        if(!isEmpthy()){
            Mahasiswa22 m=stack[top];
            top--;
            return m;
        }else{
            System.out.println("STack kosoong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    public Mahasiswa22 peek(){
        if(!isEmpthy()){
            return stack[top];
        }else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    public void print(){
        for(int i=0; i<=top; i++){
            System.out.println(stack[i].nama+ "\t"+stack[i].nim+"\t"+stack[i].kelas);
        }
        System.out.println("");
    }
}
