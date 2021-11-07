import java.util.Scanner;
public class Ongkir {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);
        String[] pilihan = {"Padang","Bekasi","JakSel"};

        Padang Pdg = new Padang();
        Bekasi Bks = new Bekasi();
        JakSel Jks = new JakSel();

        System.out.println("===========MENU===========");
        {
            System.out.println("Pilih Tujuan Kota :");
            for (int j = 0; j < pilihan.length; j++) {
                System.out.printf("Pilih %d untuk %s\n", j + 1, pilihan[j]);
            }
            System.out.println("Pilihan Pengirim : ");
            angka = input.nextInt();

            switch (angka) {
                case 1:
                    Pdg.padang();
                    break;
                case 2:
                    Bks.bekasi();
                    break;
                case 3:
                    Jks.jakSel();
                    break;
            }
            input.close();
        }
    }
}
/*
Input :                   Output :
Panjang = 5               Harga : Rp 5000
Lebar = 2
Tinggi = 4
Berat = 1 kg
 */
