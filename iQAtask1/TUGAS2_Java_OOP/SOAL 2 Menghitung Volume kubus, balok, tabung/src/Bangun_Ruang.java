import java.util.Scanner;
public class Bangun_Ruang {
    public static void main(String[] args) {
        HITUNG math = new HITUNG();
        int memilih, cek;
        Scanner input = new Scanner(System.in);
        String[] pilihan = {"Volume Kubus","Volume Balok","Volume Tabung"};
        String[] mengulang = {"Ya", "Tidak"};

        do {
            System.out.println("Pilih salah satu :");
            for (int j = 0; j < pilihan.length; j++) {
                System.out.printf("Masukkan %d untuk %s\n", j + 1, pilihan[j]);
            }
            System.out.println("Pilihan Saya : ");
            memilih = input.nextInt();
            switch (memilih) {
                case 1:
                    math.Kubus();
                    break;
                case 2:
                    math.Balok();
                    break;
                case 3:
                    math.Tabung();
                    break;
                default:
                    System.out.println("Pilih sesuai pilihan yang ada.");
            }
            System.out.println("Apakah anda ingin menentukan rumus yang lain?");
            for (int m = 0; m < mengulang.length; m++) {
                System.out.printf("%d untuk %s\n", m + 1, mengulang[m]);
            }
            cek = input.nextInt();
        } while (cek != 2);
    }
}

/*
Input :                            Output :
Volume                             Volume
Kubus (10)                         Kubus : 1000
Balok (3,6,10)                     Balok : 180
Tabung (7,10)                      Tabung : 1540
 */