import java.util.Scanner;
public class Bangun_Datar {
    public static void main(String[] args) {
        int memilih;
        Scanner input = new Scanner(System.in);
        String[] pilihan = {"Persegi", "Segitiga", "Persegi Panjang"};
        Persegi Ps = new Persegi();
        Persegipanjang PP = new Persegipanjang();
        Segitiga ST = new Segitiga();
        System.out.println("===========MENU===========");

        {
            System.out.println("Pilih salah satu :");
            for (int j = 0; j < pilihan.length; j++) {
                System.out.printf("Masukkan %d untuk %s\n", j + 1, pilihan[j]);
            }
            System.out.println("Pilihan Saya : ");
            memilih = input.nextInt();
            switch (memilih) {
                case 1:
                    Ps.persegi();
                    break;
                case 2:
                    ST.segitiga();
                    break;
                case 3:
                    PP.persegipanjang();
                    break;
            }
            input.close();

        }
    }
 }

/*

Input :                            Output :
Luas                               Luas
Persegi (4)                        Persegi : 16
Segitiga (3,4)                     Segitiga : 6
Persegi Panjang (7,8)              Persegi Panjang : 56

Keliling                           Keliling
Persegi (4)                        Persegi : 16
Segitiga (3,4)                     Segitiga : 11
Persegi Panjang (7,8)              Persegi Panjang : 30

 */