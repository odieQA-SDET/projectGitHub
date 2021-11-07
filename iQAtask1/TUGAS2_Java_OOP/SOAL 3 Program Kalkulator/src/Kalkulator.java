import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
        int hasil, pilihan, angka1, angka2;
        String[] P = {"PENJUMLAHAN", "PENGURANGAN", "PERKALIAN", "PEMBAGIAN"};
        Scanner input = new Scanner(System.in);
        System.out.println("Kalkulator Sederhana PUNYA ODIE");
        System.out.println("===============================");
        {
            System.out.println("Pilih salah satu :");
            for (int j = 0; j < P.length; j++) {
                System.out.printf("Pilihan %d untuk %s\n", j + 1, P[j]);
            }
            System.out.println("Pilihan Saya : ");
            pilihan = input.nextInt();

            System.out.println("SILAHKAN INPUT Bilangan Pertama => : ");
            angka1 = input.nextInt();

            System.out.println("SILAHKAN INPUT Bilangan Kedua : ");
            angka2 = input.nextInt();

            if (pilihan == 1) {
                hasil = angka1 + angka2;
                System.out.println("Hasil Penjumlahan: " + hasil);
            } else if (pilihan == 2) {
                hasil = angka1 - angka2;
                System.out.println("Hasil Pengurangan: " + hasil);
            } else if (pilihan == 3) {
                hasil = angka1 * angka2;
                System.out.println("Hasil Perkalian: " + hasil);
            } else if (pilihan == 4) {
                hasil = angka1 / angka2;
                System.out.println("Hasil Pembagian: " + hasil);
            } else {
                System.out.println("PAYAH Lu Bro!, Pilihan OPERATOR TIDAK ADA");
            }
        }
    }
}

/*
Input :                            Output :
        Penjumlahan (3,4)                  Penjumlahan : 7
        Pengurangan (15,4)                 Pengurangan : 11
        Perkalian (10,10)                  Perkalian : 100
        Pembagian (12,3)                   Pembagian : 4
*/



