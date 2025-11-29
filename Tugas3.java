import java.util.Scanner;

public class Tugas3{
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    double[] gaji={5000000, 6500000, 9500000};
    double[] lembur={0.30, 0.32, 0.34, 0.36, 0.38};

    System.out.println("Masukan Golongan (A/B/C): ");
    char Golongan=input.next(). toUpperCase().charAt(0);

    double gajipokok=0;

    boolean golonganValid=true;
    if (Golongan== 'A'){
        gajipokok=gaji[0];
    }else if (Golongan=='B'){
        gajipokok=gaji[1];
    }else if(Golongan=='C'){
        gajipokok=gaji[2];
    }else{
        golonganValid=false;
        System.out.println("Golongan Tidak Valid.");
    }
    if(golonganValid){
        System.out.println("Masukan Jam Lembur: ");
        int JamLembur=input.nextInt();

    double gajilembur=0;

    if(JamLembur==0){
        gajilembur=gajipokok *0; // tidak lembur
    }else if(JamLembur>0 && JamLembur<=5){
        gajilembur=gajipokok * lembur[JamLembur-1];
    }else if(JamLembur>5){
        gajilembur=gajipokok * lembur[4]; //lembur lebih dari 5 jam
    }else if(JamLembur<0){
        System.out.println("Jam Lembur Tidak Valid."); //diluar jam lembur yang tertera
    }
    double totalpenghasilan=gajipokok+gajilembur;
    System.out.println("Total Penghasilan Rp. " + totalpenghasilan);
    }
    input.close();
}
}