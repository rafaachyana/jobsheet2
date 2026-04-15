package Jobsheet5;
public class MahasiswaBerprestasi22 {
        Mahasiswa22[] listMhs=new Mahasiswa22[5];
        int idx;
    void tambah (Mahasiswa22 m){
        if (idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("data sudah penuh");
        }
    }
    void tampil(){
        for (Mahasiswa22 m:listMhs){
            m.tampilInformasi();
            System.out.println("------------------------");
        }
    }
    void bubbleSort(){
        for (int i=0; i<listMhs.length-1; i++){
            for (int j=1; j<listMhs.length-i; j++){
                if(listMhs[j].ipk>listMhs[j-1].ipk){
                    Mahasiswa22 tmp=listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }
    void SelectionSort(){
        for (int i=0; i<listMhs.length-1; i++){
            int idxmin=i;
            for (int j=i+1; j<listMhs.length; j++){
                if (listMhs[j].ipk<listMhs[idxmin].ipk){
                    idxmin=j;
                }
            }
            Mahasiswa22 tmp=listMhs[idxmin];
            listMhs[idxmin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }
    void insertionSort(){
        for (int i=1; i<listMhs.length; i++){
            Mahasiswa22 temp=listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk>temp.ipk){
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }
    void insertionSortDescending(){
        for (int i=1; i<listMhs.length; i++){
            Mahasiswa22 temp=listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk<temp.ipk){
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
