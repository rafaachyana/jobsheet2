package Minggu5;
import java.util.Scanner;
public class Mainsum {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah elemen: ");
    int elemen=sc.nextInt();
    sum sm=new sum(elemen);
    for (int i=0;i<elemen;i++){
        System.out.print("Masukan keuntungan ke-"+(i+1)+": ");
        sm.keuntungan[i]=sc.nextDouble();
        int basis=sc.nextInt();
        System.out.print("Masukan nilai pangkat elemen ke-"+(i+1)+":");
    }
    System.out.println("TOTAL KEUNTUNGAN MENGGUNAKAN BRUTEFIRCE: "+sm.totalBF());
    System.out.println("TOTAL KEUNTUNGAN MENGGUNAKAN DIVIDE AND CONQUER: "+sm.totalDC(sm.keuntungan, 0, elemen-1));
    sc.close();
    }
}
