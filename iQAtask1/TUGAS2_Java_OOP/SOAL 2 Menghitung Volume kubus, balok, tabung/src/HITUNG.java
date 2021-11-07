import java.util.Scanner;
public class HITUNG {
        Scanner key = new Scanner(System.in);
        int p, l, t, hasil, s;
        double volTabung, r, ti;
        final double phi = 3.14;

        void Kubus() {
            System.out.println("Masukkan nilai sisi : ");
            s = key.nextInt();
            hasil = s * s * s;
            System.out.println("HASILNYA adalah : " + hasil + " cm kubik");
        }
        void Balok() {
            System.out.println("Masukkan nilai panjang : ");
            p = key.nextInt();
            System.out.println("Masukkan nilai lebar : ");
            l = key.nextInt();
            System.out.println("Masukkan nilai tinggi : ");
            t = key.nextInt();

            hasil = p * l * t;
            System.out.println("HASILNYA adalah : " + hasil + " cm kubik");
        }
        void Tabung() {
            System.out.println("Masukkan nilai diameter : ");
            r = key.nextDouble();
            System.out.println("Masukkan nilai tinggi : ");
            ti = key.nextDouble();

            volTabung = (phi * (r) * (r)) * ti;
            System.out.println("HASILNYA adalah : " + Math.round(volTabung) + " cm kubik");
        }
    }

