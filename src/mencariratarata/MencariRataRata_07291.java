
package mencariratarata;

import java.util.Scanner;


public class MencariRataRata_07291 {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        int i_07291 = 0, j_07291=1, jumlah_07291=0;
        double rata_07291;
        System.out.print("Masukkan Jumlah mata kuliah : ");
        input = scanner.nextInt();
        String [] nama = new String[input];
        double [] nilai = new double[input];

        do{
            System.out.print("Masukkan Nama Mata Kuliah ke -" +j_07291+ " : ");
            scanner.nextLine();
            nama[i_07291] = scanner.nextLine();
            System.out.print("Masukkan Nilai Mata Kuliah ke -"+j_07291+ " : ");
            nilai[i_07291] = scanner.nextInt();
            jumlah_07291 += nilai[i_07291];
            i_07291++;
            j_07291++;
        }while (i_07291 < input);


        rata_07291 = jumlah_07291/input;

        System.out.println("Nilai Rata-rata : "+rata_07291);

        if(rata_07291 >=71){
            System.out.println("Keterangan : LULUS");
        }else {
            System.out.println("Keterangan : GUGUR");
        }


    }
}
