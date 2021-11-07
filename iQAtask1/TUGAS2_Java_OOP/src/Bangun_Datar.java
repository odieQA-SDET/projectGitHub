import java.util.Scanner;

public class Bangun_Datar {
    public static void main(String[] args) {
        int angka;
        Persegi Ps = new Persegi();
        Persegipanjang PP = new Persegipanjang();
        Segitiga ST = new Segitiga();
        Scanner input = new Scanner(System.in);
        System.out.println("=======MENU=======");
        System.out.println("==================");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi Panjang");
        System.out.println("Pilihan Saya : ");
        angka = input.nextInt();

        switch (angka) {
            case 1 : Ps.persegi();break;
            case 2 : ST.segitiga();break;
            case 3 : PP.persegipanjang();break;
        }
        input.close();
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
